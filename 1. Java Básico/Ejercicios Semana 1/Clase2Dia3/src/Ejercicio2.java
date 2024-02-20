import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        /*Imagina que eres un cajero en un supermercado. Crea un programa en Java que
        permita ingresar el precio de varios productos comprados por un cliente.
        Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo
        precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.*/

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String masProductos;
        Double precio, total = 0.0;

        System.out.println("Bienvenido a nuestro supermercado!!");
        do {
            System.out.println("Por favor, indique el precio del producto selecionado: ");
            precio = scanner.nextDouble();
            scanner.nextLine();
            total += precio;

            System.out.println("Producto añadido a la cesta!");
            System.out.println("El total de su cesta de la compra asciende a " + Math.round(total * 100.0) / 100.0 + " €");
            System.out.println("Desea comprar más productos? si/no");
            masProductos = scanner.nextLine();
        } while (!masProductos.equals("no"));

        System.out.println("El total a abonar es de: " + Math.round(total * 100.0) / 100.0 + " €");
        System.out.println("Gracias por utilizar nuestra red de supermercados!!");
    }
}
