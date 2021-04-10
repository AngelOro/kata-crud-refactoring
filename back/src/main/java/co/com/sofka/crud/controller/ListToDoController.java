package co.com.sofka.crud.controller;

import co.com.sofka.crud.entity.ListToDo;
import co.com.sofka.crud.service.ListToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ListToDoController {

    @Autowired
    private ListToDoService service;

    @GetMapping(value = "api/listTodos")
    public Iterable<ListToDo> list(){
        return service.list();
    }

    @PostMapping(value = "api/listTodo")
    public ListToDo save(@RequestBody ListToDo todoList){
        return service.save(todoList);
    }

    @DeleteMapping(value = "api/{idList}/listTodo")
    public void delete(@PathVariable("idList")Long idList){
        service.delete(idList);
    }

    @GetMapping(value = "api/{idList}/listTodo")
    public ListToDo get(@PathVariable("idList") Long idList){
        return service.get(idList);
    }
}
