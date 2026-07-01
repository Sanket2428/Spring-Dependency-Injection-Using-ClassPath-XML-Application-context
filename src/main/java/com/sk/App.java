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
        service.doPayment(1000);
    }
}
