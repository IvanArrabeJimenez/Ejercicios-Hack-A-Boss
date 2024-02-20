import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        /*a) Una recital permite únicamente el ingreso de mayores de 18 años.
        Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        El programa debe mostrar (según cada caso) un mensaje informando la situación.
         */
        Scanner scanner = new Scanner(System.in);

        int edad;

        System.out.println("Por favor, ingrese su edad:");
        edad = scanner.nextInt();

        if (edad >= 18) {//He incluido a los que ya tienen 18 años, si no se incluyen quitaríamos el "="
            System.out.println("Enhorabuena!!! Puede ingresar en el evento. Disfrute!!");
        } else System.out.println("Lo sentimos!!! No tiene la edad suficiente para ingresar en el evento.");
    }
}
