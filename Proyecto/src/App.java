public class App {
    public static void main(String[] args) throws Exception {
      // Inicializar el sistema
      SistemaVentaVehiculos sistema = new SistemaVentaVehiculos();

      // Agregar algunos datos de prueba
      // Cliente
      Cliente cliente1 = new Cliente("Juan Pérez", "12345678", "555-1234", "juan@email.com");
      Cliente cliente2 = new Cliente("María García", "87654321", "555-5678", "maria@email.com");
      sistema.registrarCliente(cliente1);
      sistema.registrarCliente(cliente2);

      // Vendedor
      Vendedor vendedor1 = new Vendedor("Ana López", "11223344", "555-9012", "ana@email.com", "V001", 5.0);
      sistema.registrarVendedor(vendedor1);

      // Vehículos
      Vehiculo vehiculo1 = new Vehiculo("Toyota", "Corolla", 2020, 20000.0);
      Vehiculo vehiculo2 = new Vehiculo("Honda", "Civic", 2019, 18000.0);
      Vehiculo vehiculo3 = new Vehiculo("Ford", "Focus", 2021, 22000.0);
      sistema.agregarVehiculo(vehiculo1);
      sistema.agregarVehiculo(vehiculo2);
      sistema.agregarVehiculo(vehiculo3);

      // Realizar algunas ventas
      sistema.realizarVenta(cliente1, vendedor1, vehiculo1, "Efectivo");
      sistema.realizarVenta(cliente2, vendedor1, vehiculo2, "Tarjeta de Crédito");

      // Mostrar todos los datos del sistema
      sistema.mostrarDatosSistema();

      // Mostrar estadísticas
      sistema.mostrarEstadisticas();

      // También se pueden mostrar categorías específicas
      System.out.println("\nMostrando solo vehículos:");
      sistema.mostrarVehiculos();

      System.out.println("\nMostrando solo ventas:");
      sistema.mostrarVentas();
  }  
}

