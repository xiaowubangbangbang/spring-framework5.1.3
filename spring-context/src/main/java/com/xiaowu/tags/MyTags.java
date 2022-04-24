package com.xiaowu.tags;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.stereotype.Component;
import org.w3c.dom.Element;

/**
 * @author xiaowu
 * @description
 * @date 2021/11/30
 * @email 1005999259@qq.com
 */
public class MyTags extends NamespaceHandlerSupport {
	/**
	 * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after
	 * construction but before any custom elements are parsed.
	 *
	 * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
	 */
	@Override
	public void init() {
		registerBeanDefinitionParser("my-tags", new MyBeanDefinitionParser());
	}

}

class MyBeanDefinitionParser implements BeanDefinitionParser {

	/**
	 * Parse the specified {@link Element} and register the resulting
	 * {@link BeanDefinition BeanDefinition(s)} with the
	 * {@link ParserContext#getRegistry() BeanDefinitionRegistry}
	 * embedded in the supplied {@link ParserContext}.
	 * <p>Implementations must return the primary {@link BeanDefinition} that results
	 * from the parse if they will ever be used in a nested fashion (for example as
	 * an inner tag in a {@code <property/>} tag). Implementations may return
	 * {@code null} if they will <strong>not</strong> be used in a nested fashion.
	 *
	 * @param element       the element that is to be parsed into one or more {@link BeanDefinition BeanDefinitions}
	 * @param parserContext the object encapsulating the current state of the parsing process;
	 *                      provides access to a {@link BeanDefinitionRegistry}
	 * @return the primary {@link BeanDefinition}
	 */
	@Override
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		return null;
	}
}