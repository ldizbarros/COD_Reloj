package reloj;

import java.util.Date;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;

public class Metodos {
    
    Timer timer;
    int hora,minutos;
    
    public void opcionesRelog(){
        Display.menu();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("elige una opcion"));
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case 1: new Reloj();
                   break;
            case 2: crearAlarma();
                   break;
            case 3: 
                   break;
            case 0:break;
        }
    }
    
    public void crearAlarma(){
        System.out.println("Introduce la hora de tu alarma:");
        hora = Integer.parseInt(JOptionPane.showInputDialog("HORA:"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("MINUTOS:"));
        new Metodos();
    }
   
    public Metodos() {
        timer = new Timer();
        timer.schedule(new TicTac(), 0, 1000);
    }
    
    public class TicTac extends TimerTask {
        
        @Override
        public void run() {
            Date fecha = new Date();
            if (hora==fecha.getHours() && minutos==fecha.getMinutes()){
                System.out.println("TIC TIC TIC TIC TIC TIC TIC");
                opcionesRelog();
            }
        }
    }
}
