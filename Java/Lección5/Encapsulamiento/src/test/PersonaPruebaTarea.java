
package test;

import dominio.PersonaTarea;

public class PersonaPruebaTarea {
    public static void main(String[] args) {
        // Crear un objeto de tipo Persona con valores iniciales:
        PersonaTarea persona1 = new PersonaTarea("Ariel", "Betancud", 30, "Buenos Aires");
        
        // Imprimir la información inicial:
        System.out.println("Información del profesor de la cátedra:");
        persona1.mostrarInformacion();
        
        // Modificar los valores del objeto Persona:
        persona1.setNombre("Gabriel");
        persona1.setAppelido("Bruni");
        persona1.setEdad(24);
        persona1.setProvincia("Mendoza");
        
        // Imprimir la información modificada:
        System.out.println("\nInformación modificada, alumno de la cátedra:");
        persona1.mostrarInformacion();
    }
}