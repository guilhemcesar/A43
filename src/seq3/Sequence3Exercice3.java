package seq3;

public class Sequence3Exercice3 {

    public static void main(String[] args){

        Integer tab[] = new Integer[100];

        Integer i;
        for(i = 0; i < 100; i++){
            tab[i] = i;
        }

        Integer sum = 0;
        for(i = 0; i < 100; i++){
            sum += tab[i];
        }

        System.out.println(sum);
    }
}
