package com.intothejobs.be.services;

import com.intothejobs.be.businessobject.Utente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<Utente> getAll();
    Utente getUtenteById(Integer id);
    List<Utente> getUtenteByNome(String nome);
}
