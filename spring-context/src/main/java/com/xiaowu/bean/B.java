package com.xiaowu.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/3
 * @email 1005999259@qq.com
 */
@Service
public class B {
	@Autowired
	private A a;
}
