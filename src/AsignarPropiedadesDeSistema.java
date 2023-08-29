import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args){
        //vamos a agregar propiedades de sistema usando el archivo config.properties

        try {
            //carga el archivo
            FileInputStream archivo = new FileInputStream("src/config.properties");

            //creamos el objeto p y obtenemos las propiedades del sistema
            Properties p = new Properties((System.getProperties()));

            p.load(archivo); // cargamos el archivo y abajo creamos otra propiedad personalizada
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            System.setProperties(p); //fijamos las propiedades del objeto p

            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(...) = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println("System.getProperty() = " + System.getProperty("config.puerto.servidor"));
            ps.list(System.out); //finalmente obtenemos las propiedades del sistema
        }catch (Exception e){
            System.err.println("No existe el archivo homi " + e ); //.err nos muestra el mensaje como error
            System.exit(1); //acaba la ejecucion del programa si algo sale mal
        }
    }
}
