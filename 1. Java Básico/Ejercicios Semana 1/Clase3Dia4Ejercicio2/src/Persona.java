public class Persona {
    //Atributos
    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private String numTelefono;

    //Constructor vacío

    public Persona() {
    }
    //Constructor con parámetros

    public Persona(int id, String nombre, int edad, String direccion, String numTelefono) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
    }

    //Métodos GETTER Y SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}
