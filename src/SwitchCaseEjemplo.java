import java.util.Scanner;

public class SwitchCaseEjemplo {
    public static void main (String[] args){

        // calculo del agno bisiesto
        Scanner s =  new Scanner(System.in);

        System.out.println("ingrese numero de mes");
        int mes = s.nextInt();

        int numero_dias = 0;
        System.out.println("ingrese el año (YYYY)");
        int agno = s.nextInt();

        // switch case usa un formato en cascada hasta que no encuentra un  break
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numero_dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numero_dias = 30;
                break;
            case 2:
                if (agno % 400 == 0 || ((agno % 4 == 0) && !(agno % 100 == 0))){
                    numero_dias = 29;
                } else {
                    numero_dias = 28;
                }
                break;
            default:
                numero_dias = 0;

        }

        System.out.println("numero_dias = " + numero_dias);

        //se puede utilizar el ciclo for de mas maneras por ejemplo:

        int i = 0; // podemos declarar la variable como global fuera del for
        for(; ;){
            if(i > 5) { //esta concicion remplaza hasta donde queremos correr el for
                break;
            }

            System.out.println("i = " + i);

            i++; //podemos poner el incremento fuera de la funcion
        }
        System.out.println("el valor final de la variable global despues del for es:");
        System.out.println("i = " + i);

    }
}
