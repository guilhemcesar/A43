package com.cesar.a43.seq2compteur;

public class Compteur {

    private int value;

    public void raz(){
        this.value = 0;
    }

    public void up(){
        this.value++;
    }

    public int getValue(){
        return value;
    }
}