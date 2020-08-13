package com.library.lib;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
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

    @RequestMapping("add")
    public String addbook(){
        return "AddBook";
    }

    @PostMapping("details")
    public String viewDetails(@RequestParam("ISBN") String ISBN,
                              @RequestParam("BookName") String BookName,
                              @RequestParam("Category") String Category,
                              @RequestParam("Author") String Author,
                              @RequestParam("PublicationDate") String PublicationDate,
                              @RequestParam("Quantity") int Quantity, ModelMap modelMap){
        modelMap.put("ISBN",ISBN);
        modelMap.put("BookName",BookName);
        modelMap.put("Category",Category);
        modelMap.put("Author",Author);
        modelMap.put("PublicationDate",PublicationDate);
        modelMap.put("Quantity",Quantity);
        return "ViewBook";

    }
}
