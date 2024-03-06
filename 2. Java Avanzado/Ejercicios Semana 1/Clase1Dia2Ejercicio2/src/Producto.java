public class Producto {
    private String nombre;
    private double precio;
    private int cantidadStock;

    public Producto() {
    }

    public Producto(String nombre, double precio, int cantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto-> " +
                " nombre: " + nombre + '\'' +
                ", precio: " + precio + "€" +
                ", cantidadStock: " + cantidadStock;
    }

    public void validarDatos() throws InventarioException {
        if (this.nombre.equals("")) {
            throw new InventarioException("Nombre introducido incorrecto o no introducido");
        } else if (this.precio <= 0) {
            throw new InventarioException("Precio incorrecto, ingrese un precio superior a 0.0€");
        } else if (this.cantidadStock <= 0) {
            throw new InventarioException("Cantidad a sumar en stock incorrecta, ingrese una cantidad superior a 0 unidades");
        }
    }
}
