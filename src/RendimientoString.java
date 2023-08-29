public class RendimientoString {
    public static void main(String[] args){
        String a = "a";
        String b = "b";
        String c = "a";

        //este metodo es mutable
        StringBuilder ab = new StringBuilder(a);

        long inicio = System.currentTimeMillis(); // mide el tiempo de ejecucion

        //el objeto StringBuilder con el metodo append es el mas eficiente
        for(int i=0; i<500; i++){
        //    c = c.concat(a).concat(b).concat("\n"); //500 => 15ms
        //    c += a+b+"\n"; // 500 => 63ms
            ab.append(a).append(b).append("\n"); //500 => 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("ab = " + ab.toString());
    }
}
