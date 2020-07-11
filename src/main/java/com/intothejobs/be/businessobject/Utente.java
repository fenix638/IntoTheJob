package com.intothejobs.be.businessobject;

import org.apache.commons.lang3.RandomStringUtils;

public class Utente {
    private Integer idUtente;
    private String nome;
    private String cognome;
    private Integer eta;
    private String pass;
    private String urlPhoto = "https://picsum.photos/200/300";

    public Utente(Integer id,String nome, String cognome, Integer eta,String password) {
        this.idUtente = id;
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.pass = password;
        System.out.println(this.nome + " , "+this.pass);

    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public Integer getIdUtente() {
        return idUtente;
    }

    public void setIdUtente(Integer idUtente) {
        this.idUtente = idUtente;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public Utente(){}
}
