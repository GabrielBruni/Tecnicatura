
package CicloWhile;

public class EjercicioWhile01 {
    public static void main(String[] args) {
        var conteo = 0; // Inferencia de tipos.
        while(conteo < 3){
            System.out.println("conteo = " + conteo);
            conteo++; // Vamos aumentando en uno la variable.
        }
        
        var contador = 0;
        do{
           System.out.println("contador = " + contador);
           contador++; // Vamos aumentando en uno la variable.
        }while(contador <= 7);
        
        // Uos de las palabras Break y Continue junto a las etiquetas (Labels)
        for (var contando = 0; contando < 7; contando++ ){
            if(contando % 2 == 0){
            System.out.println("contando = " + contando);
            break;
            }
        }
        inicio:
        for (var contando = 0; contando < 7; contando++ ){
            if(contando % 2 != 0){
                continue inicio; // Vamos a la siguiente iteración.
            }
            System.out.println("contando = " + contando);
        }
    }
}