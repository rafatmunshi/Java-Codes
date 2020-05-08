package com.demo.BeanLIfeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Project implements BeanNameAware,ApplicationContextAware,BeanPostProcessor{

	public void setBeanName(String arg0) {
		System.out.println("Set bean name method call");
		
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		System.out.println("set application context method");
	}

	public void init() throws Exception {
		System.out.println("after property. set method");
		
	}

	public void destroy() throws Exception {
		System.out.println("Methode destroy is called");
		
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	    System.out.println("BeforeInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	}

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		 System.out.println("AfterInitialization : " + beanName);
	      return bean;  // you can return any other object as well
	}

}