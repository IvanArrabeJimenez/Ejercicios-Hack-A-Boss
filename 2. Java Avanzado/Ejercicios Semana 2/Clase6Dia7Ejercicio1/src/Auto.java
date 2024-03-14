public class Auto {
    private String marca;
    private String modelo;
    private int anio;
    private double precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Auto-> " +
                "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Año: " + anio +
                ", Precio: " + precio;
    }
}
