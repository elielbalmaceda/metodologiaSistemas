package com.proyectoMetodologia;

import java.time.LocalDate;

public class Vehiculo implements Vendible { //Implementa la interfaz Vendible.

    //Atributos
    private int vehiculoId;
    private String marca;
    private String modelo;
    private int año;
    private double precio;
    private String estado;

    //Constructor
    public Vehiculo(String marca, String modelo, int año, double precio, String estado){//Inicializacion de los atributos y establezco estado siempre a "Disponible"
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.estado = "Disponible"; 
    }

    //Getters y Setters
    public int getVehiculoId() {
        return vehiculoId;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    @Override
    public double calcularPrecioFinal(){
        // Lógica para calcular precio final según antigüedad
        int antiguedad = LocalDate.now().getYear() - año; //Calcula cuántos años han pasado desde un año dado (año) hasta el año actual.
        if (antiguedad > 5){
            return precio * 0.9;// 10% descuento para vehículos > 5 años
        }
        return precio;
    }

    @Override
    public boolean estaDisponible(){
        return estado.equals("Disponible");
    }

    @Override
    public void marcarComoVendido(){
        estado = "Vendido";
    }
}
