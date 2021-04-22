package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dmitri on 2021-04-21.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
