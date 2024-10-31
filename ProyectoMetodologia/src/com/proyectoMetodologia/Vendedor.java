package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona {

    private String codigo;
    private double comision;
    private List <Venta> ventas;
    
    public Vendedor(String nombre, String dni, String telefono, String email, String codigo, double comision) {
        super(nombre,dni, telefono, email);
        this.codigo = codigo;
        this.comision = comision;
        this.ventas = new ArrayList<>();
    }

    public double calcularComisionVenta(double montoVenta){
        return montoVenta * (comision / 100);
    }

    public void registrarVenta(Venta venta){
        ventas.add(venta);
    }
}
ssssss