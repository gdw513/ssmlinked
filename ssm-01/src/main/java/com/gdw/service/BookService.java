package com.gdw.service;

import com.gdw.pojo.Books;


import java.util.List;

public interface BookService {

    int addBook(Books books);
    //删除一本书
    int deleteBooksById(int id);
    // 更新一本书
    int updateBooks(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryAllBooks();
}
