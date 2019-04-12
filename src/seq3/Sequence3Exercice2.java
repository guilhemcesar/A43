package seq3;

import com.cesar.a43.seq2compteur.Compteur;

public class Sequence3Exercice2 {

    public static void main(String[] args) {

        Compteur tableauDeCompteurs[] = new Compteur[100];



        int i, j;
        for(i = 0; i < 100; i++){
            for(j = 0; j < i; j++){
                tableauDeCompteurs[i].up();
            }
        }


        int sum = 0;
        for(i = 0; i < 100; i++){
            sum += tableauDeCompteurs[i].getValue();
        }
    }
}