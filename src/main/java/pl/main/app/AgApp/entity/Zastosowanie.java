package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zastosowanie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String cel;
    @ManyToMany
    private List<Plant> plant;

    public Zastosowanie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
