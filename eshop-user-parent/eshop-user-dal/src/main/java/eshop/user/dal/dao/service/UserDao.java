package eshop.user.dal.dao.service;

import eshop.user.dal.dao.model.UserUser;

import javax.jws.soap.SOAPBinding;

public interface UserDao {

       public UserUser selectUserById(String userId);

}
