package com.example.demo.db05.jdbc;

import com.example.demo.db05.jdbc.ds.AoOrder;
import com.example.demo.db05.jdbc.ds.DynamicDataSource;
import com.example.demo.db05.jdbc.ds.IAoOrderMapper;
import com.example.demo.fx04.spring01.User;
import com.example.demo.fx04.spring02.UserConfig;
import com.example.demo.fx04.spring02.UserOrdinary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TestDemo {


    // 在静态方法中使用@Autowired注入的实例对象
//    private static UserOrdinary userOrdinary;
//    @Autowired
//    public void setUserOrdinary(UserOrdinary userOrdinary){
//        TestDemo.userOrdinary = userOrdinary;
//    }

    private static IAoOrderMapper aoOrderMapper;
    @Resource
    public void setIAoOrderMapper(IAoOrderMapper aoOrderMapper){
        TestDemo.aoOrderMapper = aoOrderMapper;
    }
//    private IAoOrderMapper aoOrderMapper;

    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //数据库框架版本2.0
        AoOrder aoOrder = new AoOrder();
        aoOrder.setAddress("中山大道西");
        aoOrderMapper.insert(aoOrder);


//        Student student123 = context.getBean(Student.class);
        
//        Student student123 = (Student) context.getBean("student123");
//        System.out.println(student123.toString());
//
//        student123.print();
//
//        Student student100 = (Student) context.getBean("student100");
//        System.out.println(student100.toString());
//
//        student100.print();
//
//        Klass class1 = context.getBean(Klass.class);
//        System.out.println(class1);
//        System.out.println("Klass对象AOP代理后的实际类型："+class1.getClass());
//        System.out.println("Klass对象AOP代理后的实际类型是否是Klass子类："+(class1 instanceof Klass));
//
////        ISchool school = context.getBean(ISchool.class);
////        System.out.println(school);
////        System.out.println("ISchool接口的对象AOP代理后的实际类型："+school.getClass());
//
//        ISchool school1 = context.getBean(ISchool.class);
//        System.out.println(school1);
//        System.out.println("ISchool接口的对象AOP代理后的实际类型："+school1.getClass());
//
//        school1.ding();
//
//        class1.dong();
//
//        System.out.println("   context.getBeanDefinitionNames() ===>> "+ String.join(",", context.getBeanDefinitionNames()));
//
//        Student s101 = (Student) context.getBean("s101");
//        if (s101 != null) {
//            System.out.println(s101);
//        }
//        Student s102 = (Student) context.getBean("s102");
//        if (s102 != null) {
//            System.out.println(s102);
//        }

        //1、基于xml注解装配
//        User user1 = (User) context.getBean("user1");
//        System.out.println(user1.toString());
//        //2、基于注解装配.要开启<context:component-scan base-package="com.example.demo.fx04.spring02" />
//        System.out.println(userOrdinary.toString());
//        //3、基于java类装配,使用@Configuration注解需要作为配置的类
//        //使用AnnotationConfigApplicationContext注册配置类
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(UserConfig.class);
//        System.out.println(ctx.getBean("message"));

//        String[] map = ArrayUtil.map(new Long[]{Long.valueOf(4521), Long.valueOf(43432)}, String.class, x -> String.valueOf(x));
//        for (String s : map) {
//            System.out.println(s);
//        }
//        System.out.println("------------------------------");
    }
}
