package seq5;

import java.util.Random;

public class RandomCouple {

    public int a;
    public int b;


    static int getRandomNumber() {
        return (int)(Math.random() * 10);
    }

    RandomCouple(){
        a = getRandomNumber();
        b = getRandomNumber();
    }

    void generateCouple(){
        a = getRandomNumber();
        b = getRandomNumber();
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}