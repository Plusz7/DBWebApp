package pl.main.app.AgApp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class PoraKwitnienia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String miesiacKwitnienia;
    @ManyToMany
    private List<Plant> plant;

    public PoraKwitnienia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMiesiacKwitnienia() {
        return miesiacKwitnienia;
    }

    public void setMiesiacKwitnienia(String miesiacKwitnienia) {
        this.miesiacKwitnienia = miesiacKwitnienia;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
