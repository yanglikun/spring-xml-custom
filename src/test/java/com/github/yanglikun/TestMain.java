package com.github.yanglikun;

import com.alibaba.fastjson.JSON;
import com.github.yanglikun.custom.attr.JCacheInitializer;
import com.github.yanglikun.custom.nesttag.Component;
import com.github.yanglikun.custom.simpledefinition.Person;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain {

    private ApplicationContext ctx;

    @Before
    public void init() {
        ctx = new ClassPathXmlApplicationContext("spring-config-xml.xml");
    }

    @Test
    public void testSimpleDateFormat() {
        SimpleDateFormat df = ctx.getBean("ylkDateFormat", SimpleDateFormat.class);
        String format = df.format(new Date());
        System.out.println("format:" + format);
    }

    @Test
    public void testPerson() {
        Person person = ctx.getBean("personId", Person.class);
        System.out.println("name:" + person.getUserName());
        System.out.println("age:" + person.getAge());
        System.out.println("string:" + person.getString());
    }

    @Test
    public void testCustomComponent() {
        Component component = ctx.getBean("customComponent", Component.class);
        System.out.println(JSON.toJSONString(component));
    }

    @Test
    public void testCustomAttr() {
        String customAttr = ctx.getBean("customAttr", String.class);
        System.out.println("customAttr:" + customAttr);
        JCacheInitializer bean = ctx.getBean("cacheName-initializer", JCacheInitializer.class);
        System.out.println(bean.getName());
    }

}
