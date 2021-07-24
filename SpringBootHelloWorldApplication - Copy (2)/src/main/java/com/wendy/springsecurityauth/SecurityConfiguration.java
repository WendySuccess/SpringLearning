package com.wendy.springsecurityauth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;  
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;  
import org.springframework.security.config.annotation.web.builders.HttpSecurity;  
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;  

	@Configuration  
	public class SecurityConfiguration extends WebSecurityConfigurerAdapter {  
	
	@Qualifier("userDetailsServiceImpl")
	@Autowired	
	private UserDetailsService userDetailsService;
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
	return new BCryptPasswordEncoder();
	}
	   
	@Override  
	public void configure(HttpSecurity http) throws Exception {  
	    http  
	        .authorizeRequests()  
	        .antMatchers("/resources/**").permitAll()
	      //.antMatchers("/resources/**", "/").permitAll()
	        .anyRequest().authenticated()  
	        .and()  
	        .formLogin()  
	        .and()  
	        .httpBasic()  
	        .and()
	        .logout()
	        .permitAll();
	}

    @Override  
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
    	System.out.println("check pasww");
    	
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//    	String password = "pass";
//		String encodedPassword = passwordEncoder.encode(password);
//		System.out.println();
//		System.out.println("Password is         : " + password);
//		System.out.println("Encoded Password is : " + encodedPassword);
//		System.out.println();
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    	//    	System.out.println("check pasww");
//    	String pass = "pass";
//        auth.inMemoryAuthentication()  
//            .withUser("user")  
//            .password("{noop}" + pass) // Spring Security 5 requires specifying the password storage format  
//            .roles("USER");  
    }  

}
