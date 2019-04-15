package seq3.Chronometre;

public class Chronometre {

    static long start;
    static long duree;
    boolean run;


    //Chronometre(){start();}

    Chronometre(){}

    void start() {
        start = System.currentTimeMillis();
        run = true;
    }

    void stop() {
        duree += (System.currentTimeMillis() - start);
        run = false;
    }

    long getTime() {

        if(run) return duree + ( System.currentTimeMillis()- start);
        else return duree;
    }

    void raz() {
        start();
        duree = 0;
        run = false;
    }
}