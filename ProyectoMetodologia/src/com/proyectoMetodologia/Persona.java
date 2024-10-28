package com.proyectoMetodologia;

//Una clase abstracta es una clase que no se puede instanciar directamente; solo puede servir como "modelo" o "base" para otras clases
public abstract class Persona { 
    protected String nombre; //protected permite que el atributo o método sea accesible desde la misma clase, el mismo paquete y las subclases (incluso si están en paquetes diferentes).
    protected String dni;
    protected String telefono;
    protected String direccion;

    public Persona(String nombre, String dni, String telefono, String direccion) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}

