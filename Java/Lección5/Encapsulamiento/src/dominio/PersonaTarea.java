
package dominio;

public class PersonaTarea {
    private String nombre;
    private String apellido;
    private int edad;
    private String provincia;

    // Constructor:
    public PersonaTarea(String nombre, String apellido, int edad, String provincia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.provincia = provincia;
    }

    // Método:
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Appellido: " + apellido + ", Edad: " + edad + ", Provincia: " + provincia);
    }

    // Métodos para modificar los valores:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setAppelido(String apellido) {
        this.apellido = apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}