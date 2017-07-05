package byaj.hangman.repositories;

import byaj.hangman.models.Body;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by student on 7/5/17.
 */
public interface BodyRepository extends CrudRepository<Body, Integer> {
    public Body findById(int id);
    public List<Body> findAll();
}
