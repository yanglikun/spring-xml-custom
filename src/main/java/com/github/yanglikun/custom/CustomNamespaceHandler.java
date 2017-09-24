package com.github.yanglikun.custom;

import com.github.yanglikun.custom.attr.JCacheInitializingBeanDefinitionDecorator;
import com.github.yanglikun.custom.nesttag.ComponentBeanDefinitionParser;
import com.github.yanglikun.custom.simpledefinition.PersonSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {

    public CustomNamespaceHandler() {
        System.out.println("初始化");
    }

    public void init() {
        registerBeanDefinitionParser("dateformat", new DateFormatSingleBeanDefinitionParser());
        registerBeanDefinitionParser("person", new PersonSimpleBeanDefinitionParser());
        registerBeanDefinitionParser("component", new ComponentBeanDefinitionParser());
        registerBeanDefinitionDecoratorForAttribute("cache-name",new JCacheInitializingBeanDefinitionDecorator());
    }
}
