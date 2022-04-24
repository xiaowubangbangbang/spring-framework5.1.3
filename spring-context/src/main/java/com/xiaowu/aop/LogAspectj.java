package com.xiaowu.aop;

import com.xiaowu.annotation.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/15
 * @email 1005999259@qq.com
 */
@Component
@Aspect
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
public class LogAspectj {
	/**
	 * 处理完请求后执行
	 *
	 * @param joinPoint 切点
	 */
	@AfterReturning(pointcut = "@annotation(controllerLog)", returning = "jsonResult")
	public void doAfterReturning(JoinPoint joinPoint, Log controllerLog, Object jsonResult) {
		//handleLog(joinPoint, controllerLog, null, jsonResult);
		System.out.println("joinPoint = " + joinPoint);
	}

	@Around(value = "@annotation(controllerLog)")
	public Object around(ProceedingJoinPoint pjp, Log controllerLog) throws Throwable {
		return pjp.proceed();
	}
}
