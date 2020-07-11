package com.intothejobs.be.dao;

import com.intothejobs.be.businessobject.Utente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserDao {


    List<Utente> getAll();

    Utente getUtenteById(Integer id);

    List<Utente> getUtentiByNome(String nome);

}
