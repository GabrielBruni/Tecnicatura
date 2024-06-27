// La calificacion final de un estudiante de informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico:
// participación, primer examen parcial, segundo examen parcial y examen final. 
// Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones de 10%, 25%, 25% y 40%.
// Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante. 
// Que el usuario digite las calificaciones de estos 4 datos y así podremos tener, la calificación final.
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        // Pedir los datos necesarios:
        System.out.print("Digite la nota de Participación: ");
        participacion = entrada.nextFloat();
        System.out.print("Digite la nota del Primer Exámen Parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.print("Digite la nota del Segundo Exámen Parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.print("Digite la nota del Exámen Final: ");
        examenFinal = entrada.nextFloat();
        
        // Sacamos los cálculos:
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        // Sumamos las notas:
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        System.out.println("");
        
        // Imprimir el resultado en pantalla:
        System.out.println("\nLa Nota Final es: "+notaFinal);
    }
}
