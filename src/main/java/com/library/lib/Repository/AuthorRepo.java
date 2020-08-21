package com.library.lib.Repository;

import com.library.lib.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, String> {
}
