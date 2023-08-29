public class HolaMundo {
    public static void main(String [] args){
        String saludar= "Ahhhhhh medio metrooooo!";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());

        //podemos usar var para definir variables dinamicas el valor determinara el tipo
        var edad=25;
        System.out.println(edad);
        
        // se puede definir un char con su codigo unicode este se puede encontrar en mapa de caracteres (windows)
        char caracter = '\u0040';
        char decimal = 64; //codigo decimal
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);

        //caracteres especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char salto = '\n';
        char retornoCarro = '\r';  //retrocede el cursor

        //line separator combina \n\r
        System.out.println("caracter = " + System.lineSeparator() + caracter);

        //conversion en distintos tipos numericos
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);

        System.out.println(" numero binario de " + numeroDecimal+ " = " + Integer.toBinaryString(numeroDecimal));
        
        //anteponiendo 0b java entiende que es un binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        System.out.println("numero octal de = " + numeroDecimal+ " = " + Integer.toOctalString(numeroDecimal));
        
        //anteponiendo un 0 java entiende que es un numero octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        //0x para numeros hexadecimales
        int numeroHexa = 0x1f4;
        System.out.println("numeroHexa = " + numeroHexa);

        //para convertir tipos de datos usamos Integer.parseInt, Double.parseDouble, Boolean.parseBoolean, etc
        //para convertir a estring existen dos metodos: valueOf o tambien Double.toString, Boolean.toString,etc

        int numero = 100;
        String numeroStr = Integer.toString(numero);
        numeroStr = String.valueOf(numero);
        System.out.println(numeroStr);

        //tambien podemos hacer casting para convertir entre numeros primitivos
        int i = 10000;
        short s = (short)i; //casting
        long l = i; //no es necesario el casting

        //existen dos maneras de concatenar "+" y .concat

        String nombre = new String("Ulises");
        String apellido = "Garibay";

        System.out.println(nombre + " " + apellido);
        System.out.println(nombre.concat(" ").concat(apellido)); //mas eficiente

        //el metodo .concat() no altera la informacion del string ni .transform() ni .replace() esto es
        //inmutabilidad
        String resultado = nombre.concat(" obedece a tu papa ah ah, y tambien a tu mama ah ah");
        System.out.println(nombre);
        System.out.println(resultado);

        //funcion lamda
        nombre.transform(c -> {
            return c + "con " + apellido;
        });
        System.out.println(nombre);

        //replace remplaza un caracter por otro
        String nombre2 = nombre.replace("i","&");
        System.out.println(nombre2);
     }
}