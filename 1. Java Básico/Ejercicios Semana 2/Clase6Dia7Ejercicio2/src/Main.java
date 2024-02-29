import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Un administrador de una tienda de electrónica necesita un programa para gestionar los productos en su inventario.
        Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca,
        tipo, precio costo, precio venta, cantidad en stock.
        A partir de esto, realizar las siguientes acciones en el programa desarrollado:
        a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados
        (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
        b) Guardar estos objetos creados en un ArrayList.
        c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
        d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
        e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
        f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del
        stock y actualizar el registro en la lista en base a eso.
        g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.*/

        //Creamos y cargamos el ArrayList con los 10 productos

        List<Producto> productos = new ArrayList<>();
        double precioVenta = 0;
        double precioCosto = 0;
        int stock = 0;

        productos.add(new Producto(1, "ordenador", "asus", "portatil", 250.60, 550.90, 55));
        productos.add(new Producto(2, "iphone", "apple", "movil", 500.00, 950.00, 150));
        productos.add(new Producto(3, "pro x", "logitech", "auriculares", 60.80, 140.50, 20));
        productos.add(new Producto(4, "huntsman v2", "razer", "teclado", 80.40, 126.70, 30));
        productos.add(new Producto(5, "G502", "logitech", "raton", 20.90, 45.80, 60));
        productos.add(new Producto(6, "airpods", "apple", "auriculares", 90.80, 170.40, 15));
        productos.add(new Producto(7, "rx 5700 xt", "saphire", "tarjeta gráfica", 250.00, 427.30, 9));
        productos.add(new Producto(8, "ssd980", "samsung", "disco duro", 50.70, 120.00, 75));
        productos.add(new Producto(9, "series X", "xbox", "consola", 345.90, 499.99, 24));
        productos.add(new Producto(10, "rift", "oculus", "gafas vr", 150.00, 300.00, 4));

        System.out.println("LISTA DE PRODUCTOS EN STOCK");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        //Determinar el producto con el mayor precio de venta
        for (Producto producto : productos) {
            if (producto.getPrecioVenta() > precioVenta) {
                precioVenta = producto.getPrecioVenta();
            }
        }
        System.out.println("\nEl mayor precio de venta es: " + precioVenta);

        //Determinar el producto con el mayor precio de costo
        for (Producto producto : productos) {
            if (producto.getPrecioCosto() > precioCosto) {
                precioCosto = producto.getPrecioCosto();
            }
        }
        System.out.println("\nEl mayor precio de costo es: " + precioCosto);

        //Borrar el producto que se encuentre en la posición 5 del ArrayList.
        productos.remove(5 - 1);
        System.out.println("\nACTUALIZACIÓN LISTA DE PRODUCTOS EN STOCK");
        for (Producto producto : productos) {
            System.out.println(producto.toString());
        }

        /*Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del
        stock y actualizar el registro en la lista en base a eso.*/
        for (Producto producto : productos) {
            if (producto.getCantidadStock() > stock) {
                stock = producto.getCantidadStock();
            }
        }
            System.out.println("\nEl mayor número de unidades en stock es: " + stock);

        }
    }