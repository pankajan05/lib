package com.library.lib;

import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends CrudRepository<Book, String> {

}
