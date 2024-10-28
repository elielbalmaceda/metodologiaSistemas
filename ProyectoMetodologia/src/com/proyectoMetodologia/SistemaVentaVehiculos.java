package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Sistema principal que gestiona todo
public class SistemaVentaVehiculos {

    private List <Cliente> clientes;
    private List <Vendedor> vendedores;
    private List <Vehiculo> vehiculos;
    private List <Venta> ventas;

    public SistemaVentaVehiculos(){
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }
    
    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> buscarVehiculosDisponibles() {
        return vehiculos.stream()
                       .filter(Vehiculo::estaDisponible)
                       .collect(Collectors.toList());
    }

    public boolean realizarVenta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago) {
        Venta venta = new Venta(cliente, vendedor, vehiculo, formaPago);
        if (venta.procesarVenta()) {
            ventas.add(venta);
            return true;
        }
        return false;
    }
}

