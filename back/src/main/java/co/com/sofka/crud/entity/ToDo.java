package co.com.sofka.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ToDo {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean completed;

    @ManyToOne
    private ListToDo listToDo;

    public ListToDo getListToDo() {
        return listToDo;
    }

    public void setListToDo(ListToDo listToDo) {
        this.listToDo = listToDo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
