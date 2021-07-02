package com.gdw.service;

import com.gdw.dao.BookMapper;
import com.gdw.pojo.Books;

import java.util.List;

public class BookServiceIml implements BookService {
    //
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBooksById(int id) {
        return bookMapper.deleteBooksById(id);
    }

    public int updateBooks(Books books) {
        return bookMapper.updateBooks(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}
