package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Naslonecznienie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String swiatlo;
    @ManyToMany
    private List<Plant> plant;

    public Naslonecznienie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSwiatlo() {
        return swiatlo;
    }

    public void setSwiatlo(String swiatlo) {
        this.swiatlo = swiatlo;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
