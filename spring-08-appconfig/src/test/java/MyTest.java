import com.hand.config.HandConfig;
import com.hand.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/2 17:34
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        //如果完全使用配置类方式做，就通过ApplicationContext上下文来获取容器
        ApplicationContext context = new AnnotationConfigApplicationContext(HandConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
