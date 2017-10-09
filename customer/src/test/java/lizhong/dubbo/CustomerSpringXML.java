package lizhong.dubbo;

import lizhong.manager.TManager;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerSpringXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-customer.xml");
        TManager tManager = (TManager)applicationContext.getBean("tManager");
        System.out.println("-----------"+tManager.sum(1,2));
    }
}
