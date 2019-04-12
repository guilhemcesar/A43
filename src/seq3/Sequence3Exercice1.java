package seq3;

public class Sequence3Exercice1 {

    public static void main(String[] args) {

        int tab[] = new int[100];
        int i;

        for (i = 0; i < 100; i++) {
            tab[i] = i;
        }

        int sum = 0;
        for (i = 0; i<100; i++){
            sum += tab[i];
        }
        System.out.println(sum);
    }
}