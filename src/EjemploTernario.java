import java.util.Scanner;

public class EjemploTernario {
    public static void main(String[] args){
        String[] usernames = {"andres", "admin", "pepe"};
        String[] passwords = {"1234", "12345", "123456"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el username:");
        String u = scanner.next();

        System.out.println("ingrese el password:");
        String p = scanner.next();

        boolean esAutenticado = false;

        for(int i=0; i < usernames.length; i++){
            //operador ternario hace lo mismo que el if pero no puede hacer uso de break
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true: esAutenticado;
            /*if(usernames[i].equals(u) && passwords[i].equals(p)){
                esAutenticado = true;
                break;
            }*/
        }
        //siempre devuelve dos valores que tienen que ser del mismo tipo que ser del mismo tipo de la variable
        // que le asignamos el operador ternario
        String mensaje = esAutenticado ? "Bienvenido wey ".concat(u).concat("!"): "nel perro :v";
        System.out.println(mensaje);
        /*if(esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else{
            System.out.println("Username o contraseña incorrecto");
            System.out.println("me quieres ver la cara de estupida?");
        }*/
        //------------------------------------------------------------------------------------------
        int max = 0;
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int num1 = s.nextInt();

        System.out.println("ingresa otro numero wey");
        int num2 = s.nextInt();

        System.out.println("otro mas wey");
        int num3 = s.nextInt();

        System.out.println("un ultimo wey");
        int num4 = s.nextInt();

        max = (num1 > num2) ? num1: num2;
        max = (max > num3) ? max: num3;
        max = (max > num4) ? max: num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es: " + max);
    }
}
