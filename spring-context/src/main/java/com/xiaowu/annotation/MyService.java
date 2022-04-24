package com.xiaowu.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author xiaowu
 * @description
 * @date 2021/11/30
 * @email 1005999259@qq.com
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MyService {
}
