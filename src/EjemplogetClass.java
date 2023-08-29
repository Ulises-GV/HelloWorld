import java.lang.reflect.Method;

public class EjemplogetClass {
    public static void main(String [] args){
        String texto = "puro cabeceo puro cabeceo";
        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getName());

        //imprime todos los metodos de la clase String
        for (Method metodo: strClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num  = 34;
        Class intClass = num.getClass();
        Class objClass = intClass.getSuperclass().getSuperclass();
        System.out.println("intClass = " + intClass.getName());
        System.out.println("objClass = " + objClass);

        System.out.println();
        for(Method metodo: objClass.getMethods()){
            System.out.println("metodo.getName() = " + metodo.getName());
        }

    }
}
