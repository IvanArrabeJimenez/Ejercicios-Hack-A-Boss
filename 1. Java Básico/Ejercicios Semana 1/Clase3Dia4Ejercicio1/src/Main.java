public class Main {
    public static void main(String[] args) {
        /*Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y variables
        no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
        Luego, realiza las siguientes acciones:
        a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con
        parámetros.
        d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?*/

        //Creamos 3 objetos de la clase Electrodoméstico con parámetros
        Electrodomestico electrodomestico1 = new Electrodomestico(123481, "Balay", "3KFC869BI", "C", "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(123481, "Teka", "RMF 77960 SS EU", "B", "Metal");
        Electrodomestico electrodomestico3 = new Electrodomestico(123481, "Zanussi", "ZNME36EU0", "E", "Negro");

        //Creamos 1 objeto de la clase Electrodoméstico sin parámetros
        Electrodomestico electrodomestico4 = new Electrodomestico();

        //Mostramos por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        System.out.println("Marca del electrodoméstico: "+electrodomestico1.getMarca()+", modelo: "+electrodomestico1.getModelo()+", consumo energético: "+electrodomestico1.getConsumo());
        System.out.println("Marca del electrodoméstico: "+electrodomestico2.getMarca()+", modelo: "+electrodomestico2.getModelo()+", consumo energético: "+electrodomestico2.getConsumo());
        System.out.println("Marca del electrodoméstico: "+electrodomestico3.getMarca()+", modelo: "+electrodomestico3.getModelo()+", consumo energético: "+electrodomestico3.getConsumo());

        //Intentamos obtener la marca del electrodoméstico creado sin parámetros
        System.out.println("Marca del electrodoméstico: "+electrodomestico4.getMarca());
        //Al crearlo con el constructor vacío nos muestra el resultado de "null", ya que no le hemos indicado ningún valor al atributo "marca"
    }
}