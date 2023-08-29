public class Operadores {
    public static void main(String[] args) {
        
        int i=10;
        int j=20;
        
        // i= i+2;
        i += 2;

        // j= i+2;
        j -= 2;
        
        // i = i/j
        i /=j ;
        
        // j = j * i
        j *= i;
        
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Andres' ";
        sqlString += "and c.activo=1";

        System.out.println("sqlString = " + sqlString);
        
        //incrementos y decrementos
        
        //pre-incremento
        int a = 1;
        int b = ++a; // i = i+1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //post-incremento
        
        a = 1;
        b = a++; //b no se incrementa ya que primero se asigna el valor de a y despues se incrementa solo a
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //pre-decremento
        a = 3;
        b = --a; // a = a-1
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        //post-decremento
        a = 3;
        b = a--; //primero se asigna "a" a "b" y despues se decrementa "a"
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        


    }
}
