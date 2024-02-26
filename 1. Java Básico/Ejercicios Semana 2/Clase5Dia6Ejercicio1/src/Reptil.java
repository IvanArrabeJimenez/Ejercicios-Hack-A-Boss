public class Reptil extends Animal {
    private double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Reptil() {
    }

    public Reptil(int id, String nombre, int edad, String tipoPiel, String tipoAlimentacion, double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    public void saludar() {
        System.out.println("Hola, soy un Reptil");
    }
}
