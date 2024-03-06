import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Ejercicio Nº 1 - Reserva de Vuelos - Individual
        Imagina que estás desarrollando un sistema de reservas de vuelos para una aerolínea.
        Los usuarios pueden realizar reservas de vuelos proporcionando información como su nombre,
        destino, fecha de viaje y número de asientos deseados. Tu tarea es implementar una función de
        reserva de vuelos que valide los datos ingresados y maneje excepciones si los datos son incorrectos
        o si no hay suficientes asientos disponibles en el vuelo.
        Debes crear una excepción personalizada, por ejemplo, ReservaInvalidaException, que se lance en
        situaciones excepcionales, como cuando un usuario intenta reservar más asientos de los disponibles o
        si falta información esencial. La excepción personalizada debe proporcionar un mensaje claro sobre la
        causa del error.*/
        Scanner scanner = new Scanner(System.in);
        int asientosDisponibles = 100;

        //Mientras hay asientos disponibles repetimos el proceso de selección de asientos
        do {
            System.out.println("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.println("Destino: ");
            String destino = scanner.nextLine();

            System.out.println("Fecha de viaje: ");
            String fecha = scanner.nextLine();

            System.out.println("Asientos disponibles: " + asientosDisponibles);
            System.out.println("Numero de asientos que solicita: ");
            int asientos = scanner.nextInt();
            scanner.nextLine();

            Reserva reserva = new Reserva(nombre, destino, fecha, asientos);

            //Recogemos y mostramos las excepciones que pueden surgir cuando introducimos datos
            try {
                reserva.ValidacionDatos();
                reserva.reservarVuelo(asientos, asientosDisponibles);
                asientosDisponibles = reserva.getAsientosDisponibles();
                System.out.println("Reserva realizada con éxito");
            } catch (ReservaInvalidaException e) {
                System.out.println("Excepción detectada: " + e.getMessage());
            }
        } while (asientosDisponibles > 0);
        //Cuando el número de asientos disponibles es 0 cerramos el programa y mostramos un mensaje de despedida
        System.out.println("""
                VUELO COMPLETO!!
                NO SE ADMITEN MÁS RESERVAS!!
                GRACIAS POR UTILIZAR NUESTRA AGENCIA PARA REALIZAR SUS VIAJES.
                """);
    }
}