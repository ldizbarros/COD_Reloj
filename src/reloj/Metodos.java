package reloj;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Metodos {
    
    Timer timer;
    int horaAlarma,minAlarma;
    boolean alarmaON=false,parar=false;
    
    public void opcionesRelog(){
        Display.menu();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("elige una opcion"));
        switch (opcion){
            case 1: Display.mostrarReloj();
                    opcionesRelog();
                   break;
            case 2: crearAlarma();
                   break;
            case 3: activarAlarma();
                   break;
            case 4: pararAlarma();
                   break;
            case 0:break;
        }
    }
    
    public void crearAlarma(){
        if (horaAlarma==0 && minAlarma==0){
            System.out.println("Introduce la hora de tu alarma:");
            horaAlarma = Integer.parseInt(JOptionPane.showInputDialog("HORA:"));
            minAlarma = Integer.parseInt(JOptionPane.showInputDialog("MINUTOS:"));
        }else{
            System.out.println("Alarma creada: "+horaAlarma+":"+minAlarma);
            if(alarmaON==true){
                System.out.println("La alarma esta activada");
            }else{
                System.out.println("La alarma no esta activada");
                String alarma = JOptionPane.showInputDialog("Activar la alarma? SI/NO");
                if (alarma.equalsIgnoreCase("SI")){
                    activarAlarma();
                }
            }
        }
        opcionesRelog();
    }
   
    public void activarAlarma() {
        if (horaAlarma==0 && minAlarma==0){
            String alarma = JOptionPane.showInputDialog("No hay ninguna alarma creada. Quieres crear una?");
            if (alarma.equalsIgnoreCase("SI")){
                crearAlarma();
            }else{
                opcionesRelog();
            }   
        }else{
            String alarma = JOptionPane.showInputDialog("Activar la alarma? SI/NO");
            if (alarma.equalsIgnoreCase("SI")){
                alarmaON=true;
            }else{
                alarmaON=false;
            }
            if (alarmaON==true){
                timer = new Timer();
                timer.schedule(new TicTac(), 0, 1000);
                opcionesRelog();
            }
        }
    }
    
    public void pararAlarma(){
        parar=true;
        horaAlarma=0;
        minAlarma=0;
        opcionesRelog();
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
