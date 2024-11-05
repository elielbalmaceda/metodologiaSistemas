import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Sistema principal que gestiona todo el sistema de venta de vehiculos
public class SistemaVentaVehiculos {

    //Listas que almacenan los datos principales del sistema
    private List<Cliente> clientes; //Almacena todos los clientes registrados
    private List<Vendedor> vendedores; //Almacena todos los vendedores
    private List<Vehiculo> vehiculos; //Almacena el inventario de vehiculos
    private List<Venta> ventas; //Almacena el registro de ventas

    //Constructor que inicializa todas las listas vacias
    public SistemaVentaVehiculos() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.vehiculos = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    //Metodos getter y setter para acceder a las listas
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

    //Metodos para registrar nuevos elementos en el sistema
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Metodo que filtra y devuelve solo los vehiculos disponibles para venta
    public List<Vehiculo> buscarVehiculosDisponibles() {
        return vehiculos.stream()
                       .filter(Vehiculo::estaDisponible)
                       .collect(Collectors.toList());
    }

    // Metodo para procesar una venta
    public boolean realizarVenta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago) {
        Venta venta = new Venta(cliente, vendedor, vehiculo, formaPago);
        if (venta.procesarVenta()) {
            ventas.add(venta);
            return true;
        }
        return false;
    }

        // Metodo para mostrar todos los datos del sistema
        //Mostrar los datos del sistema de forma organizada
        public void mostrarDatosSistema() {
            System.out.println("\n====== SISTEMA DE VENTA DE VEHICULOS ======\n");
            
            mostrarClientes();
            System.out.println("\n" + "=".repeat(40) + "\n"); //Imprime un separador: una línea de 40 caracteres "=" con saltos de línea
            
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
            if (clientes.isEmpty()) { //Verifica si la lista esta vacia 
                System.out.println("No hay clientes registrados.");
            } else {
                for (Cliente cliente : clientes) { 
                    System.out.println("Nombre: " + cliente.getNombre());
                    System.out.println("DNI: " + cliente.getDni());
                    System.out.println("Telefono: " + cliente.getTelefono());
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
                    System.out.println("Codigo: " + vendedor.getCodigo());
                    System.out.println("DNI: " + vendedor.getDni());
                    System.out.println("Comision: " + vendedor.getComision() + "%");
                    System.out.println("Ventas realizadas: " + vendedor.getVentas().size());
                    System.out.println("-".repeat(40));
                }
            }
        }
    
        // Mostrar todos los vehículos
        public void mostrarVehiculos() {
            System.out.println("INVENTARIO DE VEHICULOS:");
            System.out.println("-".repeat(40));
            if (vehiculos.isEmpty()) {
                System.out.println("No hay vehiculos en inventario.");
            } else {
                for (Vehiculo vehiculo : vehiculos) {
                    System.out.println("Marca: " + vehiculo.getMarca());
                    System.out.println("Modelo: " + vehiculo.getModelo());
                    System.out.println("Ano: " + vehiculo.getAnio());
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
    
        // Método para mostrar estadisticas generales
        public void mostrarEstadisticas() {
            System.out.println("\n====== ESTADISTICAS DEL SISTEMA ======\n");
            
            // Totales
            System.out.println("TOTALES:");
            System.out.println("- Clientes registrados: " + clientes.size()); //size() devuelve el numero que haya en la lista en este caso de clientes
            System.out.println("- Vendedores activos: " + vendedores.size());
            System.out.println("- Vehiculos en inventario: " + vehiculos.size());
            System.out.println("- Ventas realizadas: " + ventas.size());
            
            // Vehiculos disponibles
            long vehiculosDisponibles = vehiculos.stream()
                    .filter(Vehiculo::estaDisponible)
                    .count();
            System.out.println("- Vehiculos disponibles: " + vehiculosDisponibles);
            
            // Monto total de ventas
            double montoTotalVentas = ventas.stream()
                    .mapToDouble(Venta::getMontoTotal)
                    .sum();
            System.out.println("- Monto total de ventas: $" + montoTotalVentas);
            
            System.out.println("\n" + "=".repeat(40));
        }
}
