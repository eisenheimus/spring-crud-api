package su.crud.app.entities;


import jakarta.persistence.*;

@Table(name="main")
@Entity
public class mainEntity {
    @Id
    @GeneratedValue
    private Integer id;

    @Column()
    private String name;

    @Column()
    private String info;
}
