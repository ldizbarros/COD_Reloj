package reloj;

import java.util.Date;

public class Display {
    public static String mostrarReloj(){
        Date fecha = new Date();
        return fecha.getHours()+":"+fecha.getMinutes()+":"+fecha.getSeconds();
    }
}
