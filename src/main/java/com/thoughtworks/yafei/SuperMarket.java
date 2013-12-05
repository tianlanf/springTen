package com.thoughtworks.yafei;

public class SuperMarket {
    private Product product;
    private int size = 0;

    @Override
    public String toString() {
        return "The size of the supermarket is " + size + " and the most popular product is " + product.toString();
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Mandatory
    public void setSize(int size) {
        this.size = size;
    }
}
