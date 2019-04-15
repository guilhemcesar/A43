package seq3.Chronometre;

public class ChronoMono extends Chronometre {

    long lapTime;

    void setLapTime(){
        lapTime = System.currentTimeMillis()-start;
    }

    long getLapTime(){
        return lapTime;
    }
}
