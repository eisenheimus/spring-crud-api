package su.crud.app.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Primary;



@Table(name="main")
@Entity
@Data
public class MainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private String name;

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Column()
    private String info;

    public MainEntity(String name, String info){
        this.name = name;
        this.info = info;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MainEntity(){

    }
}
