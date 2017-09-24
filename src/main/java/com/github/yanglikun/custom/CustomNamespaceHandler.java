package com.github.yanglikun.custom;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class CustomNamespaceHandler extends NamespaceHandlerSupport {

    public CustomNamespaceHandler() {
        System.out.println("初始化");
    }

    public void init() {
        registerBeanDefinitionParser("dateformat", new DateFormatSingleBeanDefinitionParser());
    }
}
