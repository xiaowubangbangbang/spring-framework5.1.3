package com.xiaowu.tags;

import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.util.Arrays;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/15
 * @email 1005999259@qq.com
 */
public class Test {


	public static void main(String[] args) throws NoSuchMethodException {
		LocalVariableTableParameterNameDiscoverer discoverer = new LocalVariableTableParameterNameDiscoverer();
		String[] mains = discoverer.getParameterNames(Test.class.getMethod("main", String[].class));
		System.out.println("mains = " + Arrays.toString(mains));


	}
}
