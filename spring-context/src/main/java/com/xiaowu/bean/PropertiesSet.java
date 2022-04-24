package com.xiaowu.bean;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author xiaowu
 * @description
 * @date 2021/12/6
 * @email 1005999259@qq.com
 */
public class PropertiesSet implements InitializingBean {
	/**
	 * Invoked by the containing {@code BeanFactory} after it has set all bean properties
	 * and satisfied {@link BeanFactoryAware}, {@code ApplicationContextAware} etc.
	 * <p>This method allows the bean instance to perform validation of its overall
	 * configuration and final initialization when all bean properties have been set.
	 *
	 * @throws Exception in the event of misconfiguration (such as failure to set an
	 *                   essential property) or if initialization fails for any other reason
	 */
	@Override
	public void afterPropertiesSet() throws Exception {

	}
}
