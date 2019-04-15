package seq3.Chronometre;

public class ChronoNoParam extends Chronometre {

    long lapTime[] = new long[100];
    int i = 1;


    void setLapTime(){
        lapTime[i] = System.currentTimeMillis()-start;
        if(i != 1){
            System.out.println(lapTime[i - 1]);
        }
        this.i = this.i + 1;
    }
}
