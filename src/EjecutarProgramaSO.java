public class EjecutarProgramaSO {
    public static void main(String[] args) {

        //este programa nos ejecuta el bloc de notas

        Runtime rt = Runtime.getRuntime();
        Process proceso;
        try {
            //se puede usar el metodo starwith para ver si empieza con eso
            if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
                proceso = rt.exec("notepad");
                //aqui usamos el metodo contain para ver si el nombre del sistema contine esa cadena
            } else if (System.getProperty("os.name").toLowerCase().contains("nux") || System.getProperty("os.name").startsWith("nix")) {
                proceso = rt.exec("texedit");
            } else{
                proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e){
            System.err.println("El comando es desconocido: " + e.getMessage());
        }

        System.out.println("se ha cerrado el editor");
        System.exit(0);
    }
}
