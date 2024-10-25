//Asociación entre Cliente y Auto.
public class Venta {
    private Cliente cliente;
    private Auto auto;
    private double precioFinal;

    public Venta (Cliente cliente, Auto auto){
        this.auto = auto;
        this.cliente = cliente;
        this.precioFinal = auto.getPrecio(); //Precio original sin descuentos.
    }
    public void aplicarDescuento(Descuento descuento) {
        this.precioFinal = descuento.calcularDescuento(auto.getPrecio());
    }

    public void mostrarDetalleVenta() {
        cliente.mostrarInfo();
        auto.mostrarInfo();
        System.out.println("Precio final: $" + precioFinal);
    }
}
