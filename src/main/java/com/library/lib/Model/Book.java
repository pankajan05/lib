package com.library.lib.Model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Books")
public class Book {
    @Id
    private String ISBN;
    private String BookName;
    private String Category;
    @ManyToMany(mappedBy = "Books")
    private Set<Author> Author;
    private String PublicationDate;
    private int Quantity;

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public Set getAuthor() {
        return Author;
    }

    public void setAuthor(Set author) {
        Author = author;
    }

    public String getPublicationDate() {
        return PublicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        PublicationDate = publicationDate;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                ", BookName='" + BookName + '\'' +
                ", Category='" + Category + '\'' +
                ", Author='" + Author + '\'' +
                ", PublicationDate='" + PublicationDate + '\'' +
                ", Quantity=" + Quantity +
                '}';
    }
}
