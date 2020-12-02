## 注解说明
@Resource(name = "cat1")
    自动装配，默认通过byName方式实现，如果找不到名字，
    则通过byType java自带的注解，指定配置文件中的对象，
    beanid，类型必须一致
    
@Autowired 
    自动装配，通过byName的方式实现
    如果Autowired不能唯一了，则需要@Qualifier
@Qualifier(value = "dogNew")
    和@Autowired搭配使用，指定配置文件中的对象，
    beanid，类型必须一致
    
@Nullable
    字段标记了这个注解，则这个字段可以为null

@Configuration
    这是一个配置类，就是beans.xml
    这个也会被spring接管，注册到容器中，
    因为它本来就是@Component，
    
@ComponentScan("com.hand.pojo")
    显示扫描
    
@Import({HandConfig2.class})    
    合并另一个配置文件
    
@Bean
    注册一个bean，相当于bean标签
    方法的名字，就是bean标签中的id
    返回值就相当于bean标签中的class

@Component
    组件，放在类上，说明这个类被spring管理了，就是<bean/>
    
@Component衍生出的注解：
dao层： @Repository
service层：@Service
controller层：@Controller
这四个注解的功能都一样的，都是将某个类注册到spring中，装配bean

@Value("帅神")  
    相当于 <property name="name" value="真帅呀"/>
    
@Scope("singleton")
    作用域： singleton
            prototype