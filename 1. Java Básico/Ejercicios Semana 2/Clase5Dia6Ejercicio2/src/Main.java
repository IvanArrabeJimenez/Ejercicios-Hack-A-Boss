public class Main {
    public static void main(String[] args) {
        /*Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color
        (con sus métodos y constructores correspondientes).
        a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
        Zapato: material, tipoCierre
        Pantalon: estilo, tipoTejido
        Camiseta: manga, cuello
        Sombrero: tipo, tamaño
        b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos,
         3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
         c) Crear los siguientes métodos (en cada subclase correspondiente):
         Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
         Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: "
         (mostrar estilo).
         Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
         Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
         d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
         PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran.
         Tener en cuenta para esto la implementación de herencia y sobrescritura de métodos.*/

        //Creamos el vector y lo llenamos
        Vestimenta[] vestimentas = new Vestimenta[9];

        vestimentas[0] = new Zapato(1, "Oxford", 120.50, "Boss", "43.5", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Monk", 90.90, "Massimo Duty", "45.5", "Marron", "Piel", "Correa con hebillas");
        vestimentas[2] = new Zapato(3, "Náuticos", 70.80, "Carrington shoes", "42", "Marron", "Cuero", "Cordones");
        vestimentas[3] = new Pantalon(4, "Vaqueros", 140.60, "Levi's", "L", "Azul", "Vaqueros", "Denim");
        vestimentas[4] = new Pantalon(5, "Chinos", 120.70, "Zara", "XL", "Beige", "Chinos", "Smart 360 Flex");
        vestimentas[5] = new Pantalon(6, "Chándal", 60.50, "Adidas", "L", "Negro", "Deportivo", "Poliéster");
        vestimentas[6] = new Camiseta(7, "Camiseta", 35.20, "Nike", "L", "Blanco", "Corta", "Pico");
        vestimentas[7] = new Camiseta(8, "Camiseta", 40.30, "Adidas", "L", "Verde", "Larga", "Redondo");
        vestimentas[8] = new Sombrero(9, "Bombín", 80.00, "Borges & Scott", "55", "Negro", "Bombín", "Grande");

        //Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.

        for (int i = 0; i < vestimentas.length; i++) {
            System.out.println(vestimentas[i].Mostrar());
        }
    }
}