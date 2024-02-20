import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Utilizamos la clase Scanner para la inserción de los números
        Scanner scanner = new Scanner(System.in);

        //Declaramos las variables para los 2 números con los que vamos a operar
        int num1, num2, suma, resta, producto, division;

        //Solicitamos al usuario los números con los que quiere que se realicen las operaciones
        System.out.println("CALCULADORA CON 2 NUMEROS ENTEROS");
        System.out.println("Por favor, introduzca un número entero: ");
        num1 = scanner.nextInt();

        System.out.println("Por favor, introduzca otro número entero: ");
        num2 = scanner.nextInt();

        /*Asignamos a las variables de las operaciones sus correspondientes comandos para que
        cada variable realice la operación correcta*/
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division = num1 / num2;

        //Mostramos los resultados en consola
        System.out.println("RESULTADOS:\nSuma: " + suma + "\nResta: " + resta + "\nProducto: " + producto + "\nDivisión: " + division);

        /*Si ingresamos como segundo número el "0" nos da una indeterminación que en el programa lanza una excepción
        la cual todavía no sabemos controlar.
         */
    }
}
