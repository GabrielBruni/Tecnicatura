
package ar.com.codesystem.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[]; // Declaramos el arreglo.
    private static int contadorOrdenes;
    private int contadorPoductos;
    private static final int MAX_PRODUCTOS = 10;
    
    // Constructor vacío:
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }
    
    public void agregarProducto(Producto producto) {
        if (this.contadorPoductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorPoductos++] = producto;
        }
        else {
            System.out.println("Se ha superado el máximo de productos: "+Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal() {
        double total = 0; // Variable temporal.
        for (int i = 0; i < this.contadorPoductos; i++) {
//      Producto producto = this.productos[i];
//      total += producto.getPrecio();
            total += this.productos[i].getIdProducto();
        }
        return total;
    }
    
    public void mostrarOrden() {
        System.out.println("Id Orden: "+idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la orden es: $"+totalOrden);
        System.out.println("Producto de la orden: ");
        for (int i = 0; i < this.contadorPoductos; i++) {
            System.out.println(this.productos[i]);
            
        }
    }
}