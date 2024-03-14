public class Mascota<T> {
    private int id;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(int id, String nombre, int edad, T especie) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public T getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Mascota-> " +
                "id" + id +
                ", nombre: " + nombre +
                ", edad: " + edad +
                ", especie: " + especie;
    }
}
