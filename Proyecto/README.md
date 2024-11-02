# Sistema de Venta de Vehículos

Este proyecto implementa un sistema de gestión de ventas de vehículos utilizando Java y programación orientada a objetos.

## Estructura del Proyecto

### Clases Principales

1. **SistemaVentaVehiculos**
   - Clase principal que gestiona todo el sistema
   - Maneja listas de clientes, vendedores, vehículos y ventas
   - Proporciona métodos para registrar y mostrar información

2. **Persona (Clase Abstracta)**
   - Clase base que define atributos comunes
   - Atributos: nombre, DNI, teléfono, email
   - Utilizada como base para Cliente y Vendedor

3. **Vendedor (extends Persona)**
   - Gestiona información específica de vendedores
   - Maneja comisiones y registro de ventas
   - Hereda atributos básicos de Persona

4. **Vehiculo (implements Vendible)**
   - Representa los vehículos disponibles para venta
   - Implementa la interfaz Vendible
   - Calcula precios según antigüedad

5. **Venta**
   - Maneja las transacciones de vehículos
   - Conecta cliente, vendedor y vehículo
   - Genera comprobantes de venta

### Interfaces

- **Vendible**
  - Define comportamiento para objetos vendibles
  - Métodos: calcularPrecioFinal(), estaDisponible(), marcarComoVendido()

## Características Principales

- Gestión de clientes y vendedores
- Control de inventario de vehículos
- Proceso de ventas
- Cálculo de comisiones
- Generación de comprobantes
- Seguimiento de historial de ventas

## Funcionalidades Clave

1. **Gestión de Ventas**

- boolean realizarVenta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago)

2. **Calculo de Precios**

- double calcularPrecioFinal() Incluye descuentos por antiguedad

3. **Registro de Transacciones**

- void registrarVenta(Venta venta)
- String generarComprobante()

4. **Visualizacion de Datos**

- Mostrar clientes registrados
- Listar vendedores activos
- Ver inventario de vehículos
- Consultar historial de ventas

## Características Técnicas

- Programación Orientada a Objetos
- Herencia y Polimorfismo
- Manejo de Excepciones
- Colecciones (ArrayList)
- Interfaces
- Clases Abstractas



