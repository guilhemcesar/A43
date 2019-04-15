package seq3.Chronometre;

public class Main {

    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }



    public static void main(String[] args) {
        ChronoNoParam chrono = new ChronoNoParam();
        System.out.println(chrono.getTime());
        chrono.start();
        delay(100);
        System.out.println(chrono.getTime());
        delay(100);
        chrono.setLapTime();
        delay(100);
        chrono.stop();
        chrono.setLapTime();
        System.out.println(chrono.getTime());
        delay(100);
        chrono.start();
        delay(100);
        chrono.stop();
        System.out.println(chrono.getTime());
        chrono.setLapTime();
        chrono.raz();
        System.out.println(chrono.getTime());
    }
}