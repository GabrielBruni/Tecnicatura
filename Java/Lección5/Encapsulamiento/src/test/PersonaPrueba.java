
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("perosna1 = " + persona1);
        System.out.println("perosna1 su nombre es: "+persona1.getNombre());
        // Modificar a través de los métodos.
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar.
        //System.out.println("Nombre es: "+persona1.nombre); // Error.
        System.out.println("perosna1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el suledo: "+persona1.getSueldo());
        System.out.println("perosna1 para obtener el booleano: "+persona1.isEliminado());
        
        System.out.println("persona1 = " + persona1);
    }
}
// Tarea:
// Crear otro objeto de tipo Persona, asignar valores de manera inicial e imprimir, luego modificar sus valores y volver a imprimir.