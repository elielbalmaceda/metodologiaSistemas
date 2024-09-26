public class TarjetaCredito implements MetodoDePago{

    private String numTarjeta;
    private String nombreTitular;
    private String vencimiento;
    private int codSeguridad;

    public TarjetaCredito(String numTarjeta, String nombreTitular, String vencimiento, int codSeguridad) {
        this.numTarjeta = numTarjeta;
        this.nombreTitular = nombreTitular;
        this.vencimiento = vencimiento;
        this.codSeguridad = codSeguridad;
    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con tarjeta de credito de: $" + monto);
        System.out.println("******..********...");
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Numero de tarjeta: " + numTarjeta); //Como hago para que muestre los ultimos 4 digitos de la tarjeta?
        System.out.println("Nombre del titular: " + nombreTitular + " Vencimiento: " + vencimiento + " Codigo de seguridad: " + codSeguridad);
        System.out.println("--------------------------------");
    }
}
