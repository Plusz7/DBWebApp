package pl.main.app.AgApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.main.app.AgApp.classes.PlantFiltered;
import pl.main.app.AgApp.classes.QueryBuilder;
import pl.main.app.AgApp.classes.StrefyKlimatyczne;
import pl.main.app.AgApp.entity.*;
import pl.main.app.AgApp.entity.Naslonecznienie;
import pl.main.app.AgApp.entity.Stanowisko;
import pl.main.app.AgApp.enums.*;
import pl.main.app.AgApp.repositories.*;

import javax.persistence.EntityManager;
import java.util.List;

@Controller
@RequestMapping("/plant")
public class PlantController {

    @Autowired
    PlantRepo plantRepo;

    @Autowired
    PokrojRepo pokrojRepo;

    @Autowired
    WysokoscRepo wysokoscRepo;

    @Autowired
    KolorKwiatowRepo kolorKwiatowRepo;

    @Autowired
    NaslonecznienieRepo naslonecznienieRepo;

    @Autowired
    StanowiskoRepo stanowiskoRepo;

    @Autowired
    WilgotnoscRepo wilgotnoscRepo;

    @Autowired
    PhPodlozaRepo phPodlozaRepo;

    @Autowired
    RodzajGlebyRepo rodzajGlebyRepo;

    @Autowired
    WaloryRepo waloryRepo;

    @Autowired
    ZastosowanieRepo zastosowanieRepo;

    @Autowired
    OwoceRepo owoceRepo;

    @Autowired
    PoraKwitnieniaRepo poraKwitnieniaRepo;

    @Autowired
    PoraOwocowaniaRepo poraOwocowaniaRepo;

    @Autowired
    EntityManager em;

    @Autowired
    private QueryBuilder qb;

    @ModelAttribute("allPlants")
    public List<Plant>allPlants(){ return plantRepo.findAll(); }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showPlantForm(Model model){
        List<Wysokosc> wysokoscList = wysokoscRepo.findAll();
        List<Pokroj> pokrojList = pokrojRepo.findAll();
        List<PoraKwitnienia> poraKwitnieniaList = poraKwitnieniaRepo.findAll();
        List<KolorKwiatow> kolorKwiatowList= kolorKwiatowRepo.findAll();
        List<Naslonecznienie> naslonecznienieList = naslonecznienieRepo.findAll();
        List<Stanowisko> stanowiskoList = stanowiskoRepo.findAll();
        List<Wilgotnosc> wilgotnoscsList = wilgotnoscRepo.findAll();
        List<PhPodloza> phPodlozaList = phPodlozaRepo.findAll();
        List<RodzajGleby> rodzajGlebyList = rodzajGlebyRepo.findAll();
        List<Walory> waloryList = waloryRepo.findAll();
        List<Zastosowanie> zastosowanieList = zastosowanieRepo.findAll();
        List<Owoce> owoceList = owoceRepo.findAll();
        List<PoraOwocowania> poraOwocowaniaList = poraOwocowaniaRepo.findAll();
        Plant plant = new Plant();
        StrefyKlimatyczne strefy = new StrefyKlimatyczne();

        model.addAttribute("plant", plant);
        model.addAttribute("grupaenum", Grupa.values());
        model.addAttribute("pokrojenum", pokrojList);
        model.addAttribute("wysokoscenum", wysokoscList);
        model.addAttribute("zimozieloneenum", Zimozielone.values());
        model.addAttribute("kolorliscienum", KolorLisci.values());
        model.addAttribute("silawzrostuenum", SilaWzrostu.values());
        model.addAttribute("porakwitnieniaenum", poraKwitnieniaList);
        model.addAttribute("kolorkwiatowenum",kolorKwiatowList);
        model.addAttribute("naslonecznienieenum", naslonecznienieList);
        model.addAttribute("stanowiskoenum",stanowiskoList);
        model.addAttribute("wilgotnoscenum", wilgotnoscsList);
        model.addAttribute("phpodlozaenum",phPodlozaList);
        model.addAttribute("rodzajglebyenum", rodzajGlebyList);
        model.addAttribute("strefyklimatyczne", strefy.getList());
        model.addAttribute("waloryenum", waloryList);
        model.addAttribute("zastosowanieenum", zastosowanieList);
        model.addAttribute("owoceenum", owoceList);
        model.addAttribute("poraowocowaniaenum", poraOwocowaniaList);
        return "plantForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addPlantToDB(@ModelAttribute Plant plant){

        plantRepo.save(plant);

        return "redirect:/plant/all";
    }

    @RequestMapping("/all")
    public String plants(){ return "plantList"; }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String searchPlants(Model model){

        List<Pokroj>pokrojList = pokrojRepo.findAll();
        List<Wysokosc> wysokoscList = wysokoscRepo.findAll();
        List<PoraKwitnienia> poraKwitnieniaList = poraKwitnieniaRepo.findAll();
        List<KolorKwiatow> kolorKwiatowList= kolorKwiatowRepo.findAll();
        List<Naslonecznienie> naslonecznienieList = naslonecznienieRepo.findAll();
        List<Stanowisko> stanowiskoList = stanowiskoRepo.findAll();
        List<Wilgotnosc> wilgotnoscsList = wilgotnoscRepo.findAll();
        List<PhPodloza> phPodlozaList = phPodlozaRepo.findAll();
        List<RodzajGleby> rodzajGlebyList = rodzajGlebyRepo.findAll();
        List<Walory> waloryList = waloryRepo.findAll();
        List<Zastosowanie> zastosowanieList = zastosowanieRepo.findAll();
        List<Owoce> owoceList = owoceRepo.findAll();
        List<PoraOwocowania> poraOwocowaniaList = poraOwocowaniaRepo.findAll();
        PlantFiltered plantFiltered = new PlantFiltered();
        StrefyKlimatyczne strefy = new StrefyKlimatyczne();

        model.addAttribute("plantFiltered", plantFiltered);
        model.addAttribute("grupaenum", Grupa.values());
        model.addAttribute("pokrojenum", pokrojList);
        model.addAttribute("wysokoscenum", wysokoscList);
        model.addAttribute("zimozieloneenum", Zimozielone.values());
        model.addAttribute("kolorliscienum", KolorLisci.values());
        model.addAttribute("silawzrostuenum", SilaWzrostu.values());
        model.addAttribute("porakwitnieniaenum", poraKwitnieniaList);
        model.addAttribute("kolorkwiatowenum", kolorKwiatowList);
        model.addAttribute("naslonecznienieenum", naslonecznienieList);
        model.addAttribute("stanowiskoenum",stanowiskoList);
        model.addAttribute("wilgotnoscenum", wilgotnoscsList);
        model.addAttribute("phpodlozaenum",phPodlozaList);
        model.addAttribute("rodzajglebyenum", rodzajGlebyList);
        model.addAttribute("strefyklimatyczne", strefy.getList());
        model.addAttribute("waloryenum", waloryList);
        model.addAttribute("zastosowanieenum", zastosowanieList);
        model.addAttribute("owoceenum", owoceList);
        model.addAttribute("poraowocowaniaenum", poraOwocowaniaList);


        return "plantFilterForm";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@ModelAttribute PlantFiltered plantFiltered, Model model){

        List<Plant> searchedPlants = qb.createQuery(plantFiltered);

        model.addAttribute("listOfPlants", searchedPlants);

        return "filterResult";

    }




    @RequestMapping("/{id}/delete")
    public String deletePlant(@PathVariable Long id){
        Plant plant = plantRepo.getOne(id);

        plantRepo.delete(plant);

        return "success";
    }





}
