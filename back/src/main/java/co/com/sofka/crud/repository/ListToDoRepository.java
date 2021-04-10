package co.com.sofka.crud.repository;

import co.com.sofka.crud.entity.ListToDo;
import org.springframework.data.repository.CrudRepository;

public interface ListToDoRepository extends CrudRepository<ListToDo, Long> {
}
