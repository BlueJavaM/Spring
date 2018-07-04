package Test;
/*
 *@Author: XieLiang
 *@Date : 2018/6/29
 *@Comment :
 */

import Interfaces.TestInterfaceimpl;
import Service.TestServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {


    @Test
    public void test1(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:spring-ioc.xml");
        TestInterfaceimpl TestInterfaceimpl = (TestInterfaceimpl) applicationContext.getBean("firstInterface");

        System.out.print(TestInterfaceimpl.printWord("Hello SpringIOC"));

    }

    @Test
    public void testSetIOC(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:spring-ioc-setter.xml");
        TestServiceImpl testService = (TestServiceImpl) applicationContext.getBean("TestService");
        testService.save("这是要保存的数据");

    }

    @Test
    public void testConstructorIOC(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath*:spring-ioc-constructor.xml");
        TestServiceImpl testService = (TestServiceImpl) applicationContext.getBean("testService");
        testService.save("这是要保存的数据");
    }
}
