package co.com.sofka.crud.model;

public class ToDoModel {

    private Long id;
    private String name;
    private boolean completed;
    private Long idList;

    public ToDoModel(Long id, String name, boolean completed, Long idList) {
        this.id = id;
        this.name = name;
        this.completed = completed;
        this.idList = idList;
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

    public Long getIdList() {
        return idList;
    }

    public void setIdList(Long idList) {
        this.idList = idList;
    }
}