package cambridge.testing.cleon.repository;

import cambridge.testing.cleon.model.Authors;
import org.springframework.data.repository.CrudRepository;
public interface AuthorRepository extends CrudRepository<Authors, Long>{

}
