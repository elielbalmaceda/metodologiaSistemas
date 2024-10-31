
import java.time.LocalDate;

// Clase Venta para gestionar las transacciones
public class Venta {
    private int ventaId;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private double montoTotal;
    private String formaPago;

    public Venta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.fecha = LocalDate.now();
        this.formaPago = formaPago;
        this.montoTotal = vehiculo.calcularPrecioFinal();
    }

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

    public boolean procesarVenta() {
        if (!vehiculo.estaDisponible()) {
            return false;
        }

        try {
            vehiculo.marcarComoVendido();
            cliente.agregarCompra(this);
            vendedor.registrarVenta(this);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String generarComprobante() {
        return String.format("""
            COMPROBANTE DE VENTA
            Fecha: %s
            Cliente: %s
            Vehículo: %s %s (%d)
            Vendedor: %s
            Monto Total: $%.2f
            Forma de Pago: %s
            """, 
            fecha, cliente.getNombre(), 
            vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getAnio(),
            vendedor.getNombre(), montoTotal, formaPago);
    }

}

