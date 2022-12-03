package com.example.gabriel_charib_musique_api.modele;

///////////////////////////////////////////////////
//classe qui permet de gere les roles
////////////////////////////////////////////


//////////////////////////////////////////////////
////la meme chose que avant pas oublier l'entity
//////////////////////////////////////////////////

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name ;


    public Role(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
