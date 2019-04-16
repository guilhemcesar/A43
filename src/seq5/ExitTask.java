package seq5;

import java.util.Timer;
import java.util.TimerTask;

public class ExitTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Délai atteint !");
        System.exit(0);
    }
    Timer time = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
             System.out.println("Délai atteint !");
             System.exit(0);
        }
    };
    time.schedule(task, 60000);
}