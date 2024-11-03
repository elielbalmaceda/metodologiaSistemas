import java.util.ArrayList;
import java.util.List;

// Clase Cliente que hereda de Persona
public class Cliente extends Persona {
    //Encapsulameinto
    //Esta variable solo sea accesible dentro de la clase donde está declarada (Private)
    private int clienteId;
    private List <Venta> historialCompras; //Lista generica que solo puede tener objetos de tipo Venta

    public Cliente(String nombre, String dni, String telefono, String email) {
        super(nombre, dni, telefono, email); //Llama a los atributos de la clase padre
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