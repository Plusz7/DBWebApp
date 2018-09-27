package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Wysokosc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String wys;
    @ManyToMany
    private List<Plant> plant;

    public Wysokosc() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWys() {
        return wys;
    }

    public void setWys(String wys) {
        this.wys = wys;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
