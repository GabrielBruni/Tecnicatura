
package domain;

public class Empleado extends Persona {
    @Override
    public void imprimir(){
        System.out.println("Método imprimir desdee la clase hija.");
    }
}
