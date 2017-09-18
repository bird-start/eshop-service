package eshop.user.biz;

import eshop.user.dal.dao.model.UserUser;

/**
 *
 */
public interface UserBiz {
    
    public UserUser selectUserById(String userId);
}
