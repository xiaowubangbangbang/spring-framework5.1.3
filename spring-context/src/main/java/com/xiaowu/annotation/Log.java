package com.xiaowu.annotation;

import java.lang.annotation.*;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/15
 * @email 1005999259@qq.com
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
}
