package com.library.lib.Repository;

import com.library.lib.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepo extends CrudRepository<Book, String> {

}
