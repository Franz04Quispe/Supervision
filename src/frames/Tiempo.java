
package frames;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Franz Joel Quispe Mamani, Rodrigo Escobar Condori
 * Esta clase sirve para poder obtener la fecha y hora en un jtextfield y posterior poder capturar esa info
 */
public class Tiempo {
    Calendar fecha = new GregorianCalendar();
    //FECHA
    String anho = Integer.toString(fecha.get(Calendar.YEAR));
    String mes = Integer.toString(fecha.get(Calendar.MONTH)+1);//el mes salia atrasado en un numero
    String dia = Integer.toString(fecha.get(Calendar.DATE));
    //Formato para la fecha en PostgreSQL año-mes-dia
    String fechaCompleta =anho+"-"+mes+"-"+dia;
    //HORA
    String hora = Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
    String minuto = Integer.toString(fecha.get(Calendar.MINUTE));
    String segundo = Integer.toString(fecha.get(Calendar.SECOND));
    //Formato para la hora en PostgreSQL HH:MM:SS
    String horaCompleta = hora+":"+minuto+":"+segundo;
}
