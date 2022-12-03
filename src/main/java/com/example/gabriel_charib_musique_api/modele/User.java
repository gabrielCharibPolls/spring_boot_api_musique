package com.example.gabriel_charib_musique_api.modele;

import javax.persistence.*;
import java.util.Collection;

@Entity
//////////////////////////////////////////////////////////////////////
//je donne le nom de la table + je dis que le mail doit etre unique
//////////////////////////////////////////////////////:
@Table(name = "users",uniqueConstraints = @UniqueConstraint(columnNames = "mail"))

public class User {
    ////////////////////////////////////////////////
    //le model pour les utilisateurs
    ///////////////////////////////////////////////

    /////////////////////////////////////////////////
    //preceiser que id est genere automatiquement
    //////////////////////////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private  String FristName;
    private  String LastName;
    private String mail;
    private String password;

    /////////////////////////////////////////////////////////
    ///la on va cree les asociations : many to many
    // on va aussi dire que que la supresion sera en cascade
    // on va aussi faire une jointure
    //////////////////////////////////////////////////////////

    @ManyToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL )
    @JoinTable
    ///////////////////////////////////////////////////////////
    //
    //// SELECT *
    ///    FROM user
    //      INNER JOIN B ON user.id = role.id
    ///////////////////////////////////////////////////////////////
            (name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id",referencedColumnName = "id"),
                    inverseJoinColumns = @JoinColumn(
                            name = "user_id",referencedColumnName = "id"))
    private Collection<Role> roles;


    public User(Long id, String fristName, String lastName, String mail, String password, Collection<Role> roles) {
        this.id = id;
        FristName = fristName;
        LastName = lastName;
        this.mail = mail;
        this.password = password;
        this.roles = roles;
    }

    public User(Collection<Role> roles) {

        this.roles = roles;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getFristName() {
        return FristName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMail() {
        return mail;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFristName(String fristName) {
        FristName = fristName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
