package com.xiaowu.service;

import com.xiaowu.annotation.Log;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author guoli
 */
@Service
public class UserServiceImpl {

	@PostConstruct
	public void test() {
		System.out.println("true = " + true);
	}

	@Log
	public String log() {
		return "this is log aspectj";
	}

	public void transactional() {
		System.out.println("transactional");
	}

}
