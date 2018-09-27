package pl.main.app.AgApp.entity;


import javax.persistence.*;
import java.util.List;

@Entity
public class PoraOwocowania {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String miesiacOwocowania;
    @ManyToMany
    private List<Plant> plant;

    public PoraOwocowania() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMiesiacOwocowania() {
        return miesiacOwocowania;
    }

    public void setMiesiacOwocowania(String miesiacOwocowania) {
        this.miesiacOwocowania = miesiacOwocowania;
    }

    public List<Plant> getPlant() {
        return plant;
    }

    public void setPlant(List<Plant> plant) {
        this.plant = plant;
    }
}
