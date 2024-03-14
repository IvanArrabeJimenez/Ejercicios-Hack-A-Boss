import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creamos la lista de coches
        List<Vehiculo> vehiculos = Arrays.asList(new Vehiculo("Ford", "Fiesta", 1000),
                new Vehiculo("Ford", "Focus", 1200),
                new Vehiculo("Ford", "Explorer", 2500),
                new Vehiculo("Fiat", "Uno", 500),
                new Vehiculo("Fiat", "Cronos", 1000),
                new Vehiculo("Fiat", "Torino", 1250),
                new Vehiculo("Chevrolet", "Aveo", 1250),
                new Vehiculo("Chevrolet", "Spin", 2500),
                new Vehiculo("Toyota", "Corolla", 1200),
                new Vehiculo("Toyota", "Fortuner", 3000),
                new Vehiculo("Renault", "Logan", 950));

        //Ordenamos la lista por precio de menor a mayor
        List<Vehiculo> vehiculosOrdenadosPrecio = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio))
                .toList();
        System.out.println("---Lista de vehículos ordenados de menor a mayor precio---");
        vehiculosOrdenadosPrecio.forEach(System.out::println);

        //De la misma forma anterior imprime una lista ordenada por marca y a su vez por precio.
        List<Vehiculo> vehiculosOrdenadosMarcaPrecio = vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getMarca).thenComparing(Vehiculo::getPrecio))
                .toList();
        System.out.println("\n---Lista de vehículos ordenados por su marca y luego por su precio---");
        vehiculosOrdenadosMarcaPrecio.forEach(System.out::println);

        // Se desea extraer una lista de vehículos con precio no mayor a 1000, luego otra con precios mayor o igual
        // 1000 y por último, obtén el promedio total de precios de toda la lista de vehículos.
        System.out.println("\n---Lista de vehículos con precio no mayor a 1000€---");
        List<Vehiculo> vehiculosMenos1000 = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() < 1000)
                .toList();
        vehiculosMenos1000.forEach(System.out::println);

        System.out.println("\n---Lista de vehículos con precio mayor o igual a 1000€---");
        List<Vehiculo> vehiculos1000Mas = vehiculos.stream()
                .filter(vehiculo -> vehiculo.getPrecio() >= 1000)
                .toList();
        vehiculos1000Mas.forEach(System.out::println);

        //Calculo del promedio total de la lista de vehículos
        double promedio = vehiculos.stream()
                .mapToDouble(Vehiculo::getPrecio)
                .average()
                .orElse(0.0);
        System.out.println("\nEl precio promedio de la lista de vehículos es: " + Math.round(promedio * 100.0) / 100.0 + "€");
    }
}