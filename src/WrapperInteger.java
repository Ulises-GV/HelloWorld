public class WrapperInteger {
    public static void main(String [] args){
        int intPrimitivo = 345444;
        //Integer intObjeto = new Integer(32768); //obsoleto desde la version 7
        Integer intObjeto = Integer.valueOf(intPrimitivo); //unboxing
        Integer intObjeto2 = 45; //autoboxing

        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto.intValue();

        System.out.println("num = " + num);
        System.out.println("intObjeto2 = " + intObjeto2);

        String valorS = "1234";
        Integer valor = Integer.valueOf(valorS);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue(); //perdida de informacion al convertir un integer a un short
        //por ser menor la capacidad del short
        System.out.println("shortObjeto = " + shortObjeto);

        //===============================================================================================
        
        Integer [] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        int suma = 0;
        //ciclo foreach
        for (Integer i: enteros) {
            if(i.intValue() % 2 ==0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        //----------------------------------------------------------------------------------------------------

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;

        System.out.println("son el mismo objeto? = " + (num1 == num2));
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num2 = 1000;
        //son dos objetos distintos por que los compara con instancias y no por valor
        System.out.println("son el mismo objeto? = " + (num1 == num2));

        System.out.println("tienen el mismo valor? " + num1.equals(num2));
    }
}
