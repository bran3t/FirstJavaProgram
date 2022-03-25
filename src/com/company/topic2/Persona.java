package com.company.topic2;

public class Persona {
    public String numePersona;
    private int virsta;
    protected boolean casatorit;
    // ctrl+shift+J remove spaces
    // ctrl+alt+L asezarea codului
    // setter pentru virsta
    public void setVirsta (int virstaAtribuita){
        this.virsta = virstaAtribuita;
        System.out.println("Virsta atribuita este " + this.virsta);
    }
    // getter pentru virsta
    public int getVirsta () {

        return this.virsta;
    }
}

