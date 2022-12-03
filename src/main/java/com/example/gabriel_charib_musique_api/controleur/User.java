package com.example.gabriel_charib_musique_api.controleur;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





//c'est ci est une methode => simple
//avec  cette methode on va faire un web service
// donc on doit la declarer comme rest controleur

@RestController//a grace de ça on vien de cree un mini service
public class User {
    @RequestMapping("/hello")//Le lien ou la methode est accessible
    public String salut(){
        return "salut";
    }

    @RequestMapping("/")//Le lien ou la methode est accessible
    public String home(){
        return "home";
    }

}
