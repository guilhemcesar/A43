package com.cesar.a43.seq2compteur;

public class Compteur {

    int value;

    void raz(){
        this.value = 0;
    }

    void up(){
        this.value++;
    }

    int getValue(){
        return value;
    }
}
