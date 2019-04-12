package com.cesar.a43.seq2compteur;

public class Main {

    public static void main(String[] args) {

        Compteur compt = new Compteur();

        compt.raz();
        compt.up();
        compt.up();
        compt.up();
        System.out.println(compt.getValue());
        compt.up();
        compt.raz();
        System.out.println(compt.getValue());
    }
}