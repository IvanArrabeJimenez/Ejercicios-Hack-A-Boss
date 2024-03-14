import java.util.Random;

public class Main {
    public static void main(String[] args) {
        /*Una clínica veterinaria necesita un sistema para administrar su registro de mascotas, para ello, se
        solicita la definición de una clase genérica Mascota<T> con atributos como nombre, edad, y especie
        (no olvides el código o id de mascota para identificar a cada una). Crea una clase utilitaria propia
        llamada RegistroMascotas que cuente con métodos genéricos para:
        Agregar Mascotas al Registro: Utiliza métodos de la clase java.util junto con genéricos para manipular
        colecciones como ArrayList o LinkedList y agregar mascotas de distinto tipo al registro de la veterinaria
        (puedes tomar como ejemplos de tipos: perros, gatos, reptiles y aves).
        Buscar Mascotas por Nombre o Especie: Emplea métodos de las clases utilitarias como Collections o Arrays
        junto con genéricos para realizar búsquedas eficientes por nombre o especie dentro del registro de mascotas.
        Contar la Cantidad Total de Mascotas Registradas: Utiliza métodos de java.util  para obtener el tamaño de
        la colección y contar la cantidad total de mascotas registradas en la veterinaria.
        Generar Datos Aleatorios para Mascotas: Utiliza la clase Random de java.util  para generar datos aleatorios,
        como nombres, edades o especies, para agregar mascotas al registro.*/

        RegistroMascota registro = new RegistroMascota();

        //Generamos los datos aleatorios para crear las mascotas. En este caso vamos a crear 5 mascotas
        //Creamos 2 vectores para tener datos de los nombres y de las especies para poder generarlos aleatoriamente
        String[] nombres = {"Ariel", "Golfo", "Terry", "Rudy", "Ringo", "Roger"};
        String[] especies = {"Perro", "Gato", "Reptil", "Ave"};
        //Instanciamos la clase random para poder generar los aleatorios
        Random random = new Random();

        //Mediante un ciclo for vamos a generar las mascotas aleatoriamente y las agregamos al registro
        for (int i = 1; i <= 5; i++) {
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(15) + 1;//Edades entre 1 y 15 años
            String especie = especies[random.nextInt(especies.length)];
            Mascota<String> mascota = new Mascota<>(i, nombre, edad, especie);
            registro.agregarMascota(mascota);
        }

        //Buscar mascotas por nombre
        String nombreBuscado = "Golfo";
        System.out.println("Mascotas registradas con el nombre " + nombreBuscado + ":");
        if (registro.buscarPorNombre(nombreBuscado).isEmpty()) {
            System.out.println("No se ha encontrado ninguna mascota con ese nombre, pero tengo estas otras mascotas registradas: ");
            registro.mostrarMascotas();
        } else registro.buscarPorNombre(nombreBuscado).forEach(System.out::println);

        //Buscar mascotas por especie
        String especieBuscada = "Perro";
        System.out.println("\nMascotas registradas con la especie " + especieBuscada + ":");
        if (registro.buscarPorEspecie(especieBuscada).isEmpty()) {
            System.out.println("No se ha encontrado ninguna mascota con esa especie, pero tengo estas otras mascotas registradas: ");
            registro.mostrarMascotas();
        } else registro.buscarPorEspecie(especieBuscada).forEach(System.out::println);

        //Contar la cantidad total de mascotas registradas
        System.out.println("\nCantidad de mascotas registradas: " + registro.contarMascotas());

    }
}