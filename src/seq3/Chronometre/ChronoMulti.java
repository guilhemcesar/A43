package seq3.Chronometre;

public class ChronoMulti extends Chronometre {

    long lapTime[] = new long[100];
    int i;

    void setLapTime(){
        lapTime[i] = System.currentTimeMillis()-start;
        i++;
    }

    long getLapTime(int i){
        return lapTime[i];
    }

}