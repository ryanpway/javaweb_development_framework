package com.inspur.oa.user.service;

import com.inspur.oa.user.domain.User;
import com.inspur.oa.user.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 上午9:43
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    @Transactional
    public List<User> getAllUsers() {

        return usersMapper.queryUser();

    }

}
