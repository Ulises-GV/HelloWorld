public class PasarPorReferencia2 {
    public static void main(String[] args){

        //como el tipo de referencia es un arreglo podemos cambiar o modificar la variable desde el
        //metodo test, en el caso de valores primitivos esto no es posible

        Persona persona = new Persona();
        System.out.println("persona.leerNombre() = " + persona.leerNombre());
        persona.modificarNombre("sonido pirata");

        System.out.println("iniciamos el metodo main");

        System.out.println("persona.nombre " + persona.leerNombre());
        System.out.println("Antes de invocar al metodo test");
        test(persona); // aqui llamamos al metodo test

        System.out.println("persona.nombre "+ persona.leerNombre());
        System.out.println("despues de llamar al metodo test");
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");

    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el metodo test");
        persona.modificarNombre("cholondrina");
        System.out.println("Finaliza el metodo test");

    }
}

class Persona{
    private String nombre = "juan";

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public String leerNombre(){
        return this.nombre;
    }

}