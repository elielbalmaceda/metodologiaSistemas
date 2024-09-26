public class PagoEfectivo implements MetodoDePago{
    private double montoRecibido;
    private double cambio;


    public PagoEfectivo(double  montoRecibido, double cambio) {
        this.montoRecibido = montoRecibido;
        this.cambio = cambio;

    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago en efectivo de: $" + monto);
        System.out.println("******..********...");
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Monto Recibido: $" + montoRecibido);
        System.out.println("Cambio: $" + cambio);
        System.out.println("--------------------------------");
    }
}
