import com.hand.dao.UserDaoImpl;
import com.hand.dao.UserDaoMysqlImpl;
import com.hand.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 17:06
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        //拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //需要什么，直接拿什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
