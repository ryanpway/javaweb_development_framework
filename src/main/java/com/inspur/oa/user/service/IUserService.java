package com.inspur.oa.user.service;

import com.inspur.oa.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 上午9:38
 */

public interface IUserService {

    public List<User> getAllUsers();
}
