
package parcial3;


public class Parcial3 {

    
    public static void main(String[] args) {
        // Crear un supermercado con 3 góndolas y 4 estantes por góndola
        Supermercado super1 = new Supermercado("La Oferta", "Av. Siempre Viva 123", 3, 2);

        // Crear algunos productos
        Producto p1 = new Producto(101, "Arroz", "Gallo", 200, 500.0);
        Producto p2 = new Producto(102, "Fideos", "Lucchetti", 35, 450.0);
        Producto p3 = new Producto(103, "Azúcar", "Ledesma", 15, 400.0);
        Producto p4 = new Producto(104, "Aceite", "Natura", 10, 1200.0);
        Producto p5 = new Producto(105, "Galletitas", "Bagley", 50, 350.0);
        Producto p6 = new Producto(106, "Yerba", "Taragüi", 25, 1800.0);
        Producto p7 = new Producto(107, "Harina", "Cañuelas", 30, 300.0);
        Producto p8 = new Producto(108, "Fideos", "Lucchetti", 40, 450.0);

        // Registrar los productos en la góndola
        super1.registrarProducto(p1);
        super1.registrarProducto(p2);
        super1.registrarProducto(p3);
        super1.registrarProducto(p4);
        super1.registrarProducto(p5);
        super1.registrarProducto(p6);
        super1.registrarProducto(p7);
        super1.registrarProducto(p8);

        // Mostrar todos los productos
        System.out.println("=== SUPERMERCADO COMPLETO ===");
        System.out.println(super1);

        // Listar productos de una marca específica
        System.out.println("\n=== PRODUCTOS MARCA 'Lucchetti' ===");
        super1.listarProductosPorMarcaEnGondola("Lucchetti",3);

        // Mostrar la góndola con más unidades totales
        int gMayor = super1.obtenerNumeroGondolaConMayorCantidad();
        System.out.println("\nLa góndola con más unidades es la número: " + gMayor);
    }
    
}
