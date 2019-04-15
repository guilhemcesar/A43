package seq5;

import java.util.TimerTask;

public class ExitTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Délai atteint !");
        System.exit(0);
    }
}