package su.crud.app.DTO;

import lombok.Getter;

@Getter
public class MainDTO {

    public Integer getId() {
        return id;
    }

    public String getInfo() {
        return info;
    }

    public String getName() {
        return name;
    }

    private Integer id;
    private String info;
    private String name;
}
