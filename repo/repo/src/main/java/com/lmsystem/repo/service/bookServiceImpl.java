package com.lmsystem.repo.service;

import com.lmsystem.repo.model.Book;
import com.lmsystem.repo.repository.bookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class bookServiceImpl implements bookService{
    @Autowired
    private bookRepository bookrepository;
    @Override
    public String addBook(Book book) {
        bookrepository.save(book);
        return "book added successfully";
    }

    @Override
    public String deleteBook(long bookID) {
        if(!bookrepository.existsById(bookID))
            return "Book does not exists";
        bookrepository.deleteById(bookID);
        return "book deleted successfully";
    }

    @Override
    public List<Book> viewAllBooks() {
        return bookrepository.findAll();
    }

    @Override
    public void issueBook() {

    }

    @Override
    public void returnBook() {

    }

    @Override
    public void issueBookList() {

    }
}
