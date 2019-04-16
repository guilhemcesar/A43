package seq5;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import static seq5.generateRandomNb.getRandomNumber;

public class Main {

    public static void main(String[] args) {

        Timer time = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Délai atteint !");
                System.exit(0);
            }
        };
        time.schedule(task ,60000);

        int i = 0;
        int j;
        int a[] = new int[20];
        int b[] = new int[20];
        boolean juste;
        int nbSucces = 0;

        for(i = 0; i < 20; i++) {
            a[i] = getRandomNumber();
            b[i] = getRandomNumber();
        }

        for(i = 0; i < 20; i++) {

            j = 101;

            do {

                System.out.println(a[nbSucces] + " x " + b[nbSucces] + " =");
                Scanner sc = new Scanner(System.in);
                j = sc.nextInt();
                juste = j == a[nbSucces]*b[nbSucces];

                if(juste){
                    nbSucces++;
                    System.out.println("Bien ! Votre score : " + nbSucces +"/20");
                }
                else System.out.println("Echec !Votre score : " + nbSucces +"/20");

            }while (j != a[i]*b[i]);
        }
    }
}
