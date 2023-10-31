package com.haiphamcoder.cqrs.demo.controller;

import com.haiphamcoder.cqrs.demo.entity.Book;
import com.haiphamcoder.cqrs.demo.service.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QueryController {
    @Autowired
    private QueryRepository queryRepository;

    @GetMapping("/")
    public String list(Model model){
        List<Book> books = queryRepository.findAll();
        model.addAttribute("books", books);
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, Model model){
        Book book = queryRepository.findById(id).orElse(new Book());
        model.addAttribute("book", book);
        return "edit";
    }
}
