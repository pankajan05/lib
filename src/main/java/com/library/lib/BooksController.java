package com.library.lib;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BooksController {
    @RequestMapping("books")
    public ModelAndView books(@RequestParam("cname") String coursename){
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname", coursename);
        mv.setViewName("books");
        return mv;
    }

    @RequestMapping("/book/add")
    public String addbook(){
        return "AddBook";
    }
}
