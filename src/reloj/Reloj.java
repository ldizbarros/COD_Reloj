package reloj;

import java.util.Timer;
import java.util.TimerTask;

public class Reloj {
    
    Timer timer;
    
    public static void main(String[] args) {
        Metodos obj =  new Metodos();
        obj.opcionesRelog();
    }
    
    public Reloj() {
        timer = new Timer();
        timer.schedule(new TicTac(), 0, 1000);
    }
    
      public class TicTac extends TimerTask {
        
        @Override
        public void run() {
            Display.mostrarReloj(); 
        }
    }
}
