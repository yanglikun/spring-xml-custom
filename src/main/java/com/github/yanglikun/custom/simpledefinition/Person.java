package com.github.yanglikun.custom.simpledefinition;

import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean {

    private String userName;

    private int age;

    private String string;

    public void afterPropertiesSet() throws Exception {
        //可以根据属性连接数据库，等等
        this.string = "【" + userName + ":" + age + "】";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
