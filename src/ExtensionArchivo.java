public class ExtensionArchivo {

    public static void main(String[] args) {
        String archivo = "Alguna_imagen.json";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo = " + archivo.substring(i+1));
        
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());
        
        char [] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        for (i=0; i<largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

    //    System.out.println("trabalenguas = " + trabalenguas.split("a"));

        //split separa una cadena en un arreglo de cadenas separadas por el caracter indicado
        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for(i=0; i<l; i++){
            System.out.println(arreglo2[i]);
        }
        //tenemos que poner \\ porque el punto es reservado de expresiones regulares separa por "."
        String[] archivoArr = archivo.split("\\.");

        l = archivoArr.length;
        for(i=0; i<l; i++){
            System.out.println(archivoArr[i]);
        }

        System.out.println("extension = " + archivoArr[l-1]);
        
    }

}
