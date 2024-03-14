public class Main {
    public static void main(String[] args) {
        /*Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos.
        Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase utilitaria
        InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
        Agregar Autos al Inventario: Utiliza un método genérico para agregar autos al inventario de la
        concesionaria.
        Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos por marca o año
        dentro del inventario.
        Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el valor total de
        todos los autos en el inventario.  */

        //Creamos el inventario de autos
        InventarioAutos inventarioAutos = new InventarioAutos();

        //Creamos los objetos Auto que vamos a introducir en el inventario
        Auto auto1 = new Auto("Seat", "Leon", 2020, 24300);
        Auto auto2 = new Auto("Honda", "Civic", 2019, 18000);
        Auto auto3 = new Auto("Toyota", "Yaris", 2021, 18000);
        Auto auto4 = new Auto("Volkswagen", "Golf", 2011, 15000);
        Auto auto5 = new Auto("Seat", "Ibiza", 2021, 19000);

        //Por medio del método agregar que hemos creado introducimos los autos en el inventario
        inventarioAutos.agregarAuto(auto1);
        inventarioAutos.agregarAuto(auto2);
        inventarioAutos.agregarAuto(auto3);
        inventarioAutos.agregarAuto(auto4);
        inventarioAutos.agregarAuto(auto5);

        //Buscar autos por marca
        String marca = "Seat";
        System.out.println("Estos son los autos registrados en el inventario de la marca " + marca + ":");
        inventarioAutos.buscarPorMarca(marca).forEach(System.out::println);

        //Buscar autos por año
        int anio = 2021;
        System.out.println("\nEstos son los autos registrados en el inventario del año " + anio + ":");
        inventarioAutos.buscarPorAnio(anio).forEach(System.out::println);

        //Calcular el valor total del inventario
        System.out.println("\nValor total del inventario:" + inventarioAutos.calcularValorTotalInventario() + "€");
    }
}