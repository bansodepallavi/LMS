package com.lmsystem.repo.service;

import com.lmsystem.repo.model.Book;

import java.util.List;

public interface bookService {
    public String addBook(Book book);

    public String deleteBook(long bookID);

    public List<Book> viewAllBooks();

    public void issueBook();

    public void returnBook();

    public void issueBookList();
}
