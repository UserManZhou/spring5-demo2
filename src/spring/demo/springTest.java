package spring.demo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;
import spring.autowrite.AutoUser;
import spring.bean.Orbers;
import spring.entity.Numbers;
import spring.factoryBean.MyBean;

public class springTest {

    @Test
    public void test(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Numbers number = (Numbers) applicationContext.getBean("number");

        System.out.println(number.toString());
    }

    @Test
    public void test2(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Numbers number = (Numbers) applicationContext.getBean("number");

        System.out.println(number.getList().toString());
    }

    @Test
    public void test3(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Numbers number = (Numbers) applicationContext.getBean("number");

        System.out.println(number.getMap().get("nihao"));
    }

    @Test
    public void test4(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Numbers number = (Numbers) applicationContext.getBean("number");
        Numbers number2 = (Numbers) applicationContext.getBean("number");
        System.out.println(number.toString());
        System.out.println(number2.toString());
    }

    @Test
    public void test5(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application2.xml");

        MyBean myBean = (MyBean) applicationContext.getBean("mybean");

        System.out.println(myBean.toString());
    }

    @Test
    public void test6(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application3.xml");

        Orbers orbers = (Orbers) applicationContext.getBean("order");

        System.out.println(orbers);

        ((ClassPathXmlApplicationContext)applicationContext).close();


    }

    @Test
    public void test7(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application3.xml");

        AutoUser autoUser = (AutoUser) applicationContext.getBean("autouser");

        System.out.println(autoUser);



    }

}
