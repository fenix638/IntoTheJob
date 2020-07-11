package com.intothejobs.be.dao;

import com.intothejobs.be.businessobject.Utente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserDaoImpl implements UserDao {

    private final List<Utente> fakeDb;


    public UserDaoImpl() {
        Utente u = new Utente(1, "Cristian", "Rossi", 23, "ciaoAmico");
        Utente a1 = new Utente(2, "Luca", "Bianchi", 33, "ciao");
        Utente aa = new Utente(3, "Marco", "Giancapello", 44, "ehila");
        Utente aaa = new Utente(4, "Marco", "Lucca", 44, "1234");
        this.fakeDb = new ArrayList<>(Arrays.asList(u, a1, aa,aaa));
    }

    @Override
    public List<Utente> getAll() {
        return this.fakeDb;
    }

    @Override
    public Utente getUtenteById(Integer id) {
        List<Utente> lista = this.fakeDb.stream()
                .filter(ut -> ut.getIdUtente().equals(id))
                .collect(Collectors.toList());
        return !lista.isEmpty() ? lista.get(0) : null;

    }

    @Override
    public List<Utente> getUtentiByNome(String nome) {
        return this.fakeDb.stream()
                .filter(u -> u.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }
}
