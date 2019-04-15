package seq5;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

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
        int a[] = new int[20];
        int b[] = new int[20];

        for(i = 0; i < 20; i++) {

            System.out.println(a[i] + " x " + b[i] + " =");
            Scanner sc = new Scanner(System.in);
            int j = sc.nextInt();

            if()


        }
    }
}
