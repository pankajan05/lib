package com.library.lib;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BooksController {
    @RequestMapping("books")
    public String books(){
        return "books";
    }
}
