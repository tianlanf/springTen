package com.thoughtworks.yafei;

public class Product {
    private String name;

    @Override
    public String toString() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
