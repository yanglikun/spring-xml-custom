package com.github.yanglikun.custom.simpledefinition;

import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.w3c.dom.Element;

/**
 * AbstractSimpleBeanDefinitionParser可以用于xml属性和要创建的Bean的属性之间简单映射
 */
public class PersonSimpleBeanDefinitionParser extends AbstractSimpleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return Person.class;
    }
}
