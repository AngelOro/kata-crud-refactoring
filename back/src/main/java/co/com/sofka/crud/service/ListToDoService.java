package co.com.sofka.crud.service;

import co.com.sofka.crud.entity.ListToDo;
import co.com.sofka.crud.repository.ListToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListToDoService {

    @Autowired
    private ListToDoRepository repository;

    public Iterable<ListToDo> list(){
        return repository.findAll();
    }

    public ListToDo save(ListToDo listTodo){
        return repository.save(listTodo);
    }

    public void delete(Long idList){
        repository.delete(get(idList));
    }

    public ListToDo get(Long idList){
        return repository.findById(idList).orElseThrow();
    }
}
