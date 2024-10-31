
import java.time.LocalDate;

// Clase Vehiculo que implementa Vendible
public class Vehiculo implements Vendible {
    private int vehiculoId;
    private String marca;
    private String modelo;
    private int anio;
    private double precio;
    private String estado;

    public Vehiculo(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.estado = "Disponible";
    }
    

    @Override
    public double calcularPrecioFinal() {
        // Lógica para calcular precio final según antigüedad
        int antiguedad = LocalDate.now().getYear() - anio;
        if (antiguedad > 5) {
            return precio * 0.9; // 10% descuento para vehículos > 5 años
        }
        return precio;
    }

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
    
    @Override
    public boolean estaDisponible() {
        return "Disponible".equals(estado);
    }

    @Override
    public void marcarComoVendido() {
        this.estado = "Vendido";
    }

}