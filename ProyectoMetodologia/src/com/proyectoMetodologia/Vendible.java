package com.proyectoMetodologia;
//Esta interfaz se puede implementar en cualquier clase, como Vehiculo
public interface Vendible {
    double calcularPrecioFinal(); //Devuelve el valor de tipo double que representa el precio final del objeto    
    boolean estaDisponible();//Devuelve el valor boolean indicando si el objeto esta disponible para la venta
    void marcarComoVendido(); //No devuelve ningun valor, pero cambia el estado del objeto a vendido
}
