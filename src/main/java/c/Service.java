package c;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Service {
    public static void main(String[] args) {
//        Business business = new Business();
//        business.setDeviceWriter(new FloppyWriter());
//        Business business = new Business(new UsbWriter());
//        business.write();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Business business = (Business) applicationContext.getBean("business");
        business.write();

//        IoC = Inversion of Control  控制反转
    }
}
