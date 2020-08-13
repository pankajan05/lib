package com.library.lib;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class BooksController {
    @RequestMapping("books")
    public String books(HttpServletRequest req){
        HttpSession session = req.getSession();
        session.setAttribute("cname", req.getParameter("cname"));
        return "books";
    }
}
