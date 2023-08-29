public class PasarPorReferencia {
    public static void main(String[] args){

        //como el tipo de referencia es un arreglo podemos cambiar o modificar la variable desde el
        //metodo test, en el caso de valores primitivos esto no es posible

        int [] edad = {10, 11, 12};

        System.out.println("iniciamos el metodo main");
        for (int i = 0; i< edad.length; i++) {
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de invocar al metodo test");
        test(edad); // aqui llamamos al metodo test
        for(int i = 0; i<edad.length; i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("despues de llamar al metodo test");
        System.out.println("Finaliza el metodo main con los datos del arreglo modificados");

    }

    public static void test(int [] edadArr){
        System.out.println("Iniciamos el metodo test");
        for (int i =0; i<edadArr.length; i++){
            edadArr[i] = edadArr[i] + 20;
        }
        System.out.println("Finaliza el metodo test");

    }
}
