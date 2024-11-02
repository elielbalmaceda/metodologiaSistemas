// Clase base para persona (aplicando herencia)
//Clase abstracta que sirve como base para represntar una persona.
//Al ser abstracta, no se pueden crear objetos directamente de esta clase (Creamos en la clase App)
public abstract class Persona {
    //Atributos protegidos que heredaran las clases hijas
    /*Protected significa que solo es visible ese atributo desde una de las clases hijas y no desde otra clase */
    protected String nombre;
    protected String dni;
    protected String telefono;
    protected String email;

    //Constructor que inicializa todos los atributos de la persona 
    public Persona(String nombre, String dni, String telefono, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    //Metodos getter y setter (Para acceder y modificar el nombre, dni, telefono, email)
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
