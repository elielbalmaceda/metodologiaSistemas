import java.util.ArrayList;
import java.util.List;

// Clase Cliente que hereda de Persona
public class Cliente extends Persona {
    private int clienteId;
    private List<Venta> historialCompras;

    public Cliente(String nombre, String dni, String telefono, String email) {
        super(nombre, dni, telefono, email);
        this.historialCompras = new ArrayList<>();
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public void setHistorialCompras(List<Venta> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public void agregarCompra(Venta venta) {
        historialCompras.add(venta);
    }

    public List<Venta> getHistorialCompras() {
        return new ArrayList<>(historialCompras);
    }
}