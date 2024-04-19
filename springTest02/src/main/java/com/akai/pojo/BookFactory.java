package com.akai.pojo;

import org.springframework.beans.factory.FactoryBean;

public class BookFactory implements FactoryBean<Book> {

    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("Java");
        book.setAuthor("akai");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
