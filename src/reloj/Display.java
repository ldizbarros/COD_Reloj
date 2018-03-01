package reloj;

import java.util.Date;

public class Display {
    public static void mostrarReloj(){
        Date fecha = new Date();
        System.out.println(fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
    }
}
