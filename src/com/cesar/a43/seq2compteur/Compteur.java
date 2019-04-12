package com.cesar.a43.seq2compteur;

public class Compteur {

    int value;

    void raz(){
        this.value = 0;
    }

    public void up(){
        this.value++;
    }

    public int getValue(){
        return value;
    }
}
