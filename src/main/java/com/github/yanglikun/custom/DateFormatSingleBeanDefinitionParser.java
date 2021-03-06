package com.github.yanglikun.custom;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import java.text.SimpleDateFormat;

/**
 * 适用于通过构造函数构建bean
 */
public class DateFormatSingleBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class<?> getBeanClass(Element element) {
        return SimpleDateFormat.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder beanBuilder) {
        // pattern在xsd中是可选的
        String pattern = element.getAttribute("pattern");
        beanBuilder.addConstructorArgValue(pattern);

        // lenient在xsd中是可选的
        String lenient = element.getAttribute("lenient");
        if (StringUtils.hasText(lenient)) {
            beanBuilder.addPropertyValue("lenient", Boolean.valueOf(lenient));
        }
    }
}
