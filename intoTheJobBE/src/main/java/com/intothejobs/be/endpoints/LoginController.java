package com.intothejobs.be.endpoints;


import com.intothejobs.be.businessobject.Utente;
import com.intothejobs.be.dao.UserDao;
import com.intothejobs.be.model.UserBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LoginController {

    @Autowired
    UserDao dao;

    @PostMapping("/login")
    public ResponseEntity<Utente> auth(@RequestBody UserBean userToAuth) {
        List<Utente> list = this.dao.getAll()
                .stream()
                .filter(ut -> ut.getNome().equalsIgnoreCase(userToAuth.getUsername()) && ut.getPass().equals(userToAuth.getPassword()))
                .collect(Collectors.toList());
        return !list.isEmpty() ? new ResponseEntity<>(list.get(0),HttpStatus.FOUND) : new ResponseEntity<>(HttpStatus.NOT_FOUND)        ;
    }

    @GetMapping("/getUserById/{id}")
    public ResponseEntity<Utente> getUtente(@PathVariable("id") String id){
        Utente retrieved = null;
        if(StringUtils.isNumeric(id)) {
            retrieved = this.dao.getUtenteById(Integer.parseInt(id));
         return    retrieved != null ? new ResponseEntity<>(retrieved, HttpStatus.FOUND):
                    new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
