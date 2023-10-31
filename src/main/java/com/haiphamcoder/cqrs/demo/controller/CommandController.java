package com.haiphamcoder.cqrs.demo.controller;

import com.haiphamcoder.cqrs.demo.entity.Book;
import com.haiphamcoder.cqrs.demo.service.CommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/command")
public class CommandController {
    @Autowired
    private CommandRepository commandRepository;

    @PostMapping("/create")
    public String create(@ModelAttribute Book book) {
        commandRepository.save(book);
        return "redirect:/";
    }

    @PutMapping("/update")
    public String update(@ModelAttribute Book book) {
        commandRepository.save(book);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        commandRepository.deleteById(id);
        return "redirect:/";
    }
}
