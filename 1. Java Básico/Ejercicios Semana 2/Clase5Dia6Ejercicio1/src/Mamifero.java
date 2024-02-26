public class Mamifero extends Animal {
    private int numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Mamifero() {
    }

    public Mamifero(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, int numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    public void saludar() {
        System.out.println("Hola, soy un Mamífero");
    }

    @Override
    public String toString() {
        return "Mamifero: " +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tipoPiel='" + tipoPiel + '\'' +
                ", tipoAlimentacion='" + tipoAlimentacion + '\'' +
                "numeroPatas=" + numeroPatas +
                ", tipoReproduccion='" + tipoReproduccion + '\'' +
                ", colorPelaje='" + colorPelaje + '\'' +
                ", habitat='" + habitat + '\'';
    }
}
