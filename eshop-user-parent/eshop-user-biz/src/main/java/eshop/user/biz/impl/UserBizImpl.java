package eshop.user.biz.impl;

import eshop.user.biz.UserBiz;
import eshop.user.dal.dao.model.UserUser;
import eshop.user.dal.dao.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserBizImpl implements UserBiz {

    @Autowired
    private UserDao userDao;

    
    public UserUser selectUserById(String userId) {
        return userDao.selectUserById(userId);
    }
}
