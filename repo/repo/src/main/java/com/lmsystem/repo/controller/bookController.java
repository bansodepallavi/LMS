package com.lmsystem.repo.controller;

import com.lmsystem.repo.model.Book;
import com.lmsystem.repo.service.bookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class bookController{
    @Autowired
    private bookService bookservice;

    @PostMapping("/addBook")
    @ResponseBody
    public String addBook(@RequestBody Book book){
        return this.bookservice.addBook(book);
    }

    @DeleteMapping("deleteBook/{bookID}")
    public String deleteBook(@PathVariable long bookID){
        return this.bookservice.deleteBook(bookID);
    }

    @GetMapping("/books")
    public List<Book> viewAllBooks(){
        return this.bookservice.viewAllBooks();
    }
}
