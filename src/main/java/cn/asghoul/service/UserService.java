package cn.asghoul.service;

import cn.asghoul.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by chengwang on 2017/12/26.
 */
public interface UserService {

    List<User> selectUser(Map<String,Object> map);
}
