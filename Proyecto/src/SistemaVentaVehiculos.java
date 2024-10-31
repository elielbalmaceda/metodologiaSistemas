import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Sistema principal que gestiona todo
public class SistemaVentaVehiculos {
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Vehiculo> vehiculos;
    private List<Venta> ventas;

    public SistemaVentaVehiculos() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
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

        // Método para mostrar todos los datos del sistema
        public void mostrarDatosSistema() {
            System.out.println("\n====== SISTEMA DE VENTA DE VEHÍCULOS ======\n");
            
            mostrarClientes();
            System.out.println("\n" + "=".repeat(40) + "\n");
            
            mostrarVendedores();
            System.out.println("\n" + "=".repeat(40) + "\n");
            
            mostrarVehiculos();
            System.out.println("\n" + "=".repeat(40) + "\n");
            
            mostrarVentas();
        }
    
        // Mostrar todos los clientes registrados
        public void mostrarClientes() {
            System.out.println("CLIENTES REGISTRADOS:");
            System.out.println("-".repeat(40));
            if (clientes.isEmpty()) {
                System.out.println("No hay clientes registrados.");
            } else {
                for (Cliente cliente : clientes) {
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("DNI: " + cliente.getDni());
                    System.out.println("Teléfono: " + cliente.getTelefono());
                    System.out.println("Email: " + cliente.getEmail());
                    System.out.println("Compras realizadas: " + cliente.getHistorialCompras().size());
                    System.out.println("-".repeat(40));
                }
            }
        }
    
        // Mostrar todos los vendedores
        public void mostrarVendedores() {
            System.out.println("VENDEDORES:");
            System.out.println("-".repeat(40));
            if (vendedores.isEmpty()) {
                System.out.println("No hay vendedores registrados.");
            } else {
                for (Vendedor vendedor : vendedores) {
                    System.out.println("Nombre: " + vendedor.getNombre());
                    System.out.println("Código: " + vendedor.getCodigo());
                    System.out.println("DNI: " + vendedor.getDni());
                    System.out.println("Comisión: " + vendedor.getComision() + "%");
                    System.out.println("Ventas realizadas: " + vendedor.getVentas().size());
                    System.out.println("-".repeat(40));
                }
            }
        }
    
        // Mostrar todos los vehículos
        public void mostrarVehiculos() {
            System.out.println("INVENTARIO DE VEHÍCULOS:");
            System.out.println("-".repeat(40));
            if (vehiculos.isEmpty()) {
                System.out.println("No hay vehículos en inventario.");
            } else {
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println("Marca: " + vehiculo.getMarca());
                    System.out.println("Modelo: " + vehiculo.getModelo());
                    System.out.println("Año: " + vehiculo.getAnio());
                    System.out.println("Precio: $" + vehiculo.getPrecio());
                    System.out.println("Estado: " + vehiculo.getEstado());
                    System.out.println("Precio Final: $" + vehiculo.calcularPrecioFinal());
                    System.out.println("-".repeat(40));
                }
            }
        }
    
        // Mostrar todas las ventas realizadas
        public void mostrarVentas() {
            System.out.println("REGISTRO DE VENTAS:");
            System.out.println("-".repeat(40));
            if (ventas.isEmpty()) {
                System.out.println("No hay ventas registradas.");
            } else {
                for (Venta venta : ventas) {
                    System.out.println(venta.generarComprobante());
                    System.out.println("-".repeat(40));
                }
            }
        }
    
        // Método para mostrar estadísticas generales
        public void mostrarEstadisticas() {
            System.out.println("\n====== ESTADÍSTICAS DEL SISTEMA ======\n");
            
            // Totales
            System.out.println("TOTALES:");
            System.out.println("- Clientes registrados: " + clientes.size());
            System.out.println("- Vendedores activos: " + vendedores.size());
            System.out.println("- Vehículos en inventario: " + vehiculos.size());
            System.out.println("- Ventas realizadas: " + ventas.size());
            
            // Vehículos disponibles
            long vehiculosDisponibles = vehiculos.stream()
                    .filter(Vehiculo::estaDisponible)
                    .count();
            System.out.println("- Vehículos disponibles: " + vehiculosDisponibles);
            
            // Monto total de ventas
            double montoTotalVentas = ventas.stream()
                    .mapToDouble(Venta::getMontoTotal)
                    .sum();
            System.out.println("- Monto total de ventas: $" + montoTotalVentas);
            
            System.out.println("\n" + "=".repeat(40));
        }
}
