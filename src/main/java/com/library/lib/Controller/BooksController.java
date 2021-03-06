package com.library.lib.Controller;

import com.library.lib.Repository.BooksRepo;
import com.library.lib.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class        BooksController {
    @Autowired
    BooksRepo repo;

    /*
    @RequestMapping("books")
    public ModelAndView books(@RequestParam("cname") String coursename){
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname", coursename);
        mv.setViewName("books");
        return mv;
    }

     */

    @RequestMapping("/")
    public String details(){
        return "AddBook";
    }

    @RequestMapping("/details")
    public String details(Book book){
        System.out.print(book);
        repo.save(book);
        return "AddBook";
    }

    @RequestMapping("/search")
    public String getDetails(){
        return "SearchBook";
    }

    @PostMapping("/getdetails")
    public ModelAndView getDetails(@RequestParam String ISBN){
        ModelAndView mv = new ModelAndView("ViewBook");
        Book book = repo.findById(ISBN).orElse(null);
        mv.addObject(book);
        return mv;
    }


    /*
    @RequestMapping("add")
    public String addBook(){
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
     */
}
