import java.time.LocalDate; //Importa la clase LocalDAte para manejar fechas

// Clase Vehiculo que implementa la interfaz Vendible
public class Vehiculo implements Vendible {
    //Atributos que definen las caracteristicas de un vehiculo
    private int vehiculoId; //Identificador unico del vehiculo
    private String marca; //Marca del vehiculo
    private String modelo; //Modelo del vehiculo
    private int anio; //Año de fabricacion
    private double precio; //Precio base del vehiculo
    private String estado; //Estado actual ("Disponible" o "Vendido")

    //Constructor que inicializa un nuevo vehiculo 
    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.estado = "Disponible"; //Siempre va a estar disponible por defecto
    }
    

    //Implementacion del metodo de la interfaz Vendible
    //Calcula el precio final considerando la antiguedad del vehiculo
    @Override
    public double calcularPrecioFinal() {
        // Lógica para calcular precio final según antigüedad
        int antiguedad = LocalDate.now().getYear() - anio;
        //Si el vehiculo tiene mas de 5 años aplica 10% de descuento
        if (antiguedad > 5) {
            return precio * 0.9; 
        }
        return precio;
    }

    //Metodos getter y setter para cada atributo
    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //Implementacion de metodos de la interfaz Vendible
    
    //Verifica si el vehiculo esta disponible para la venta
    @Override
    public boolean estaDisponible() {
        return "Disponible".equals(estado);
    }

    @Override
    public void marcarComoVendido() {
        this.estado = "Vendido";
    }
}