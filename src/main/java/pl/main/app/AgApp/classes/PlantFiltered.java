package pl.main.app.AgApp.classes;

import pl.main.app.AgApp.entity.*;
import pl.main.app.AgApp.entity.Stanowisko;
import pl.main.app.AgApp.entity.Wilgotnosc;
import pl.main.app.AgApp.enums.*;

import java.util.List;

public class PlantFiltered {

    private Long id;
    private String name;
    private Grupa grupa;
    private Rodzaje rodzaje;
    private List<Pokroj> pokroj;
    private List<Wysokosc> wysokosc;
    private Zimozielone zimozielone;
    private KolorLisci kolorLisci;
    private SilaWzrostu silaWzrostu;
    private List<PoraKwitnienia> poraKwitnienia;
    private List<KolorKwiatow> kolorKwiatow;
    private List<Naslonecznienie> naslonecznienie;
    private List<Stanowisko> stanowisko;
    private List<Wilgotnosc> wilgotnosc;
    private List<PhPodloza> phPodloza;
    private List<RodzajGleby> rodzajGleby;
    private String strefyKlimatyczne;
    private List<Walory> walory;
    private List<Zastosowanie> zastosowanie;
    private List<Owoce> owoce;
    private List<PoraOwocowania> poraOwocowania;

    public PlantFiltered() {
    }

    public PlantFiltered(Long id, String name, Grupa grupa, Rodzaje rodzaje, List<Pokroj> pokroj, List<Wysokosc> wysokosc, Zimozielone zimozielone, KolorLisci kolorLisci, SilaWzrostu silaWzrostu, List<PoraKwitnienia> poraKwitnienia, List<KolorKwiatow> kolorKwiatow, List<Naslonecznienie> naslonecznienie, List<Stanowisko> stanowisko, List<Wilgotnosc> wilgotnosc, List<PhPodloza> phPodloza, List<RodzajGleby> rodzajGleby, String strefyKlimatyczne, List<Walory> walory, List<Zastosowanie> zastosowanie, List<Owoce> owoce, List<PoraOwocowania> poraOwocowania) {
        this.id = id;
        this.name = name;
        this.grupa = grupa;
        this.rodzaje = rodzaje;
        this.pokroj = pokroj;
        this.wysokosc = wysokosc;
        this.zimozielone = zimozielone;
        this.kolorLisci = kolorLisci;
        this.silaWzrostu = silaWzrostu;
        this.poraKwitnienia = poraKwitnienia;
        this.kolorKwiatow = kolorKwiatow;
        this.naslonecznienie = naslonecznienie;
        this.stanowisko = stanowisko;
        this.wilgotnosc = wilgotnosc;
        this.phPodloza = phPodloza;
        this.rodzajGleby = rodzajGleby;
        this.strefyKlimatyczne = strefyKlimatyczne;
        this.walory = walory;
        this.zastosowanie = zastosowanie;
        this.owoce = owoce;
        this.poraOwocowania = poraOwocowania;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Wysokosc> getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(List<Wysokosc> wysokosc) {
        this.wysokosc = wysokosc;
    }

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

    public List<KolorKwiatow> getKolorKwiatow() {
        return kolorKwiatow;
    }

    public void setKolorKwiatow(List<KolorKwiatow> kolorKwiatow) {
        this.kolorKwiatow = kolorKwiatow;
    }

    public List<Naslonecznienie> getNaslonecznienie() {
        return naslonecznienie;
    }

    public void setNaslonecznienie(List<Naslonecznienie> naslonecznienie) {
        this.naslonecznienie = naslonecznienie;
    }

    public List<Stanowisko> getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(List<Stanowisko> stanowisko) {
        this.stanowisko = stanowisko;
    }

    public List<Wilgotnosc> getWilgotnosc() {
        return wilgotnosc;
    }

    public void setWilgotnosc(List<Wilgotnosc> wilgotnosc) {
        this.wilgotnosc = wilgotnosc;
    }

    public List<PhPodloza> getPhPodloza() {
        return phPodloza;
    }

    public void setPhPodloza(List<PhPodloza> phPodloza) {
        this.phPodloza = phPodloza;
    }

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
