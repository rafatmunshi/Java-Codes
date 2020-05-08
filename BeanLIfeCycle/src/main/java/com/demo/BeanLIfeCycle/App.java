package com.demo.BeanLIfeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Project project =(Project) context.getBean("project");
        context.registerShutdownHook();
    }
}
