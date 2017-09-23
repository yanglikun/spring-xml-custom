package com.github.yanglikun.simple;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class SimpleNamespaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("dateformat", new SimpleDateFormatBeanDefinitionParser());
    }
}
