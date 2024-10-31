package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona { // Clase Cliente que hereda de Persona
    //Atributos
    private int clienteId;
    private List<Venta> historialCompras;// Atributo privado que almacena las compras del cliente
    //Constructor
    public Cliente(String nombre, String dni, String telefono, String direccion, int clienteId) { 
        super(nombre, dni, telefono, direccion); //Llamo al constructor de la superclase Persona e inicializo clienteId
        this.clienteId = clienteId;//Inicializo
        this.historialCompras = new ArrayList<>();
    }
    
    public void agregarCompra (Venta venta){ //Permite agregar una venta al historial del cliente
        historialCompras.add(venta);
    }

    public List<Venta> getHistorialCompras(){ //Obtiene una copia del historial de compra
        return new ArrayList<>(historialCompras);
    }
}

