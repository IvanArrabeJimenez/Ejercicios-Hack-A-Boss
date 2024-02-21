public class Main {
    public static void main(String[] args) {
        /*Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad, dirección y número de teléfono
        (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
        a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego
        mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.*/

        //Crear un vector de tipo Persona cinco posiciones.
        Persona[] personas = new Persona[5];

        //Crear cinco personas y guardarlas en él.
        personas[0] = new Persona(1, "Jose", 32, "Calle Esperanza, 4", "675498736");
        personas[1] = new Persona(2, "Paula", 23, "Calle Mayor, 2", "698625432");
        personas[2] = new Persona(3, "Ramón", 36, "Calle Falsa, 123", "+45609861233");
        personas[3] = new Persona(4, "Luisa", 28, "Avenida de la Concepción, 23", "789685214");
        personas[4] = new Persona(5, "Antonio", 28, "Calle San Segundo, 12", "647845712");

        //Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }
        //Cambiar el nombre de dos personas. Mostrar por pantalla el antes, realizar el cambio y luego
        //mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        System.out.println("\nNOMBRES REGISTRADOS ANTES DE REALIZAR MODIFICACIONES:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }
        //Cambiamos los nombres
        personas[2].setNombre("Julián");
        personas[3].setNombre("Raquel");
        //Volvemos a mostar los resultados
        System.out.println("\nNOMBRES REGISTRADOS DESPUÉS DE REALIZAR MODIFICACIONES:");
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
        }

        //Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.
        System.out.println("\nPERSONAS CON MÁS DE 30 AÑOS");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() > 30) {
                System.out.println("Nombre: " + personas[i].getNombre() + ", Edad: " + personas[i].getEdad());
            }
        }
    }
}