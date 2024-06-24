// Determianr si un alumno aprueba o reprueba un curso, sabiendo que aprobará si su promedio de tres calificaciones es >= 70.
// Reprueba caso contrario.
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,promedio;
        System.out.println("Digite las 3 calificaciones del alumno: ");
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("Tu promedio es: "+promedio);
        
        if (promedio >= 70){
            System.out.println("¡Estás Aprobado!");
        }
        else{
            System.out.println("Desaprobado.");
        } 
    }
}