//Clase principal, en donde se carga el auto.
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------PROYECTO DE VENTA DE AUTOS------------");
       // Crear cliente
       Cliente cliente1 = new Cliente("Balmaceda Eliel", "12345678");

       // Crear auto
       Auto auto1 = new Auto("Toyota", "Corolla Cross", 45000, 5);

       // Crear venta
       Venta venta1 = new Venta(cliente1, auto1);

       // Aplicar un descuento por porcentaje
       Descuento descuentoPorcentaje = new DescuentoPorcentaje(10); // 10% de descuento
       venta1.aplicarDescuento(descuentoPorcentaje);

       // Mostrar detalles de la venta
       venta1.mostrarDetalleVenta();
   }
}

