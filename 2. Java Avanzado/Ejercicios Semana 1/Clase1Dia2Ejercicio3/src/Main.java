import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio Nº 3 - Vectores y excepciones - Individual
        Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar información en un
        vector y acceder a ella posteriormente. Tu tarea es implementar una función que te permita almacenar
        datos en un vector y manejar excepciones estándar de Java teniendo en cuenta lo siguiente:
        -Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un vector de tamaño
        fijo para simplificar el ejercicio.
        -Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector proporcionando
        un índice.
        -Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no existe en el
        vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
        -Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás intentando
        acceder a una posición inválida en el vector.*/
        Scanner scanner =new Scanner(System.in);

        //Creamos y almacenamos los datos en el vector
        int[] numeros= {4,8,6,7,3};

        //Mecanismo para acceder a los datos almacenados
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición "+(i)+": "+numeros[i]);
        }

        /*Utilizamos una excepción estándar para avisar de que nos salimos de los límites de un vector
         Intentamos acceder a una posición fuera de los límites y lo capturamos con un mensaje que nos
         indica que estamos intentando acceder a una posición inválida*/

        try {
            // Intentar acceder a una posición fuera del rango del vector
            System.out.println("Diga una posición del vector: ");
            int posicion=scanner.nextInt();
            System.out.println("Valor obtenido: " + numeros[posicion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Capturar la excepción y mostrar un mensaje
            System.out.println("Error: Se intentó acceder a una posición fuera del rango del vector. Tamaño del vector: "+numeros.length);
        }
    }
}