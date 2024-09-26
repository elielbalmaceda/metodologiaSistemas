public class Main {
    public static void main(String[] args) {
        //Procesar cualquier tipo de metodo de pago
        MetodoDePago tarjetaCredito = new TarjetaCredito("123567890123456", "Gonzalo Marinelli", "12/25", 123);
        MetodoDePago pagoEfectivo = new PagoEfectivo(805.3, 300);
        MetodoDePago TransferenciaBancaria = new TransferenciaBancaria("000025", "Macro", "Dolares");

        //Polimorfismo
        procesarPago(tarjetaCredito, 805.3);
        procesarPago(pagoEfectivo, 805.3);
        procesarPago(TransferenciaBancaria, 805.3);

    }
    public static void procesarPago(MetodoDePago metodoDePago, double monto){
        metodoDePago.procesarPago(monto);
        metodoDePago.mostrarDetalle();
    }
}