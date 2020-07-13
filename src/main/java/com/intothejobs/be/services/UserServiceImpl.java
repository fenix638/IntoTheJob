package com.intothejobs.be.services;

import com.intothejobs.be.businessobject.Utente;
import com.intothejobs.be.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public List<Utente> getAll() {
        return this.dao.getAll();
    }

    @Override
    public Utente getUtenteById(Integer id) {
        return this.dao.getUtenteById(id);
    }

    @Override
    public List<Utente> getUtenteByNome(String nome) {
        return this.dao.getUtentiByNome(nome);
    }
}
