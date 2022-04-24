package com.xiaowu.event;


import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/29
 * @email 1005999259@qq.com
 */
@Component
public class FinishedEvent implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("event = " + event);
	}
}
