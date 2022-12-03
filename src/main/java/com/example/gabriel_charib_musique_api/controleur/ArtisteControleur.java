package com.example.gabriel_charib_musique_api.controleur;
import com.example.gabriel_charib_musique_api.modele.Artiste;
import com.example.gabriel_charib_musique_api.service.ArtisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
public class ArtisteControleur {
    ///////////////////////////////////////////////////////////////////////////////////
    //cette classe va permmetre de de pouvoir interagir avec la clase artiste
    ////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////
    //comme en asp.net on va injecter les dependances
    //c'est simple avec une variable
    //////////////////////////////////////////////////////


    @Autowired // -> injecter les dependances
    private ArtisteService artisteService;

    @RequestMapping("/artistes")
    public List<Artiste> getArtist(){
        return artisteService.getArtistes();
    }

    ////////////////////////////////////////////////////////////////////
    //retourner juste un artsite
    ////////////////////////////////////////////////////////////////////

    @RequestMapping("/artiste/{id}")
    public  Artiste getARtiste(@PathVariable Integer id){
         return artisteService.getUnArtiste(id); //pas oublier le parametre
    }


}
