public class Sombrero extends Vestimenta {
    private String tipo;
    private String tamaño;

    public Sombrero() {
    }

    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    @Override
    public String Mostrar() {
        return "Este sombrero es de tipo " + tipo;
    }
}
