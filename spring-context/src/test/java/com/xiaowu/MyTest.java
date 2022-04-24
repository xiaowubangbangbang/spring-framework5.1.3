package com.xiaowu;

import com.xiaowu.annotation.MyServiceImpl;
import com.xiaowu.bean.A;
import com.xiaowu.bean.B;
import com.xiaowu.bean.Student;
import com.xiaowu.beanDefinitions.BeanClass;
import com.xiaowu.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;


public class MyTest {


	/**
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.annotation.internalConfigurationAnnotationProcessor
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.annotation.internalAutowiredAnnotationProcessor
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.annotation.internalCommonAnnotationProcessor
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.event.internalEventListenerProcessor
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.event.internalEventListenerFactory
	 * 收集所有 beanName,用于寻找切面= myServiceImpl
	 * 收集所有 beanName,用于寻找切面= logAspectj
	 * 收集所有 beanName,用于寻找切面= a
	 * 收集所有 beanName,用于寻找切面= b
	 * 收集所有 beanName,用于寻找切面= student
	 * 收集所有 beanName,用于寻找切面= beanDefinitionRegister
	 * 收集所有 beanName,用于寻找切面= userServiceImpl
	 * 收集所有 beanName,用于寻找切面= org.springframework.aop.config.internalAutoProxyCreator
	 * 收集所有 beanName,用于寻找切面= beanClass
	 * 收集所有 beanName,用于寻找切面= environment
	 * 收集所有 beanName,用于寻找切面= systemProperties
	 * 收集所有 beanName,用于寻找切面= systemEnvironment
	 * 收集所有 beanName,用于寻找切面= org.springframework.context.annotation.ConfigurationClassPostProcessor.importRegistry
	 * 收集所有 beanName,用于寻找切面= messageSource
	 * 收集所有 beanName,用于寻找切面= applicationEventMulticaster
	 */

	private ApplicationContext applicationContext;


	@Before
	public void before() {
		this.applicationContext = new AnnotationConfigApplicationContext();
		AnnotationConfigApplicationContext applicationContext = (AnnotationConfigApplicationContext) this.applicationContext;
		applicationContext.refresh();
		applicationContext.scan("com.xiaowu");
	}

	@Test
	public void test1() {
		Student student = (Student) applicationContext.getBean("student");
		student.setName("xiaowu");
		System.out.println(((BeanClass) applicationContext.getBean("beanClass")).name);
		System.out.println(((MyServiceImpl) applicationContext.getBean("myServiceImpl")).name);
		UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
		userServiceImpl.test();
		A a = (A) applicationContext.getBean("a");
		B b = (B) applicationContext.getBean("b");
		System.out.println("true = " + true);
		userServiceImpl.log();
	}

	@Test
	public void test2() {
		applicationContext.getBean("userServiceImpl", UserServiceImpl.class).transactional();
		SimpleMetadataReaderFactory simpleMetadataReaderFactory = new SimpleMetadataReaderFactory();
//		SimpleMetadataReaderFactory
//		simpleMetadataReaderFactory.getMetadataReader()
	}
}
