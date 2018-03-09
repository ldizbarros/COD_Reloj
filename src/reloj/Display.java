package reloj;

import java.util.Date;

public class Display {
    public static void mostrarReloj(){
        Date fecha = new Date();
        System.out.println(fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
    }
    
    public static void menu(){
        System.out.println("************************\n"
                         + "*    1)Mostrar Hora    *\n"
                         + "*    2)Crear Alarma    *\n"
                         + "*    3)Activar Alarma  *\n"
                         + "*    4)Parar Alarma    *\n"
                         + "*    0)OFF             *\n"
                         + "************************\n");
    }
}
