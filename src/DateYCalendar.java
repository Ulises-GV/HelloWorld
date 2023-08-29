import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateYCalendar {
    public static void main(String[] args) throws ParseException {

        Date fecha = new Date();
        System.out.println("fecha = " + fecha );

        //cambia el formato de como aparece la fechha algunas otras opciones son ("dd/MM/yyyy") o ("dd-MMMM-yyyy"), etc
        SimpleDateFormat df = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaStr = df.format(fecha);

        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for(int i = 0; i<100000; i++){
            j += i;
        }
        System.out.println("j = " + j);
        
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("tiempoFinal = " + tiempoFinal);

        //creamos el objeto de la clase calendar pero como estatica usamos el metodo y el nombre de la clase
        // osea no usaremos el new
        Calendar calendario = Calendar.getInstance();

        calendario.set(2020, 0, 25, 19, 20, 10);
        calendario.set(Calendar.MILLISECOND, 125); //otra forma de asignar valorespor separado
        Date fecha3 = calendario.getTime();
        System.out.println("calendario = " + fecha3);
        
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormato = formato.format(fecha);
        System.out.println("fechaFormato = " + fechaFormato);

        //=================================================================================================
        //ejemplo como pasar de un string a un formato fecha

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("ingrese un fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha4 = format.parse(s.next());
            System.out.println("fecha4 = " + fecha4);
            System.out.println("format = " + format.format(fecha4));

            Date fecha5 = new Date();
            if(fecha4.after(fecha5)){
                System.out.println("Fecha del usuario es despues que la fecha del sistema");
            }else if(fecha4.before(fecha5)){
                System.out.println("Fecha del usuario es antes que la fecha del sistema");
            } else if(fecha4.equals(fecha5)) {
                System.out.println("Son iguales homs");
            }
            //otra forma de comparar
            if(fecha4.compareTo(fecha5) > 0){
                System.out.println("es despues homs");
            }else if (fecha4.compareTo(fecha5)<0){
                System.out.println("es antes homs");
            }else if (fecha4.compareTo(fecha5)==0){
                System.out.println("es igual igualita homs");
            }

        }catch (ParseException e){
            //e.printStackTrace();
            System.err.println("La fecha de formato es incorrecta "+ e.getMessage());
            System.err.println("el formato debe ser 'yyyy-MM-dd'");
            //System.exit(1);
            main(args); //volvemos a ejecutar el main para que se ingrese la fecha
        }

    }
}
