import com.hand.dao.UserMapper;
import com.hand.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/4 11:03
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);

        List<User> userList = userMapper.selectUser();

        for (User user : userList) {
            System.out.println(user);
        }
    }
}
