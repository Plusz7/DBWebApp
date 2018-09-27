package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wilgotnosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String wilgoc;
    @ManyToMany
    private List<Plant> plant;

    public Wilgotnosc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWilgoc() {
        return wilgoc;
    }

    public void setWilgoc(String wilgoc) {
        this.wilgoc = wilgoc;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
