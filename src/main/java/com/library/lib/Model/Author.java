package com.library.lib.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
}
