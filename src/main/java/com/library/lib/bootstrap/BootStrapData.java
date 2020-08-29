package com.library.lib.bootstrap;

import com.library.lib.Model.Author;
import com.library.lib.Model.Book;
import com.library.lib.Repository.AuthorRepo;
import com.library.lib.Repository.BooksRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepo authorRepo;
    private final BooksRepo booksRepo;

    public BootStrapData(AuthorRepo authorRepo, BooksRepo booksRepo) {
        this.authorRepo = authorRepo;
        this.booksRepo = booksRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("started in bootstrap");
        Author pankajan = new Author("A0032", "Pankajan", "Earlalai East, Earlalai, Jaffna.","+94 772958306", "pankajan@quadrate.lk");
        Book life = new Book("B0034","Life","Life","23/09/2020",5);
        life.getAuthor().add(pankajan);
        authorRepo.save(pankajan);
        booksRepo.save(life);

        System.out.println("Number of books added : " + booksRepo.count());
    }
}
