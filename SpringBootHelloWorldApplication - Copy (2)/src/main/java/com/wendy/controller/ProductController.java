package com.wendy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.wendy.model.Product;
import com.wendy.model.ProductCategory;
import com.wendy.model.Tutorial;
import com.wendy.repository.ProductCategoryRepository;
import com.wendy.repository.ProductRepository;
import com.wendy.repository.TutorialRepository;
import com.wendy.service.ProductCategoryService;
import com.wendy.service.ProductService;
import com.wendy.service.TutorialService;

@Controller
@RequestMapping("/Product")
public class ProductController {
	
	@Autowired
	ProductRepository productRespository;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductCategoryRepository productCategoryRespository;
	
	@Autowired
	ProductCategoryService productCategoryService;

	@RequestMapping("/")
	public String getList(Model model) {
		try {
			List<Product> products = productService.getAllProduct();
			System.out.println(products);
			if(products.isEmpty()) {}
			else {
				model.addAttribute("products", products);
			}
		} catch (Exception ex)
		{}
		return "adminLogin";
	}
	
	@GetMapping("/new")
	public String saveProduct(Model model) {
		model.addAttribute("product", new Product());
		return "saveProduct";
	}
	
    @PostMapping("/new")
    public RedirectView addProduct(@ModelAttribute("product") Product product, RedirectAttributes redirectAttributes) {
        System.out.println(product);
    	final RedirectView redirectView = new RedirectView("/Product/new", true);
        Product savedProduct = productService.addProduct(product);
        System.out.println(savedProduct);
        redirectAttributes.addFlashAttribute("savedProduct", savedProduct);
        redirectAttributes.addFlashAttribute("addProductSuccess", true);
        return redirectView;
    } 
    
    @RequestMapping(value = { "/edit-{Id}" }, method = RequestMethod.GET)
    public String editProduct(@PathVariable Long Id, ModelMap model) {
    	
    	Optional<Product> product = productService.findProductById(Id);
        model.addAttribute("product", product);
        model.addAttribute("edit", true);
        return "saveProduct";
    }
    
    /**
     * This method will delete an user by it's SSOID value.
     */
    @RequestMapping(value = { "/delete-{Id}" }, method = RequestMethod.GET)
    public RedirectView deleteUser(@PathVariable Long Id) {
    	final RedirectView redirectView = new RedirectView("/Product/", true);
    	productService.deleteProductById(Id);
    	return redirectView;
    }
     
    /**
     * This method will be called on form submission, handling POST request for
     * updating user in database. It also validates the user input
     */
    @RequestMapping(value = { "/edit-{Id}" }, method = RequestMethod.POST)
    public String updateProduct(@Validated Product product, BindingResult result,
            ModelMap model, @PathVariable Long Id) {
 
  
    	productService.updateProduct(product);
 
        model.addAttribute("success", "Product  updated successfully");
        return "adminLogin";
    }
 
    
    
    /**
     * This method will provide UserProfile list to views
     */
    @ModelAttribute("ProductCategory")
    public List<ProductCategory> initializeProfiles() {
        return productCategoryService.getAllproductCategory();
    }
    
}
