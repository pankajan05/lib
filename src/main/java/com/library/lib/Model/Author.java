package com.library.lib.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.glassfish.jersey.server.ManagedAsyncExecutor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "Authors")
public class Author {
    @Id
    private String AuthorId;
    private String AuthorName;
    private String AuthorAddress;
    private String AuthorPhoneNumber;
    private String EmailAddress;
    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "ISBN"), inverseJoinColumns = @JoinColumn(name = "AuthorId"))
    private Set<Book> Books = new HashSet<>();

    public Author(String authorId, String authorName, String authorAddress, String authorPhoneNumber, String emailAddress) {
        AuthorId = authorId;
        AuthorName = authorName;
        AuthorAddress = authorAddress;
        AuthorPhoneNumber = authorPhoneNumber;
        EmailAddress = emailAddress;
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
