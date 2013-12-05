package com.thoughtworks.yafei;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextSpringTen.xml");
        SuperMarket supermarket = (SuperMarket) context.getBean("supermarket");
        System.out.println(supermarket.toString());
    }
}
