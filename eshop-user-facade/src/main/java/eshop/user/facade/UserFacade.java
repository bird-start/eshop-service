package eshop.user.facade;

import eshop.user.pojo.UserPojo;
import org.springframework.stereotype.Component;


public interface UserFacade {
    
    public UserPojo selectUserById(String userId);


    
}
