// Leer dos números:
// - si son iguales que los multiplique.
// - si el primero es mayor que el segundo, que los reste.
// - sino que los sume.
package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite el primer número: ");
        int num1 = Integer.parseInt(entrada.nextLine());
        
        System.out.println("Digite el segundo número: ");
        int num2 = Integer.parseInt(entrada.nextLine());
        
        int resultado = 0;
        
        if (num1 > num2){
            resultado = num1 - num2;
        }
        else if (num1 < num2){
            resultado = num1 + num2;
        }
        else{
            resultado = num1 * num2;
        }
        System.out.println("El resultado es: "+resultado);
    }
}
