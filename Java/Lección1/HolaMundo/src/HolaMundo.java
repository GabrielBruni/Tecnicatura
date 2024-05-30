
import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
        /*System.out.println("Hola mundo desde Java");        
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        // Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en programación";
        System.out.println(miVariableCadena);
        */
        
        /*// Var - interferencia de tipos en Java
        var miVariableEntera2 = 10
        var miVariableEntera2 = "Seguimos estudiando"
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        // sout + tab
        // Para ejecutar Shift + F6 es la tecla para mayúscula.
        // Reglas para definir una variable en Java.
        
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = ") + union;
        
        var a = 0:
        var b = 4;
        System.out.println(usuario + (a + b));
        // Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n
        System.out.println("Tabulador: \t" + nombre); // Tabulador un espacio para centrar
        System.out.println("\t\t.:MENÚ:.");
        System.out.println("Retroceso: \b\b" + nombre); // Caracter de Retroceso
        System.out.println("Comillas Simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");*/
        
        // Clase Scanner
        /*Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el título: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+titulo2+" "+usuario2);*/
        
        /*byte numEnteroByte = (byte)127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte:"+ Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte:"+ Byte.MAX_VALUE);
        
        short numEnteroShort = (short)32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short:"+ Short.MIN_VALUE);
        System.out.println("Valor máximo del Short:"+ Short.MAX_VALUE);
        
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Int:"+ Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int:"+ Integer.MAX_VALUE);
        
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del Long:"+ Long.MIN_VALUE);
        System.out.println("Valor máximo del Long:"+ Long.MAX_VALUE);*/
        
        /*float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor mínimo de Float:"+ Float.MIN_VALUE);
        System.out.println("EL valor máximo de Float:"+ Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308D;
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor mínimo de Double:"+ Double.MIN_VALUE);
        System.out.println("El valor máximo de Double:"+ Double.MAX_VALUE);*/
        
        // Inferencia de tipos var y tipos primitivos
        /*var numEntero = 20; // Las literales sin punto son automáticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; // Automáticamente con el punto se transforma en tipo double
        System.out.println("numFloat = " + numFloat);
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);*/
        
        // Tipos primitivos char
        /*char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCaracter = '\u0024'; // Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; // Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; // Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        var varCaracter1 = '\u0024'; // Indicamos a Java la asignación con el código unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char)36; // Valor Entero y le asigna un tipo int
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; // Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);*/
        
        // 6.1 Tipos Primitivos tipos booleanos (Miércoles 15/05/24)
        /*var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool) {
            System.out.println("La bandera es verde");
        }
        else {
            System.out.println("La bandera es roja");
        }
        
        // Algoritmo: ¿Es mayor de edad?
        var edad = 18; // Literal tener presente la indiferencia de tipos.
        //var adulto = edad >= 18; // Esta es una expresión booleana.
        if(edad >= 18){
            System.out.println("Eres mayor de edad.");
        }   
        else{
            System.out.println("Eres menor de edad.");
        }*/

        // 6.2 Conversión de tipos primitivos (Parte 1).
//        var edad = Integer.parseInt("20");
//        System.out.println("edad = " + (edad + 1));
//        var valorPI = Double.parseDouble("3.1416");
//        System.out.println("valorPI = " + valorPI);
//        
//        // Pedir un valor
//        var entrada = new Scanner(System.in);
//        System.out.println("Digite su edad:");
//        edad = Integer.parseInt( entrada.nextLine());
//        System.out.println("edad = " + edad);
        
        // Conversión de tipos primitivos en Java Parte 2.
        /*var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);*/
        
        /*int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solución de la suma es = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Solución de la resta es = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("Solución de la multiplicación es = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("Solución de la división es = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("Solución2 de la división es = " + solucion2);
        
        solucion = num1 % num2; // Guarda el residuo entero de la división.
        System.out.println("solucion = " + solucion); // 5/4 
        
        if (num2 % 2 == 0)
            System.out.println("Es un número PAR.");
        else
            System.out.println("Es un número IMPAR.");*/
        
        /*int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; // Una operación.
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; // varNum1 = var Num1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
// -=    *=    /=    %=
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);*/
        
        
        
    }    
}