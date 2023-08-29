import java.util.Map;

public class VariablesDeEntorno {
    public static void main(String[] args) {
        //esto es un diccionario parecido a los usados en python
        Map<String, String> varEnv = System.getenv(); // con el metodo getenv() obtenemos toda la coleccion de variables de entorno
        System.out.println("variables de ambiente o entorno del sistema = " + varEnv);

        //con esto obtenemos una variable de entorno especifica
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javahome = System.getenv("JAVA_HOME");
        System.out.println("javahome = " + javahome);
        
        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        //otra forma de obtener el path como arriba es usando la variable del diccionario que creamos con map
        String path2 = varEnv.get("Path");
        System.out.println("path2 = " + path2);

        //se pueden crear variables de entorno desde la consola de la sig manera
        //setx SALUDAR_HOLA "Hola wey caite con un 20"

        System.out.println("listando todas las variables de entorno de una por una -----------------------");
        for (String key: varEnv.keySet()) { //de esta forma podemos mostrar la llave y el valor
            System.out.println(key + " => " + varEnv.get(key));
        }

    }
}
