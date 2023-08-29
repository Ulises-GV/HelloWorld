//import javax.swing.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");

        int numeroDecimal=0;
        try{
            numeroDecimal = scanner.nextInt();
        } catch(InputMismatchException e){ //tambien pudimos usar Exception que es la general
            System.out.println("Error debe ingresar un numero entero");
            //en caso de error se vuelve a invovar el metodo main y se repite el proceso
            main(args);
            System.exit(0); //para que se corte el flujo y no se repita otra vez lo de abajo
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero Hexa de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);


    }
}
