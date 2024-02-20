public class Ejercicio3 {
    public static void main(String[] args) {
        /*Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.
        Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).
         */
        //Declaramos variables
        Double base, altura, area;

        //Asignamos valores a la base y la altura
        base = 86.4;
        altura = 67.23;

        //Realizamos el cálculo del área con la fórmula correspondiente
        area = (base * altura) / 2;

        //Mostramos en consola el resultado del cálculo del área de nuestro triángulo
        System.out.println("El área de nuestro triángulo es: " + Math.round(area * 100.0) / 100.0);
        /*Aplicando los conocimientos adquiridos en clase Redondeamos con la clase Math.round*/
    }
}
