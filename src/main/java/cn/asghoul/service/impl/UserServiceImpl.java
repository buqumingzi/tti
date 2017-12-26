package cn.asghoul.service.impl;


import cn.asghoul.dao.UserDao;
import cn.asghoul.pojo.User;
import cn.asghoul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chengwang on 2017/12/26.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;


    @Override
    public List<User> selectUser(Map<String, Object> map) {
        return userDao.selectUser(map);
    }
}
