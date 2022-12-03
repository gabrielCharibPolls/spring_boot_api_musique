package com.example.gabriel_charib_musique_api.service;

import com.example.gabriel_charib_musique_api.modele.Artiste;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
/////////////////////////////////////////////////////////////////////////////
//normalment dans la vrai vie c'est ici que on returne les vrai infortions
//attention c'est important mettre qu'il s'agit d'un service
////////////////////////////////////////////////////////////////
@Service
public class ArtisteService {
    private List<Artiste> Artistes = Arrays.asList(new Artiste(1,"YOUSSOUPHA","UN ARTISTE CONGOLAIS" ),
            (new Artiste(2,"Porta","un Artiste Catalan")));


    //cette methode returne la truc d'avant
    public List<Artiste>getArtistes(){
         return  Artistes;
    }

    public Artiste getUnArtiste(Integer id){
        for(Artiste artiste:Artistes){
            if(id.equals(artiste.getId())){
                return artiste;
            }
        }
        return null;
    }
}
