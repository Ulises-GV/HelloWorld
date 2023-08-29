import java.util.Properties;

public class PropiedadesDeSistema {
    public static void main(String[] agrs){
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        String lineSeparator2 = System.lineSeparator(); //es lo mismo que lo de arriba solo usando el metodo
        System.out.println("lineSeparator: "   + lineSeparator + " una linea nueva");
        System.out.println("lineSeparator2: "   + lineSeparator2 + " una linea nueva");

        //asi podemos listar todas las propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
