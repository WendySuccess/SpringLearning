package com.wendy.dao;

import java.sql.ResultSet;    
import java.sql.SQLException;    
import java.util.List;    
import org.springframework.jdbc.core.BeanPropertyRowMapper;    
import org.springframework.jdbc.core.JdbcTemplate;    
import org.springframework.jdbc.core.RowMapper;    
import com.wendy.models.*;


public class UserDao {
    JdbcTemplate template;    
    
    public void setTemplate(JdbcTemplate template) {    
        this.template = template;    
    }    
    
    public List<User> getUsers(){    
        return template.query("select * from User",new RowMapper<User>(){    
            public User mapRow(ResultSet rs, int row) throws SQLException {    
            	User e=new User();    
                e.setUserId(rs.getInt(1));    
                e.setUserName(rs.getString(2));    
                e.setUserEmail(rs.getString(3));    

                return e;    
            }    
        });    
    }    


}
