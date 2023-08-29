public class WrapperBoolean {
    public static void main(String[] args){

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        boolean objBoolean = Boolean.valueOf(primBoolean);
        Boolean objBoolean2 = Boolean.valueOf("false");

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        //aqui si se puede comparar con el == o con el equals da lo mismo
        System.out.println("Comparando dos objetos boolean: " + (objBoolean == objBoolean2));

        boolean primBoolean2 = objBoolean2.booleanValue(); //convierte el objeto a primitivo boolean

    }
}
