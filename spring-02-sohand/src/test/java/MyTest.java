import com.hand.pojo.Hand;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author L-ludongpeng
 * @Date 2020/12/1 18:02
 * @Description
 */
public class MyTest {
    public static void main(String[] args) {
        //解析beans.xml文件 , 生成管理相应的Bean对象
        //获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象现在都在spring中管理，要使用，直接去里面取出来即可
        Hand hand = (Hand) context.getBean("hand");
        System.out.println(hand.toString());
    }
}
