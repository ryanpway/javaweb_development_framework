package com.inspur.oa.user.mapper;

import com.inspur.oa.user.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 上午9:20
 */
@Repository
public interface UsersMapper {


    public List<User> queryUser();

    public int findCount();
}
