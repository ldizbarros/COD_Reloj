package reloj;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Metodos {
    
    Timer timer;
    static int horaAlarma,minAlarma;
    static boolean alarmaON=false,parar=false;
  
    public static void crearAlarma(int hora, int min){
        if (horaAlarma!=0 && minAlarma!=0){
            JOptionPane.showMessageDialog(null, "Ya hay una alarma creada\n"+horaAlarma+":"+minAlarma);
        }else{
            horaAlarma = hora;
            minAlarma = min;
            JOptionPane.showMessageDialog(null, "Alarma creada");
        }
    }
   
    public void activarAlarma() {
        if (horaAlarma==0 && minAlarma==0){
            JOptionPane.showMessageDialog(null, "No hay ninguna alarma creada. Crea una primero");   
        }else{
            alarmaON=true;
            JOptionPane.showMessageDialog(null, "Alarma activada");
            timer = new Timer();
            timer.schedule(new TicTac(), 0, 1000);
        }
    }
    
    public static void pararAlarma(){
        parar=true;
        horaAlarma=0;
        minAlarma=0;
    }
       
    public class TicTac extends TimerTask {
        
        @Override
        public void run() {
            Date fecha = new Date();
            if (horaAlarma==fecha.getHours() && minAlarma==fecha.getMinutes()){
                if (parar==false){
                    System.out.println("TIC TIC TIC TIC TIC TIC TIC!!!!!!");
                }
            }
        }
    }
}
