
package ar.com.codesystem.ventas.test;

import ar.com.codesystem.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto01 = new Producto("Pantalon", 60000.00);
        Producto producto02 = new Producto("Campera", 80000.00);
        //
        Producto producto03 = new Producto("Medias", 10000.00);
        Producto producto04 = new Producto("Calzoncillos", 40000.00);
        Producto producto05 = new Producto("Cinturón", 50000.00);
        Producto producto06 = new Producto("Remera", 35000.00);
        Producto producto07 = new Producto("Chaleco", 55000.00);
        Producto producto08 = new Producto("Reloj", 200000.00);
        Producto producto09 = new Producto("Camisa", 70000.00);
        Producto producto10 = new Producto("Corbata", 25000.00);
        
        Orden orden01 = new Orden();
        // Agregamos productos al arreglo:
        orden01.agregarProducto(producto01);
        orden01.agregarProducto(producto02);
        orden01.mostrarOrden();
        
        // Tarea:
        // Crear más objetos de tipo Producto. = 10
        // Crear más objetos de tipo Orden. = 3
               
        Orden orden02 = new Orden();
        // Agregamos productos al arreglo:
        orden02.agregarProducto(producto03);
        orden02.agregarProducto(producto04);
        orden02.agregarProducto(producto05);
        orden02.agregarProducto(producto06);
        orden02.mostrarOrden();
        
        Orden orden03 = new Orden();
        // Agregamos productos al arreglo:
        orden03.agregarProducto(producto07);
        orden03.agregarProducto(producto08);
        orden03.agregarProducto(producto09);
        orden03.agregarProducto(producto10);
        orden03.mostrarOrden();
    }
}
