public class Camiseta extends Vestimenta {
    private String manga;
    private String cuello;

    public Camiseta() {
    }

    public Camiseta(int codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    @Override
    public String Mostrar() {
        return "Esta camiseta es de manga: " + manga;
    }
}
