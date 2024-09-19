
package Operaciones;

public class Aritmetica {
    // Atributos de la clase:
    int a; 
    int b;
    
    // El contructor es un método especial:
    public Aritmetica(){ // Contructor 1, vacío.
        System.out.println("Se está ejecutando este contructor número uno.");
    }
    // Estamos viendo lo que se llama sobrecarga de contructores
    public Aritmetica(int a, int b){ // Contructor 2.
        this.a = a;
        this.b = b;
        System.out.println("Se está ejecutando este contructor número dos.");
    }
    
    // Método:
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        // int resultado = a + b;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a; // El argumento a se asigna al atributo this.a
        this.b = b;
        // return a + b;
        return this.sumarConRetorno();
    }
}
