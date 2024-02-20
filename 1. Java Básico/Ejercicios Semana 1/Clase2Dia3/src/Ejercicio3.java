import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        /*Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas
        de la última semana, calcule la temperatura máxima promedio que hubo.
        Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente
        temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el
        promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.*/

        //Declaramos el scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Declaramos las variables
        double[] temperaturas = new double[7];
        int i;
        double suma = 0, promedio = 0;

        //Preguntamos por las temperaturas de los días de la semana con un ciclo for
        for (i = 1; i < temperaturas.length + 1; i++) {
            System.out.println("Introduzca la temperatura máxima del día " + i);
            temperaturas[i - 1] = scanner.nextDouble();
            suma += temperaturas[i - 1];
            promedio = suma / i;
        }
        for (i = 1; i < temperaturas.length + 1; i++) {
            System.out.println("Temperatura del día " + i + ": " + temperaturas[i - 1] + "ºC");
        }

        System.out.println("la suma de las temperaturas de la semana es: " + suma + " y el promedio de estas es: " + Math.round(promedio * 100.0) / 100.0);
    }
}
