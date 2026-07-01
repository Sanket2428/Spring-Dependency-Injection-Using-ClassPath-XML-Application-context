package com.sk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.err.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Sample.xml");
        PaymentService service = context.getBean(PaymentService.class);
        PaymentService service1 = context.getBean(PaymentService.class);
        System.out.println(service.hashCode()); // 1043208434
        System.out.println(service1.hashCode()); // 1043208434
        
        // both object having same hashcodes due to scope is by default is singleType 
        // if you want to create every time new object then you need to add property as scope = "prototype" while initializing bean
        // then you will get 1043208434  1192171522 two different objects 
        
        
        service.doPayment(1000);
    }
}
