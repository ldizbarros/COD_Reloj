package reloj;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Metodos {
    public void opcionesRelog(){
        Display.menu();
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("elige una opcion"));
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case 1: new Reloj();
                    break;
            case 2:
                   break;
            case 3: 
                   break;
            case 0:break;
        }
    }
}
