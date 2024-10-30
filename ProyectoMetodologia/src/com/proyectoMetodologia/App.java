package com.proyectoMetodologia;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
            // Inicializar el sistema
            SistemaVentaVehiculos sistema = new SistemaVentaVehiculos(); //Inicializo una instancia de SistemaVentaVehiculos

            // Crear un cliente
            Cliente cliente = new Cliente("Eliel Balmaceda", "12345678", "3462-11111","calle falsa 123", 1); //Creo un nuevo objeto Cliente 
            sistema.registrarCliente(cliente); //Registro Cliente nuevo en el sistema
    
            // Crear un vendedor
            Vendedor vendedor = new Vendedor("Ana López", "87654321", "555-5678", "ana@email.com", "V001", 5.0);//Creo un nuevo objeto Vendedor
            sistema.registrarVendedor(vendedor);
    
            // Agregar un vehículo
            Vehiculo vehiculo = new Vehiculo("Toyota", "Corolla", 2020, 20000.0, "Disponible");
            sistema.agregarVehiculo(vehiculo);
    
            // Realizar una venta
            if (sistema.realizarVenta(cliente, vendedor, vehiculo, "Efectivo")) { //Agrego un vehiculo al sistema con los datos que puse
                System.out.println("Venta realizada con éxito");
                // La venta generará automáticamente el comprobante y actualizará las comisiones
            } else {
                System.out.println("No se pudo realizar la venta");
            }
    
            // Mostrar vehículos disponibles
            List<Vehiculo> disponibles = sistema.buscarVehiculosDisponibles(); //Busco los vehiculos disponibles 
            System.out.println("Vehículos disponibles: " + disponibles.size()); //Muestro la cantidad de vehiculos
        }
  }
    }
}
