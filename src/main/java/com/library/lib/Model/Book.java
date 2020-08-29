package com.library.lib.Model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    private String ISBN;
    private String BookName;
    private String Category;
    @ManyToMany(mappedBy = "Books")
    private Set<Author> Author = new HashSet<>();
    private String PublicationDate;
    private int Quantity;

    public Book() {
    }


    public Book(String ISBN, String bookName, String category, String publicationDate, int quantity) {
        this.ISBN = ISBN;
        BookName = bookName;
        Category = category;
        PublicationDate = publicationDate;
        Quantity = quantity;
    }

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

    public Set<com.library.lib.Model.Author> getAuthor() {
        return Author;
    }

    public void setAuthor(Set<com.library.lib.Model.Author> author) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(ISBN, book.ISBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN);
    }
}
