package co.com.sofka.crud.service;

import co.com.sofka.crud.entity.ToDo;
import co.com.sofka.crud.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository repository;

    public Iterable<ToDo> list(){
        return repository.findAll();
    }

    public ToDo save(ToDo todo){
        return repository.save(todo);
    }

    public ToDo update(ToDo todo) {
        try {
            isEqualTodo(todo);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        return repository.save(todo);
    }

    public void delete(Long id){
        repository.delete(get(id));
    }

    public ToDo get(Long id){
         return repository.findById(id).orElseThrow();
    }

    public void isEqualTodo(ToDo todo){
        var todoUpdate = repository.findById(todo.getId()).orElseThrow();

        if (todoUpdate.getName().equals(todo.getName())){
            throw new RuntimeException("La tarea no ha sido modificada");
        }
    }

}
