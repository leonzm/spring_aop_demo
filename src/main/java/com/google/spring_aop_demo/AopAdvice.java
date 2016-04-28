package com.google.spring_aop_demo;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/***
 * 切面
 */
public class AopAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("before mothod");
	}
}
