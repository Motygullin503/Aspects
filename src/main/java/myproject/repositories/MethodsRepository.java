package myproject.repositories;

import myproject.entities.Method;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MethodsRepository  extends CrudRepository<Method, Integer> {}
