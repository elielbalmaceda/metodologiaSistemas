import java.util.ArrayList;
import java.util.List;

// Clase Vendedor que hereda de Persona
public class Vendedor extends Persona {
    private String codigo;
    private double comision;
    private List<Venta> ventas;

    public Vendedor(String nombre, String dni, String telefono, String email, String codigo, double comision) {
        super(nombre, dni, telefono, email);
        this.codigo = codigo;
        this.comision = comision;
        this.ventas = new ArrayList<>();
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }
    
    public double calcularComisionVenta(double montoVenta) {
        return montoVenta * (comision / 100);
    }

    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }


}