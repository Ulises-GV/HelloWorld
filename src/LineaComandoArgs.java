public class LineaComandoArgs {
    public static void main(String[] args) {
/*
        // aplicacion para ejecutar desde terminal y pasar los parametros
        if (args.length == 0) {
            System.out.println("Debes ingresar argumentos puto");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n° " + i + ": " + args[i]);
        }
        //para caracteres especiales com asentos podemos compilar desde consola
        // pasando por argumento javac LineaComandoArgs.java -encoding utf8

        //------------------------------------------------------------------------------
*/
        if(args.length !=3){
            System.out.println("ingresa una operacion (suma, resta, multiplicacion, division) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        double resultado = 0.00;
        switch(operacion){
            case "suma":
                resultado = a+b;
                break;
            case "resta":
                resultado = a-b;
                break;
            case "multiplicacion":
                resultado = a*b;
                break;
            case "division":
                if (b==0){
                    System.out.println("no se puede dividir por 0 joto");
                    System.exit(-1);
                }
                resultado = (double)a/b;
                break;
            default:
                resultado = a+b;
                break;
        }

        System.out.println("resultado de la operacion "+ operacion+ " es: " + resultado);
    }
}
