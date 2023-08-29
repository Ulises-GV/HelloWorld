public class OperadorInstanceOf {
    public static void main(String[] args){
        String texto = new String("creando un objeto de la clase string");

        Number num = Double.valueOf(7.0);

        boolean b1 = texto instanceof String;
        System.out.println("Texto del tipo string? "+ b1);

        b1 = texto instanceof Object;
        System.out.println("Texto del tipo Object? "+ b1);

        b1 = num instanceof Integer;
        System.out.println("num del tipo Integer? "+ b1);

        b1 = num instanceof Number;
        System.out.println("num del tipo Number? "+ b1);

        b1 = num instanceof Object;
        System.out.println("num del tipo Object? "+ b1);
    }
}
