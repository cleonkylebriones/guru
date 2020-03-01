package cambridge.testing.cleon.repository;
import org.springframework.data.repository.CrudRepository;

import cambridge.testing.cleon.model.Books;
public interface BookRepository extends CrudRepository<Books, Long> {

}
