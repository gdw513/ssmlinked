package com.gdw.controller;

import com.gdw.pojo.Books;
import com.gdw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("BookServiceIml")
    private BookService bookService;

    @RequestMapping("/allBook")
    public String queryList(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list", list);
        return "allBook";

    }
    @RequestMapping("/toAddBook")
    public String addBook01(){

        return "addBook";
    }

    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
}
