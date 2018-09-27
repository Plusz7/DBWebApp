package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class RodzajGleby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String gleba;
    @ManyToMany
    private List<Plant> plant;

    public RodzajGleby() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGleba() {
        return gleba;
    }

    public void setGleba(String gleba) {
        this.gleba = gleba;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
