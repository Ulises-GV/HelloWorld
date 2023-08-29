public class EtiquetasBucle {
    public static  void main(String[] args){

        //se pueden añadir etiquetas para controlar las sentencias y flujo de ejecucion de los bucles

        bucle1:
            for(int i = 0; i < 5; i++){

                System.out.println();
                for(int j = 0; j < 5; j++){
                    if(i==2) {
                        continue bucle1;
                    }
                    System.out.println("i = " + i + ", j = " + j);
                }
            }

            //busca cuantas vexes aparece una letra en una frase
            String sentence = "avientate el paso de la chaquetita medio metro! ira cuervo, ira," +
                    " ira la chaquetita del medio metro cuervo, ahhhhhh medio metroooooo!";
            int max = sentence.length();
            int contador = 0;
            for (int i=0; i<max; i++){
                if (sentence.charAt(i) != 'a') {
                    continue;
                }
                //contador++;
            }
            System.out.println(contador);

            //busca cuantas veces aparece la palabra chaquetita o un trozo de oracion de la frase

            String palabra = "chaquetita";
            int maxpalabra = palabra.length();
            int maxsentence = sentence.length()-maxpalabra;

            etiqueta1:
            for (int i=0; i<=maxsentence;){
                int k = i;
                etiqueta2:
                for (int j=0; j<maxpalabra; j++){
                    if (sentence.charAt(k++) != palabra.charAt(j)){
                        i++;
                        continue etiqueta1;
                    }
                }
                contador++;
                i = i + maxpalabra;
            }
        System.out.println("se encontro la palabra '" + palabra + "' "  + contador + " veces");
    }
}
