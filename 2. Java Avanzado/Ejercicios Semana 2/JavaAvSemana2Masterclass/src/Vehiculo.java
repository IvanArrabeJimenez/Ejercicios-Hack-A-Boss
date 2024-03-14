public class Vehiculo {
    private String modelo;
    private String marca;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, String marca, double precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Vehiculo-> " +
                "modelo: " + modelo +
                ", marca: " + marca +
                ", precio: " + precio + "€";
    }
}
