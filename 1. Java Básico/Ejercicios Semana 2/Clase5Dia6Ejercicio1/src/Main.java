public class Main {
    public static void main(String[] args) {

        /*Crear una clase "Animal" con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación
        (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que
        emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:
        a) Crear sus clases hijas que compartan sus atributos y métodos:
        "Mamífero" con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
        "Ave" con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
        "Reptil" con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
        b)  Una vez creadas las clases, crear los siguientes métodos:
        "Mamífero": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
        "Ave": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
        "Reptil": sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
        c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.
        d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto?
        ¿Se aplica alguna propiedad para esto?
        E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde
        el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?*/

        Mamifero mamifero1 = new Mamifero(1, "perro", 3, "Pelo corto", "Carnívoro", 4, "Sexual", "Marrón", "Casa");
        Ave ave1 = new Ave(2, "cuervo", 4, "Plumas", "Omnivoro", 45.50, "Aleteo con planeos", "Negro", "Ligeramente curvado");
        Reptil reptil1 = new Reptil(3, "Serpiente de cascabel", 2, "Escamas", "Carnívoro", 54.76, "laminas", "Neurotóxico", "América");

        //Llamada a los métodos saludar de cada objeto
        mamifero1.saludar();
        ave1.saludar();
        reptil1.saludar();

        //Crear un objeto de tipo animal e intentar asignarle al Mamifero creado… ¿Qué sucede? ¿Es posible hacer esto?
        //¿Se aplica alguna propiedad para esto?
        Animal animal1 = mamifero1;
        System.out.println(mamifero1);
        System.out.println(animal1);
        /*Como se trata de un caso de herencia si es posible asignar el mamífero a la clase animal, pero nos lo
        recononce como mamífero, por tanto nos muestra las propiedades y accede a los métodos del mamífero
        y no de la clase animal.*/

        /*Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde
        el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?

        No es posible hacer esto ya que al ser métodos privados no tenenmos acceso a ellos y por tanto no
        los podemos utilizar*/
    }
}