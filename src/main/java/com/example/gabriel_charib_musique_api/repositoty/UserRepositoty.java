package com.example.gabriel_charib_musique_api.repositoty;

import com.example.gabriel_charib_musique_api.modele.User;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//////////////////////////////
//creation d'une interface
//////////////////////////////


@Repository
public interface UserRepositoty extends JpaRepository<User,Long> {
}
