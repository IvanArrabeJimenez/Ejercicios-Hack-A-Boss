public class Zapato extends Vestimenta {
    private String material;
    private String tipoCierre;

    public Zapato() {
    }

    public Zapato(int codigo, String nombre, double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String Mostrar() {
        return "Estos zapatos son de marca: " + super.getMarca();
    }
}
