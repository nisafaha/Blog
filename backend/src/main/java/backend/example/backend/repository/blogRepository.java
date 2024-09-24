package backend.example.backend.repository;

import backend.example.backend.model.blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface blogRepository extends JpaRepository<blog, Integer> {

}
