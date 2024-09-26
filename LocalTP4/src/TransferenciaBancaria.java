public class TransferenciaBancaria implements MetodoDePago {
    private String numeroCuenta;
    private String banco;
    private String moneda;

    public TransferenciaBancaria(String numeroCuenta, String banco, String moneda) {
        this.numeroCuenta = numeroCuenta;
        this.banco = banco;
        this.moneda = moneda;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago con transferencia bancaria de: $" + monto );
        System.out.println("******..********...");
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Detalles de la transferencia bancaria:");
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Banco: " + banco);
        System.out.println("Moneda: " + moneda);
        System.out.println("--------------------------------");
    }
}

