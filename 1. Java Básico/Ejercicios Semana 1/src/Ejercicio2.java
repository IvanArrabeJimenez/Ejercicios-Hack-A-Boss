public class Ejercicio2 {
    public static void main(String[] args) {
        /*a) Crea un programa que declare una variable para cada uno de los
        siguientes tipos de datos: int, double, boolean y String. Asigna un
        valor a cada variable y muestra su contenido en la consola.
         */
        //Declaramos las variables
        int edad;
        double peso;
        boolean flag;
        String nombre;

        //Asignamos valor a cada variable
        edad = 35;
        peso = 85.3;
        flag = false;
        nombre = "Ivan";

        //Mostramos el contenido en consola
        System.out.println("DATOS PERSONALES:\nNombre: " + nombre + ". Edad: " + edad + ". Peso: " + peso + ". Profesor: " + flag);

        /*b) Ahora, asigna valores que no correspondan al tipo de dato.
        Por ejemplo, un int en un String o un String en un double… ¿Qué sucede con el programa?
        ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no?
        Justificar el por qué de cada caso. Debatir con otros compañeros.
         */
        //Asignamos valores que no correspondan

        //Asignamos int en un String
        nombre = "35";/*Si lo añadimos como int nos da error debido a que es otro tipo de dato, pero si lo añadimos
        con "", es decir, como String nos lo reconocerá como tal. El dato mostrado será un String.*/
        System.out.println("Nombre: " + nombre);

        //Asignamos Double en un String
        nombre = "45.54";/*Si lo añadimos como Double nos da error debido a que es otro tipo de dato,
        pero si lo añadimos con "", es decir, como String nos lo reconocerá como tal. El dato mostrado será un String.*/
        System.out.println("Nombre: " + nombre);

        //Asignamos String en un Double
        peso = Double.parseDouble("15.98");/*En este caso cualquier cadena de caracteres que no sea un número,
        al introducirlo como String nos dará error. Si introducimos un número con formato String deberemos parsear
        a Double, pero el dato introducido será reconocido como Double no como String. Concluyendo: No se puede
        introducir un String en un Double.*/
        System.out.println("Peso: " + peso);

        //Asignamos String en un int
        edad = Integer.parseInt("27");/*Ocurre lo mismo que en el caso anterior, ya que la única manera de introducirlo
        sin que nos de error es parsearlo a int, pero al hacer esto lo convertimos automáticamente en un int, por
        lo que aunque lo introduzcamos como String pasa a ser un int. En los demás casos nos daría error.*/
        System.out.println("Edad: " + edad);

        //Asignamos Double en int
        edad = (int) 23.78;/*En este caso nos toca castearlo a int ya que en la variable edad sólo nos puede
        mostrar la parte entera del número, por lo tanto en este ejemplo sólo veremos el resultado de 23*/
        System.out.println("Edad: " + edad);

        //Asignamos int en Double
        peso = 67;/*En este caso no habría problema ya que un número entero forma parte de un número decimal.
        Seguramente nos muestre el dato en consola con decimales: 67.0*/
        System.out.println("Peso: " + peso);

        //Boolean
        /*En este caso no podremos introducir ningún otro dato que no sea "true o false",*/
    }
}
