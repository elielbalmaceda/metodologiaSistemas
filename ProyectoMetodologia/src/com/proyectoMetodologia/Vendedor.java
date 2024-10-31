package com.proyectoMetodologia;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Persona { //Clase que hereda de persona

    private String codigo;
    private double comision;
    private List <Venta> ventas;
    
    public Vendedor(String nombre, String dni, String telefono, String email, String codigo, double comision) {
        super(nombre,dni, telefono, email); //Llamo al constructor de la superclase Persona
        this.codigo = codigo;
        this.comision = comision;
        this.ventas = new ArrayList<>();
    }
    //Metodo que permite calcular la comision basada en el monto de la venta 
    public double calcularComisionVenta(double montoVenta){
        return montoVenta * (comision / 100);
    }
    //Metodo que permite registrar la venta en la lista de ventas
    public void registrarVenta(Venta venta){
        ventas.add(venta);
    }
}
ssssss