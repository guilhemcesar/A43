package seq3;

import com.cesar.a43.seq2compteur.Compteur;

public class Sequence3Exercice2 {

    public static void main(String[] args) {

        Compteur[] tableauDeCompteurs = new Compteur[100];

        for( int i = 0; i < 100; i++) {
            for (int j = 0; j < i; j++) {
                tableauDeCompteurs[i].up();
            }
        }

        for( int i = 0; i < 100; i++){
            System.out.println(tableauDeCompteurs[i].getValue());
        }
    }
}