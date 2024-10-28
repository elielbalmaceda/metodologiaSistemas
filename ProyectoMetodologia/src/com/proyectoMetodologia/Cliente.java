package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona { // Clase Cliente que hereda de Persona
    
    private int clienteId;
    private List<Venta> historialCompras;// Atributo privado que almacena las compras del cliente
    
    public Cliente(String nombre, String dni, String telefono, String direccion, int clienteId) {
        super(nombre, dni, telefono, direccion);
        this.historialCompras = new ArrayList<>();
    }
    public void agregarCompra (Venta venta){
        historialCompras.add(venta);
    }

    public List<Venta> getHistorialCompras(){
        return new ArrayList<>(historialCompras);
    }
}

