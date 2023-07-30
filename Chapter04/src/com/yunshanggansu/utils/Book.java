package com.yunshanggansu.utils;

import java.util.Objects;

/**
 * ClassName:Book
 * Package"com.yunshanggansu.utils
 * Description:
 *
 * @Author:zhaolei
 * @Create 2023/7/20 16:49
 * @Version 1.0
 */
public class Book {
    private int sheet;
    private String name;
    private double price;

    public int getSheet() {
        return sheet;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setSheet(int sheet) {
        this.sheet = sheet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;

        return sheet == book.sheet && Double.compare(book.price, price) == 0 && name.equals(book.name);
    }

    public static void main(String[] args) {
         Book b1 = new Book();
         Book b2 = new Book();
         b1.setName("gogogo");
         b2.setName("gogogo1");
        System.out.println(b1.equals(b2));
    }

    public Book() {
    }

    public Book(int sheet, String name, double price) {
        this.sheet = sheet;
        this.name = name;
        this.price = price;
    }
}
