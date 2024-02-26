public class Animal {
    int id;
    String nombre;
    int edad;
    String tipoPiel;
    String tipoAlimentacion;

    public Animal() {
    }

    public Animal(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoPiel = tipoPiel;
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public void saludar() {
        System.out.println("Hola, soy un animal");
    }

    @Override
    public String toString() {
        return "Animal: " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'';
    }
}
