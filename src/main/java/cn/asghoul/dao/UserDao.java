package cn.asghoul.dao;

import cn.asghoul.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created by chengwang on 2017/12/26.
 */
public interface UserDao {

    List<User> selectUser(Map<String,Object> map);
}
