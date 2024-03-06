import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio Nº 2 - Manejo de Inventarios en un Comercio - Individual
        Imagina que estás desarrollando un sistema de gestión de inventarios para un comercio minorista.
        Los usuarios pueden agregar productos al inventario proporcionando información como el nombre del producto,
        el precio y la cantidad disponible. Tu tarea es implementar una función que maneje la gestión de
        inventarios, validando los datos ingresados y manejando excepciones en caso de errores o datos inválidos.
        Trata de ser lo más descriptivo posible en cada mensaje de excepción (en caso de que ésta sea opersonalizada)
        o de utilizar los tipos correctos de excepción en cada caso.  */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        List<Producto> inventario = new ArrayList<>();
        boolean masProducto = false;

        //Vamos a implementar el caso de prueba para la inserción de un único producto
        //Si queremos implementarlo para los productos que el usuario quiera utilizaríamos un ciclo do o do while
        do {
            System.out.println("Nombre del producto:");
            String nombre = scanner.nextLine();

            System.out.println("Precio del producto:");
            double precio = scanner.nextDouble();

            System.out.println("Cantidad del producto:");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto producto = new Producto(nombre, precio, cantidad);
            try {
                producto.validarDatos();
                inventario.add(producto);
            } catch (InventarioException e) {
                System.out.println("Excepción detectada: " + e.getMessage());
            }
            System.out.println("INVENTARIO DE PRODUCTOS:");
            for (Producto productos : inventario) {
                System.out.println(productos.toString());
            }
            System.out.println("Quiere agregar algún producto más? si/no");
            String respuesta = scanner.nextLine();
            if (respuesta.equals("si")) {
                masProducto = true;
            } else masProducto = false;
        } while (masProducto);

    }
}