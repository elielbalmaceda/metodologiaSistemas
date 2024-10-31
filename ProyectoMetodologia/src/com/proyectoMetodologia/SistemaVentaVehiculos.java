package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Sistema principal que gestiona todo.
public class SistemaVentaVehiculos {
    //Listas para almacenar.
    private List <Cliente> clientes;
    private List <Vendedor> vendedores;
    private List <Vehiculo> vehiculos;
    private List <Venta> ventas;

    //Inicializo estas listas nuevas como vacias.
    public SistemaVentaVehiculos(){
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    //Permiten agregar un nuevo cliente, vendedor o vehiculo.
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    //Metodo que busca vehiculos disponibles en la lista de vechiculos.
    public List<Vehiculo> buscarVehiculosDisponibles() { /
        return vehiculos.stream()
                       .filter(Vehiculo::estaDisponible) //Filtra vehiculos que esten disponibles y los junta en una nueva lista.
                       .collect(Collectors.toList()); /
    }

    //Meotod para realizar una venta.
    public boolean realizarVenta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago) {
        Venta venta = new Venta(cliente, vendedor, vehiculo, formaPago); //Nueva instancia
        if (venta.procesarVenta()) {
            ventas.add(venta);
            return true; //Si la venta de hace bien, la agrega a lista de venta.
        }
        return false;
    }
}

