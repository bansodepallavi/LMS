package com.lmsystem.repo.repository;

import com.lmsystem.repo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface bookRepository extends JpaRepository<Book, Long> {
}
