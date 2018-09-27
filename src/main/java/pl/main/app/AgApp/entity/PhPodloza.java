package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class PhPodloza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String poziom;
    @ManyToMany
    private List<Plant> plant;

    public PhPodloza() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
