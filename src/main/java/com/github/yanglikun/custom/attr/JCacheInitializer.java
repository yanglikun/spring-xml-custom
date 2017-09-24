package com.github.yanglikun.custom.attr;

public class JCacheInitializer {

    private String name;

    public JCacheInitializer(String name) {
        this.name = name;
    }

    public void initialize() {
        // lots of JCache API calls to initialize the named cache...
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}