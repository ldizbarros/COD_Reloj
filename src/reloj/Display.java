package reloj;

import java.util.Date;

public class Display {
    public static void mostrarReloj(){
        Date fecha = new Date();
        System.out.println(fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds());
    }
    
    public static void menu(){
        System.out.println("************************\n"
                         + "*    1)Mostar Hora     *\n"
                         + "*    2)Crear Alarma    *\n"
                         + "*    3)Cambiar Hora    *\n"
                         + "*    0)OFF             *\n"
                         + "************************\n");
    }
}
