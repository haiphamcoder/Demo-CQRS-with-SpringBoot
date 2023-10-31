package com.haiphamcoder.cqrs.demo.service;

import com.haiphamcoder.cqrs.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueryRepository extends JpaRepository<Book, Long> {

}
