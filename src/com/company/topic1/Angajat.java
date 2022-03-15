package com.company.topic1;

public class Angajat {

    public Angajat (String numeAtribuit, int virstaAtribuita){
        this.nume = numeAtribuit;
        virsta = virstaAtribuita;
    }

    String nume;
    int virsta;
    double salariu;
    String gen;

    void seteazaSalariu (double salariu){
        this.salariu = salariu;
        System.out.println(this.nume + " are salariu  " + salariu);
    }

}
