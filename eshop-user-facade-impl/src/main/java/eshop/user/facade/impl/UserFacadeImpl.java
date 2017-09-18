package eshop.user.facade.impl;

import eshop.user.biz.UserBiz;
import eshop.user.dal.dao.model.UserUser;
import eshop.user.facade.UserFacade;
import eshop.user.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFacadeImpl implements UserFacade {
    
    @Autowired
    private UserBiz userBiz;
    
    public UserPojo selectUserById(String userId) {
        UserUser user = userBiz.selectUserById(userId);

        UserPojo pojo = new UserPojo();
        pojo.setUserName(pojo.getUserName());

        return pojo;
    }
}
