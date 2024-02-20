import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        /*Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que
        represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento
        (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
        Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla
        luego de cada reserva.
        Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro.
        ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
        El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado.
        Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.*/

        //Declaramos el scanner
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables
        String[][] asientos = new String[5][5];
        String reserva;
        int fila, columna;

        //Indicamos todos los asientos como vacíos y los mostramos
        for (fila = 0; fila < asientos.length; fila++) {
            for (columna = 0; columna < asientos.length; columna++) {
                asientos[fila][columna] = "o";
            }
        }

        //Mostramos todos los asientos ordenados en una cuadrícula

        for (fila = 0; fila < asientos.length; fila++) {
            System.out.print("|");
            for (columna = 0; columna < asientos[fila].length; columna++) {
                System.out.print(asientos[fila][columna]);
                if (columna != asientos[fila].length - 1) {
                    System.out.print("\t");
                }
            }
            System.out.println("|");
        }

        //Ahora que se ve el mapa de los asientos con claridad vamos rellenando por petición del usuario
        do {
            System.out.println("Que asiento desea reservar?");
            System.out.println("Por favor, indique la fila: numeros del 0 al 4");
            fila = scanner.nextInt();
            System.out.println("Por favor, indique la columna: numeros del 0 al 4");
            columna = scanner.nextInt();
            scanner.nextLine();

            if (asientos[fila][columna].equals("x")) {//Comprobamos que el asiento no esté ocupado
                System.out.println("lo sentimos, El asiento está ocupado.");
            } else {
                asientos[fila][columna] = "x";
                System.out.println("Reserva confirmada!!");
            }

            System.out.println("Disposición actual de los asientos ocupados(x)/libres(o)");
            for (fila = 0; fila < asientos.length; fila++) {
                System.out.print("|");
                for (columna = 0; columna < asientos[fila].length; columna++) {
                    System.out.print(asientos[fila][columna]);
                    if (columna != asientos[fila].length - 1) {
                        System.out.print("\t");
                    }
                }
                System.out.println("|");
            }
            System.out.println("Quiere realizar alguna reserva más? si/no");
            reserva = scanner.nextLine();
        } while (!reserva.equals("no"));
        System.out.println("Gracias por utilizar nuestro portal de reservas de eventos culturales!!");
    }
}
