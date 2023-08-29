public class StringMetodos {
    public static void main(String[] args) {

        String nombre = "  ";
        boolean a = nombre.isBlank(); // verifica si esta vacio o si contiene solo espacios en blanco (java11 en adelante)
        boolean b = nombre.isEmpty(); // verifica si esta vacio

        System.out.println(a);
        System.out.println(b);

        String nombre2 = "Medio Metro";

        System.out.println("nombre2.length() = " + nombre2.length());
        System.out.println("nombre2.toUpperCase() = " + nombre2.toUpperCase());
        System.out.println("nombre2.toLowerCase() = " + nombre2.toLowerCase());
        System.out.println("nombre2.equals() = " + nombre2.equals("medio metro"));
        System.out.println("nombre2. = " + nombre2.equalsIgnoreCase("medio metro"));
        System.out.println("nombre2.compareTo(\"Medio Metro\") = " + nombre2.compareTo("Medio Metro")); //compara lexicograficamente si retorna 0 las cadenas son iguales
        System.out.println("nombre2.charAt(4) = " + nombre2.charAt(4)); //retorna el caracter de la posicion
        System.out.println("nombre2.substring(5,10) = " + nombre2.substring(5,10));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"a\",\"#\") = " + trabalenguas.replace("a","#"));
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a")); //devuelve la primera posicion donde encuentra el caracter o pedazo de cadena
        System.out.println("trabalenguas.lastIndexOf(\"a\") = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas")); //retorna true o false
        System.out.println("trabalenguas = " + trabalenguas.startsWith("t"));
        System.out.println("trabalenguas.endsWith() = " + trabalenguas.endsWith("s"));
        System.out.println(" trabalenguas ".trim()); //quita los espacios en la cadena

    }
}
