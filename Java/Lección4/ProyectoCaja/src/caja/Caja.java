package caja; // Package

public class Caja { // Clase pública caja.
    // Atributos (Características)
    int ancho;
    int alto;
    int profundo;
    // Métodos y contructores (Acciones)
    public Caja() { // Constructor 1 = Vacío. 
    }
    // Contructor con parámetros.
    public Caja(int ancho, int alto, int profundo) { // Contructor 2.
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() { // Método para calcular.
        return ancho * alto * profundo;
    }
}
