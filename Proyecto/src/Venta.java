
import java.time.LocalDate; //Importacion LocalDate para manejar fechas

// Clase Venta para gestiona las ventas de vehiculos
public class Venta {
    //Atributos de la venta
    private int ventaId; //Identificador unico de la venta
    private Cliente cliente; //Cliente que realiza la compra
    private Vendedor vendedor; //Vendedor que realiza la venta
    private Vehiculo vehiculo; //Vehiculo que se vende
    private LocalDate fecha; //Fecha de la venta
    private double montoTotal; //Monto total de la venta
    private String formaPago; //Metodo de pago utilizado

    //Constructor
    public Venta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.fecha = LocalDate.now(); //Fecha actual
        this.formaPago = formaPago;
        this.montoTotal = vehiculo.calcularPrecioFinal(); //Calcula el precio final
    }

    //Getter y setters
    public int getVentaId() {
        return ventaId;
    }

    public void setVentaId(int ventaId) {
        this.ventaId = ventaId;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    //Metodo para procesar la venta
    public boolean procesarVenta() {
        //Verifica si el vehiculo esta disponible
        if (!vehiculo.estaDisponible()) {
            return false;
        }

        try {
            //Realiza todas las operaciones necesarias
            vehiculo.marcarComoVendido(); //Marca el vehiculo como vendido
            cliente.agregarCompra(this); //Agrega la compra al historial del cliente
            vendedor.registrarVenta(this); //Registra la venta en el historial del vendedor
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //Genera un comprobante de venta
    public String generarComprobante() {
        //Se usa text block (""") para formato multilinea
        return String.format("""
            COMPROBANTE DE VENTA
            Fecha: %s
            Cliente: %s
            Vehiculo: %s %s (%d)
            Vendedor: %s
            Monto Total: $%.2f
            Forma de Pago: %s
            """, 
            fecha, cliente.getNombre(), 
            vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getAnio(),
            vendedor.getNombre(), montoTotal, formaPago);
    }

}

