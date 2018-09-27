package pl.main.app.AgApp.entity;

import pl.main.app.AgApp.enums.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rosliny")
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nazwa")
    private String name;
    @Enumerated(EnumType.STRING)
    private Grupa grupa;
    @Enumerated(EnumType.STRING)
    private Rodzaje rodzaje;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "pokroj_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Pokroj> pokroj;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "wysokosc_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Wysokosc> wysokosc;
    @Enumerated(EnumType.STRING)
    private Zimozielone zimozielone;
    @Column(name = "kolor_lisci")
    @Enumerated(EnumType.STRING)
    private KolorLisci kolorLisci;
    @Column(name = "sila_wzrostu")
    @Enumerated(EnumType.STRING)
    private SilaWzrostu silaWzrostu;
    @Column(name = "pora_kwitnienia")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "poraKwitnienia_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<PoraKwitnienia> poraKwitnienia;
    @Column(name = "kolor_kwiatow")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "kolorKwiatow_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<KolorKwiatow> kolorKwiatow;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "naslonecznienie_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Naslonecznienie> naslonecznienie;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "stanowisko_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Stanowisko> stanowisko;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "wilgotnosc_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Wilgotnosc> wilgotnosc;
    @Column(name = "PH_podloza")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "phPodloza_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<PhPodloza> phPodloza;
    @Column(name = "rodzaj_gleby")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "rodzajGleby_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<RodzajGleby> rodzajGleby;
    @Column(name = "strefy_klimatyczne")
    private String strefyKlimatyczne;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "walory_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Walory> walory;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "zastosowanie_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Zastosowanie> zastosowanie;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "owoce_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<Owoce> owoce;
    @Column(name = "pora_owocowania")
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name = "poraOwocowania_id"), inverseJoinColumns = @JoinColumn(name = "plant_id"))
    private List<PoraOwocowania> poraOwocowania;

    public Plant() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Rodzaje getRodzaje() {
        return rodzaje;
    }

    public void setRodzaje(Rodzaje rodzaje) {
        this.rodzaje = rodzaje;
    }

    public List<Pokroj> getPokroj() {
        return pokroj;
    }

    public void setPokroj(List<Pokroj> pokroj) {
        this.pokroj = pokroj;
    }

    public List<Wysokosc> getWysokosc() { return wysokosc; }

    public void setWysokosc(List<Wysokosc> wysokosc) { this.wysokosc = wysokosc; }

    public Zimozielone getZimozielone() {
        return zimozielone;
    }

    public void setZimozielone(Zimozielone zimozielone) {
        this.zimozielone = zimozielone;
    }

    public KolorLisci getKolorLisci() {
        return kolorLisci;
    }

    public void setKolorLisci(KolorLisci kolorLisci) {
        this.kolorLisci = kolorLisci;
    }

    public SilaWzrostu getSilaWzrostu() {
        return silaWzrostu;
    }

    public void setSilaWzrostu(SilaWzrostu silaWzrostu) {
        this.silaWzrostu = silaWzrostu;
    }

    public List<PoraKwitnienia> getPoraKwitnienia() {
        return poraKwitnienia;
    }

    public void setPoraKwitnienia(List<PoraKwitnienia> poraKwitnienia) {
        this.poraKwitnienia = poraKwitnienia;
    }

    public List<KolorKwiatow> getKolorKwiatow() { return kolorKwiatow; }

    public void setKolorKwiatow(List<KolorKwiatow> kolorKwiatow) { this.kolorKwiatow = kolorKwiatow; }

    public List<Naslonecznienie> getNaslonecznienie() {
        return naslonecznienie;
    }

    public void setNaslonecznienie(List<Naslonecznienie> naslonecznienie) {
        this.naslonecznienie = naslonecznienie;
    }

    public List<Stanowisko> getStanowisko() { return stanowisko; }

    public void setStanowisko(List<Stanowisko> stanowisko) { this.stanowisko = stanowisko; }

    public List<Wilgotnosc> getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(List<Wilgotnosc> wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public List<PhPodloza> getPhPodloza() { return phPodloza; }

    public void setPhPodloza(List<PhPodloza> phPodloza) { this.phPodloza = phPodloza; }

    public List<RodzajGleby> getRodzajGleby() {
        return rodzajGleby;
    }

    public void setRodzajGleby(List<RodzajGleby> rodzajGleby) {
        this.rodzajGleby = rodzajGleby;
    }

    public String getStrefyKlimatyczne() {
        return strefyKlimatyczne;
    }

    public void setStrefyKlimatyczne(String strefyKlimatyczne) {
        this.strefyKlimatyczne = strefyKlimatyczne;
    }

    public List<Walory> getWalory() {
        return walory;
    }

    public void setWalory(List<Walory> walory) {
        this.walory = walory;
    }

    public List<Zastosowanie> getZastosowanie() {
        return zastosowanie;
    }

    public void setZastosowanie(List<Zastosowanie> zastosowanie) {
        this.zastosowanie = zastosowanie;
    }

    public List<Owoce> getOwoce() {
        return owoce;
    }

    public void setOwoce(List<Owoce> owoce) {
        this.owoce = owoce;
    }

    public List<PoraOwocowania> getPoraOwocowania() {
        return poraOwocowania;
    }

    public void setPoraOwocowania(List<PoraOwocowania> poraOwocowania) {
        this.poraOwocowania = poraOwocowania;
    }
}