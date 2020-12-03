import com.hand.service.UserService;
import com.hand.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/3 15:10
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //动态代理的是接口
        UserService userService = (UserService) context.getBean("userService");

        userService.select();
    }
}
