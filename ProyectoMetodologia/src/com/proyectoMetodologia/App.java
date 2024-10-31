package com.proyectoMetodologia;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
            // Inicializar el sistema
            SistemaVentaVehiculos sistema = new SistemaVentaVehiculos();

            // Crear un cliente
            Cliente cliente = new Cliente("Eliel Balmaceda", "12345678", "3462-11111","calle falsa 123", 1);
            sistema.registrarCliente(cliente);
    
            // Crear un vendedor
            Vendedor vendedor = new Vendedor("Ana López", "87654321", "555-5678", "ana@email.com", "V001", 5.0);
            sistema.registrarVendedor(vendedor);
    
            // Agregar un vehículo
            Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020, 20000.0, "Disponible");
            sistema.agregarVehiculo(vehiculo);
    
            // Realizar una venta
            if (sistema.realizarVenta(cliente, vendedor, vehiculo, "Efectivo")) {
                System.out.println("Venta realizada con éxito");
                // La venta generará automáticamente el comprobante y actualizará las comisiones
            } else {
                System.out.println("No se pudo realizar la venta");
            }
    
            // Mostrar vehículos disponibles
            List<Vehiculo> disponibles = sistema.buscarVehiculosDisponibles();
            System.out.println("Vehículos disponibles: " + disponibles.size());
        }
  }
