// Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas equivalentes.
// Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales, semanas, dias, horas;
        System.out.print("Digite las horas totales: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\nEl equivalente de las horas es: ");
        System.out.println(semanas + " semanas.");
        System.out.println(dias + " días.");
        System.out.println(horas + " horas.");
    }
}