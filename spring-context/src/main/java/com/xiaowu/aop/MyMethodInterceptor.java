package com.xiaowu.aop;

import com.xiaowu.annotation.Log;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.Advisor;
import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/16
 * @email 1005999259@qq.com
 */
//@Component
public class MyMethodInterceptor implements MethodInterceptor {
	/**
	 * Implement this method to perform extra treatments before and
	 * after the invocation. Polite implementations would certainly
	 * like to invoke {@link Joinpoint#proceed()}.
	 *
	 * @param invocation the method invocation joinpoint
	 * @return the result of the call to {@link Joinpoint#proceed()};
	 * might be intercepted by the interceptor
	 * @throws Throwable if the interceptors or the target object
	 *                   throws an exception
	 */
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("invocation = " + invocation);
		return invocation.proceed();
	}

	@Bean
	public AbstractAutoProxyCreator setInterceptor(AbstractAutoProxyCreator creator) {
		creator.setInterceptorNames("myMethodInterceptor");
		return creator;
	}


}

