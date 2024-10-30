package com.proyectoMetodologia;

import java.time.LocalDate;

// Clase Venta para gestionar las transacciones
public class Venta {
    private int ventaId;
    private Cliente cliente;
    private Vendedor vendedor;
    private Vehiculo vehiculo;
    private LocalDate fecha;
    private double montoTotal;
    private String formaPago;

    public Venta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, String formaPago){
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.vehiculo = vehiculo;
        this.fecha = LocalDate.now(); //Se inicializa con la fecha actual
        this.formaPago = formaPago;
        this.montoTotal = vehiculo.calcularPrecioFinal(); //Calculado en funcion del metodo
    }
    //Valida la disponibilidad del vehiculo.
    public boolean procesarVenta(){
        if(!vehiculo.estaDisponible()){
            return false; 
        }
            //Si el vehiculo esta disponible, lo marca como vendido, registra la compra en el cliente y la venta del vendedor.
        try {
            vehiculo.marcarComoVendido();
            cliente.agregarCompra(this);
            vendedor.registrarVenta(this);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    //Metodo que genera un comprobante de venta. Devuelve un string que contiene la informacion del comprobante
    public String generarComprobante(){
        return "Comprobante de Venta\n" +
        "Fecha: " + fecha + "\n" +
        "Cliente: " + cliente.getNombre() + "\n" +
        "Vehiculo: " + vehiculo.getMarca() + " " + vehiculo.getModelo() + " (" + vehiculo.getAño() + ")\n" +
        "Vendedor: " + vendedor.getNombre() + "\n" +
        "Monto Total: " + String.format("%.2f", montoTotal) + "\n" +
        "Forma de Pago: " + formaPago;
    }
}
