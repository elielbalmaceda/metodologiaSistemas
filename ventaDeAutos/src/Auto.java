//Esto seria la HERENCIA.
public class Auto extends Vehiculo { 
    private int puertas;

    public Auto (String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas; //Llamada al constructor de la superclase Vehiculo
    }
    //Metodo para mostrar la informacion especifica del auto
    @Override
    public void mostrarInfo(){
        super.mostrarInfo(); //Llama a la clase padre
        System.out.println("Número de puertas: " + puertas);

    }
}
