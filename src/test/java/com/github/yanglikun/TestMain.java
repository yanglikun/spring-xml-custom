package com.github.yanglikun;

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


}
