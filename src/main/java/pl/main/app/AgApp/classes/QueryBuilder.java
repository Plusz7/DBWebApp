package pl.main.app.AgApp.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.main.app.AgApp.entity.*;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class QueryBuilder {

    @Autowired
    EntityManager em;

    public List<Plant> createQuery(PlantFiltered plantFiltered){

        CriteriaBuilder cb = em.getCriteriaBuilder();

        CriteriaQuery<Plant> query = cb.createQuery(Plant.class);
        Root<Plant> root = query.from(Plant.class);
        Join<Plant, Pokroj> join1 = root.join("pokroj", JoinType.LEFT);
        Join<Plant, Wysokosc> join2 = root.join("wysokosc", JoinType.LEFT);
        Join<Plant, PoraKwitnienia> join3 = root.join("poraKwitnienia", JoinType.LEFT);
        Join<Plant, KolorKwiatow> join4 = root.join("kolorKwiatow", JoinType.LEFT);
        Join<Plant, Naslonecznienie> join5 = root.join("naslonecznienie", JoinType.LEFT);
        Join<Plant, Stanowisko> join6 = root.join("stanowisko", JoinType.LEFT);
        Join<Plant, Wilgotnosc> join7 = root.join("wilgotnosc", JoinType.LEFT);
        Join<Plant, PhPodloza> join8 = root.join("phPodloza", JoinType.LEFT);
        Join<Plant, RodzajGleby> join9 = root.join("rodzajGleby", JoinType.LEFT);
        Join<Plant, Walory> join10 = root.join("walory", JoinType.LEFT);
        Join<Plant, Zastosowanie> join11 = root.join("zastosowanie", JoinType.LEFT);
        Join<Plant, Owoce> join12 = root.join("owoce", JoinType.LEFT);
        Join<Plant, PoraOwocowania> join13 = root.join("poraOwocowania", JoinType.LEFT);


        List<Predicate> predicates = new ArrayList<>();

        if(plantFiltered.getGrupa() != null) {
            predicates.add(cb.equal(root.get("grupa"), plantFiltered.getGrupa()));
            //query.where(cb.equal(root.get("grupa"), plantFiltered.getGrupa()));
        }

        if(plantFiltered.getZimozielone() != null){
            predicates.add(cb.equal(root.get("zimozielone"), plantFiltered.getZimozielone()));
            //query.where(cb.equal(root.get("zimozielone"), plantFiltered.getZimozielone()));
        }
        if(!plantFiltered.getPokroj().isEmpty()){
            List<String> pokrojQuery = new ArrayList<>();
            for(Pokroj pokorojes : plantFiltered.getPokroj()){
                pokrojQuery.add(pokorojes.getNazwa());
            }
            predicates.add(join1.get("nazwa").in(pokrojQuery));
            //query.where(join1.get("nazwa").in(pokrojQuery));
        }
        if(!plantFiltered.getWysokosc().isEmpty()){
            List<String> wysokoscQuery = new ArrayList<>();
            for(Wysokosc wysokosces : plantFiltered.getWysokosc()){
                wysokoscQuery.add(wysokosces.getWys());
            }
            predicates.add(join2.get("wys").in(wysokoscQuery));
            //query.where(join2.get("wys").in(wysokoscQuery));
        }
        if(plantFiltered.getKolorLisci() != null){
            predicates.add(cb.equal(root.get("kolorLisci"), plantFiltered.getKolorLisci()));
            //query.where(cb.equal(root.get("kolorLisci"), plantFiltered.getKolorLisci()));
        }
        if(plantFiltered.getSilaWzrostu() != null){
            predicates.add(cb.equal(root.get("silaWzrostu"), plantFiltered.getSilaWzrostu()));
            //query.where(cb.equal(root.get("silaWzrostu"), plantFiltered.getSilaWzrostu()));
        }
        if(!plantFiltered.getPoraKwitnienia().isEmpty()){
            List<String> poraKwitnieniaQuery = new ArrayList<>();
            for(PoraKwitnienia poraKwitnieniaes : plantFiltered.getPoraKwitnienia()){
                poraKwitnieniaQuery.add(poraKwitnieniaes.getMiesiacKwitnienia());
            }
            predicates.add(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getKolorKwiatow().isEmpty()){
            List<String> kolorKwiatowQuery = new ArrayList<>();
            for(KolorKwiatow kolorKwiatowes : plantFiltered.getKolorKwiatow()){
                kolorKwiatowQuery.add(kolorKwiatowes.getKolor());
            }
            predicates.add(join4.get("kolor").in(kolorKwiatowQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getNaslonecznienie().isEmpty()){
            List<String> naslonecznienieQuery = new ArrayList<>();
            for(Naslonecznienie naslonecznieniees : plantFiltered.getNaslonecznienie()){
                naslonecznienieQuery.add(naslonecznieniees.getSwiatlo());
            }
            predicates.add(join5.get("swiatlo").in(naslonecznienieQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getStanowisko().isEmpty()){
            List<String> stanowiskoQuery = new ArrayList<>();
            for(Stanowisko stanowiskoes : plantFiltered.getStanowisko()){
                stanowiskoQuery.add(stanowiskoes.getKierunek());
            }
            predicates.add(join6.get("kierunek").in(stanowiskoQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getWilgotnosc().isEmpty()){
            List<String> wilgotnoscQuery = new ArrayList<>();
            for(Wilgotnosc wilgotnosces : plantFiltered.getWilgotnosc()){
                wilgotnoscQuery.add(wilgotnosces.getWilgoc());
            }
            predicates.add(join7.get("wilgoc").in(wilgotnoscQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getPhPodloza().isEmpty()){
            List<String> phPodlozaQuery = new ArrayList<>();
            for(PhPodloza phPodlozaes : plantFiltered.getPhPodloza()){
                phPodlozaQuery.add(phPodlozaes.getPoziom());
            }
            predicates.add(join8.get("poziom").in(phPodlozaQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getRodzajGleby().isEmpty()){
            List<String> rodzajGlebyQuery = new ArrayList<>();
            for(RodzajGleby rodzajGlebyes : plantFiltered.getRodzajGleby()){
                rodzajGlebyQuery.add(rodzajGlebyes.getGleba());
            }
            predicates.add(join9.get("gleba").in(rodzajGlebyQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }

//        if(plantFiltered.getStrefyKlimatyczne() != null) {
//            predicates.add(cb.equal(root.get("strefyKlimatyczne"), plantFiltered.getStrefyKlimatyczne()));
//            //query.where(cb.equal(root.get("grupa"), plantFiltered.getGrupa()));
//        }

        if(!plantFiltered.getWalory().isEmpty()){
            List<String> waloryQuery = new ArrayList<>();
            for(Walory waloryyes : plantFiltered.getWalory()){
                waloryQuery.add(waloryyes.getWalor());
            }
            predicates.add(join10.get("walor").in(waloryQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }

        if(!plantFiltered.getZastosowanie().isEmpty()){
            List<String> zastosowanieQuery = new ArrayList<>();
            for(Zastosowanie zastosowaniees : plantFiltered.getZastosowanie()){
                zastosowanieQuery.add(zastosowaniees.getCel());
            }
            predicates.add(join11.get("cel").in(zastosowanieQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getOwoce().isEmpty()){
            List<String> owoceQuery = new ArrayList<>();
            for(Owoce owocees : plantFiltered.getOwoce()){
                owoceQuery.add(owocees.getRodzaj());
            }
            predicates.add(join12.get("rodzaj").in(owoceQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }
        if(!plantFiltered.getPoraOwocowania().isEmpty()){
            List<String> poraOwocowaniaQuery = new ArrayList<>();
            for(PoraOwocowania poraOwocowaniaes : plantFiltered.getPoraOwocowania()){
                poraOwocowaniaQuery.add(poraOwocowaniaes.getMiesiacOwocowania());
            }
            predicates.add(join13.get("miesiacOwocowania").in(poraOwocowaniaQuery));
            //query.where(join3.get("miesiacKwitnienia").in(poraKwitnieniaQuery));
        }





        query.where(cb.and(predicates.toArray(new Predicate[predicates.size()])));

        query.select(root.get("id")).distinct(true);
        List<Plant> plants = em.createQuery(query.select(root)).getResultList();

        return plants;

    }

}

