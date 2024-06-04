import java.util.Scanner;
public class Clase01 {
     public static void main(String[] args) {
/* 1) Hacer un programa en Java que calcule el inc de una persona.
        La fórmula es peso / (altura * altura)
        */
Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el peso en Kg: ");
        double peso = leer.nextDouble();
        
        System.out.println("Ingrese la altura en cm: ");
        double altura = leer.nextDouble();
        
        double totalImc = peso / (altura * altura);
        
        System.out.println(" El IMC teniendo en cuenta la altura de " + altura + " cm y peso de " + peso + "kg es: ");
        System.out.println(totalImc);
    }
}