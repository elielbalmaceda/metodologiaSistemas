// Interfaz que define el comportamiento que deben tener los objetos vendibles
public interface Vendible {
    //Calcula el precio final del articulo vendible
    double calcularPrecioFinal();
    //Verifica si el articulo esta disponible para venta
    boolean estaDisponible();
    //Marca el articulo como vendido
    void marcarComoVendido();
}
