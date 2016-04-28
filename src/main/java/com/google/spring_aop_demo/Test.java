package com.google.spring_aop_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
		BusiInterface busi = (BusiInterface)app.getBean("busiAop"); //这里写的必须是代理类
		busi.doBusi();
		busi.doBusiTo();
	}

}
