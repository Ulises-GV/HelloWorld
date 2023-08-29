import java.util.Random;

public class ClaseMath {
    public static void main(String[] args) {
        
        int absoluto = Math.abs(-10);
        double max = Math.max(1,7.9);
        double min = Math.min(5.5, 4.3);
        
        double roundup= Math.ceil(8.5); //redondea hacia arriba
        double rounddown = Math.floor(3.5); // redodndea hacia abajo

        System.out.println("rounddown = " + rounddown);
        System.out.println("roundup = " + roundup);
        
        long entero = Math.round(3.6); //redondea
        
        double exp = Math.exp(1); //exponencial de euler
        System.out.println("exp = " + exp);
        double log = Math.log(10);
        double potencia = Math.pow(10,3);
        double raiz = Math.sqrt(4);

        double grados = Math.toDegrees(1.57); // convierte radianes a grados
        grados = Math.round(grados);
        double radianes  = Math.toRadians(90.00); // convierte a radianes

        //--------------------------------------------------------------------------------------------------

        String [] colores = {"azul", "negro", "sacas", "rojo", "morado"};

        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;
        System.out.println("random = " + random);

        random = Math.floor(random); // se usa floor por que se esta multiplicando random por 5 pero nuestro arreglo va de 0 a 4
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]); // para imprimir el color con el indice

        //otra forma de crear un numero aleatorio es con la clase random
        Random randomObj = new Random();
        int randomint = -10 + randomObj.nextInt(7+10); //genera un numero entre -10 y 7
        double randomdouble = randomObj.nextDouble();
        long randomlong = randomObj.nextLong();

        System.out.println("randomint = " + randomint);

        randomint = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomint);
        System.out.println("colores = " + colores[randomint]);

    }
}
