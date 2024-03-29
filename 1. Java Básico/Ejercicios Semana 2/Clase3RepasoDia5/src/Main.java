public class Main {
    public static void main(String[] args) {
        /*Trabajando en equipos de 3 o 4 integrantes, deberán crear una clase llamada Verdura, que tenga los siguientes
        atributos: id, nombre, color, calorías, debeCocinarse (tener en cuenta todos sus atributos, constructores, métodos getters y setters).
        Luego, realiza las siguientes acciones:
        a) Crear un vector (array) de tipo Verdura que pueda almacenar 5 verduras. Crear 5 verduras y guardarlas en el vector.
        b) Recorrer el vector creado y mostrar por pantalla el nombre y las calorías de las verduras almacenadas.
        c) Cambiar todos los datos de dos verduras. Mostrar por pantalla los datos de todas las verduras luego del cambio.
        d) Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.*/

        //Creamos el vector
        Verdura[] verduras = new Verdura[5];

        //Creamos 5 verduras y las guardamos en el vector
        verduras[0] = new Verdura(1, "lechuga", "verde", 47, false);
        verduras[1] = new Verdura(2, "tomate", "rojo", 34, false);
        verduras[2] = new Verdura(3, "brocoli", "verde", 56, true);
        verduras[3] = new Verdura(4, "coliflor", "blanco", 87, true);
        verduras[4] = new Verdura(5, "guisante", "verde", 39, true);

        //Recorremos el vector y mostramos el nombre y calorías de las verduras almacenadas

        for (int i = 0; i < verduras.length; i++) {
            System.out.println("Nombre verdura: " + verduras[i].getNombre() + ", calorías: " + verduras[i].getCalorias());
        }

        //Cambiamos los datos de 2 verduras y mostrar los datos de todas las verduras.
        verduras[1].setId(6);
        verduras[1].setNombre("patata");
        verduras[1].setColor("marrón");
        verduras[1].setCalorias(68);
        verduras[1].setDebeCocinarse(true);

        verduras[4].setId(7);
        verduras[4].setNombre("zanahoria");
        verduras[4].setColor("naranja");
        verduras[4].setCalorias(43);
        verduras[4].setDebeCocinarse(false);

        System.out.println("\nVerduras registradas tras los cambios realizados:");

        for (int i = 0; i < verduras.length; i++) {
            System.out.println("Id: " + verduras[i].getId() + " Nombre: " + verduras[i].getNombre() + ", color: " + verduras[i].getColor() + ", calorías: " + verduras[i].getCalorias() + ", debe cocinarse: " + verduras[i].isDebeCocinarse());
        }
        System.out.println("\nVerduras de color verde: ");
        //Recorrer el vector y mostrar por pantalla únicamente a las verduras que sean de color verde.
        for (int i = 0; i < verduras.length; i++) {
            if (verduras[i].getColor().equals("verde")) {
                System.out.println("Id: " + verduras[i].getId() + " Nombre: " + verduras[i].getNombre() + ", color: " + verduras[i].getColor() + ", calorías: " + verduras[i].getCalorias() + ", debe cocinarse: " + verduras[i].isDebeCocinarse());
            }
        }
    }
}