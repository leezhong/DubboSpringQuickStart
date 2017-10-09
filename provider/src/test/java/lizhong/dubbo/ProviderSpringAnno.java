package lizhong.dubbo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderSpringAnno {

    public static void main(String[] args) {

        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider-anno.xml");
            context.start();
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
