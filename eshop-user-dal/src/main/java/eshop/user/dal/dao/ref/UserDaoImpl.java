package eshop.user.dal.dao.ref;

import eshop.user.dal.dao.mapper.UserUserMapper;
import eshop.user.dal.dao.model.UserUser;
import eshop.user.dal.dao.model.UserUserExample;
import eshop.user.dal.dao.model.UserUserKey;
import eshop.user.dal.dao.service.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserUserMapper userUserMapper;

    public UserUser selectUserById(String userId) {

        UserUserKey userKey = new UserUserKey();
        userKey.setUserid(userId);
        
        UserUser userUser = userUserMapper.selectByPrimaryKey(userKey);
        return userUser;
    }

    public UserUserMapper getUserUserMapper() {
        return userUserMapper;
    }

    public void setUserUserMapper(UserUserMapper userUserMapper) {
        this.userUserMapper = userUserMapper;
    }
}
