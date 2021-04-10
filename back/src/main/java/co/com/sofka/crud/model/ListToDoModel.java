package co.com.sofka.crud.model;

public class ListToDoModel {

    private Long idList;
    private String name;

    public ListToDoModel(Long idList, String name) {
        this.idList = idList;
        this.name = name;
    }

    public Long getIdList() {
        return idList;
    }

    public void setIdList(Long idList) {
        this.idList = idList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
