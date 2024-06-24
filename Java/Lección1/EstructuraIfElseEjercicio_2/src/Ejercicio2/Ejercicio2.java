// En un almacén se hace un 20% de descuento a los clientes cuya compra supere los $100.000.
// ¿Cuál será la cantidad que pagará una persona por su compra?
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float total,descuento = 0;
        System.out.println("Digite la cantidad a apagar:");
        total = entrada.nextFloat();
        
        if(total > 100000){
            descuento = total * .20f;
        }
        System.out.println("El precio a pagar es: $ "+(total - descuento));
        System.out.println("El descuento aplicado es: $ "+descuento);
    }
}