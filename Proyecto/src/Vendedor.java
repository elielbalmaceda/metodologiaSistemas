import java.util.ArrayList;
import java.util.List;

// Clase Vendedor que hereda de la clase Persona
public class Vendedor extends Persona {
    private String codigo; //Codigo unico del vendedor
    private double comision; //Porcentaje de la venta
    private List<Venta> ventas; //Lista que almacena todas las ventas realizadas

    //Constructor que inicializa un nuevo vendedor
    public Vendedor(String nombre, String dni, String telefono, String email, String codigo, double comision) {
        super(nombre, dni, telefono, email); //LLama al constructor de la clase padre (Persona) con super()
        this.codigo = codigo;
        this.comision = comision;
        this.ventas = new ArrayList<>(); //Inicializa la lista de ventas vacia
    }

    //Metodos getter y setter para los atributos especificos 
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
    
    //Calcula la comision para una venta especifica
    public double calcularComisionVenta(double montoVenta) {
        return montoVenta * (comision / 100);
    }

    //Registra una nueva venta en el historial del vendedor
    public void registrarVenta(Venta venta) {
        ventas.add(venta);
    }
}