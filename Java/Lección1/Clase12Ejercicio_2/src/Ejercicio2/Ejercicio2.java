// Hacer un programa que calcule el cuadro de una suma, el usuario debe ingresar el valor de a y el valor de b.
// Formula: (a+b)^2 = a^2 + b^2 + 2*a*b
// Para esto deberán utilizar la clase Math y un método llamado pow.
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,resultado;
        System.out.print("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Digite el valor de b: ");
        b = entrada.nextDouble();
        resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);
        System.out.println("\nEl resultado es: "+resultado);    
    }
}