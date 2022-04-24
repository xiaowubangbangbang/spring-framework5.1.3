package com.xiaowu.beanDefinitions;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/2
 * @email 1005999259@qq.com
 */
/*@Component*/
public class CanNotAutowiredProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return false;
	}

}

