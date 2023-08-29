import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args){

        String numeroStr = JOptionPane.showInputDialog("Ingrese un entero: ");

        int numeroDecimal=0;
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "error debe ingresar un entero");

            //en caso de error se vuelve a invovar el metodo main y se repite el proceso
            main(args);
            System.exit(0); //para que se corte el flujo y no se repita otra vez lo de abajo
        }



        System.out.println("numeroDecimal = " + numeroDecimal);

        String mensaje = "Numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nnumero Hexa de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);


    }
}
