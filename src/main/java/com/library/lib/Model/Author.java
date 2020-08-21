package com.library.lib.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.glassfish.jersey.server.ManagedAsyncExecutor;

import javax.persistence.*;
import java.util.Set;

@Entity
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
    private Set<Book> Books;
}
