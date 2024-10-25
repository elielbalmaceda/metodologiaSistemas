public class DescuentoFijo implements Descuento{
    private double cantidad;

    public DescuentoFijo(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double calcularDescuento(double precio) {
        return precio - cantidad;
    }
}
