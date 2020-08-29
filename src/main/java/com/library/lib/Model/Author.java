package com.library.lib.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@ToString
public class Author {
    @Id
    private String AuthorId;
    private String AuthorName;
    private String AuthorAddress;
    private String AuthorPhoneNumber;
    private String EmailAddress;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "author_id"), inverseJoinColumns = @JoinColumn(name = "isbn"))
    private Set<Book> Books = new HashSet<>();

    public Author() { }

    public Author(String authorId, String authorName, String authorAddress, String authorPhoneNumber, String emailAddress) {
        AuthorId = authorId;
        AuthorName = authorName;
        AuthorAddress = authorAddress;
        AuthorPhoneNumber = authorPhoneNumber;
        EmailAddress = emailAddress;
    }

    public String getAuthorId() {
        return AuthorId;
    }

    public void setAuthorId(String authorId) {
        AuthorId = authorId;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setAuthorName(String authorName) {
        AuthorName = authorName;
    }

    public String getAuthorAddress() {
        return AuthorAddress;
    }

    public void setAuthorAddress(String authorAddress) {
        AuthorAddress = authorAddress;
    }

    public String getAuthorPhoneNumber() {
        return AuthorPhoneNumber;
    }

    public void setAuthorPhoneNumber(String authorPhoneNumber) {
        AuthorPhoneNumber = authorPhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public Set<Book> getBooks() {
        return Books;
    }

    public void setBooks(Set<Book> books) {
        Books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(AuthorId, author.AuthorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(AuthorId);
    }
}
