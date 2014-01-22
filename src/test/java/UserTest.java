import com.inspur.oa.user.mapper.UsersMapper;
import com.inspur.oa.user.service.IUserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * User: zhangpengwei
 * Date: 13-11-27
 * Time: 上午11:09
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml","classpath:dispatcher.xml","classpath:mybatis-config.xml"})
public class UserTest{

    @Autowired
    private IUserService userService;

    @Autowired
    private UsersMapper usersMapper;

    @Test
    public void getAllUsersTest() throws Exception {

        System.out.print("测试用例运行.........");
        Assert.assertEquals(2, usersMapper.findCount());
        Assert.assertEquals(6, userService.getAllUsers().size());
    }
}
