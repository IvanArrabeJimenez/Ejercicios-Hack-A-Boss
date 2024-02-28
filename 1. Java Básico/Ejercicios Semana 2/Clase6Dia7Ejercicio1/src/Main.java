import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Un sistema de gestión de vehículos necesita ser desarrollado para una futura implementación para una
        tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como
        interfaces para modelar este sistema.
        a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
        id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del
        vehiculo.
        b) Interfaces: Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia()
        y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases,
        deben mostrar un mensaje de qué tipo de recarga están haciendo.
        c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico.
        Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs).
         Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
         d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion.
         Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
         Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
         e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion.
         Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor.
         Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
         f) Main: En el programa principal, crea objetos de diferentes tipos de vehículos
         (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo
         Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la
         recarga de energía o combustible según corresponda.
         g) Polimorfismo: Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
         Nota: Recuerda que la antigüedad de unvehículo se calcula restando del año actual el año de fabricación del auto. Por ejemplo:
         2023 - 2018= 5 años de antigüedad*/

        //Creamos el ArrayList de vehiculos y le añadimos varios vehículos
        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Auto(1, "9586JPK", "Hyundai", "Ioniq", 2019, 35250, 7700, 550));
        vehiculos.add(new Camioneta(2, "7412LHC", "Ford", "Ranger", 2020, 56400, 80, 12.5));
        vehiculos.add(new Moto(3, "5478BCN", "Honda", "CBR1000", 2016, 15300, 1000, "4 tiempos"));
        vehiculos.add(new Auto(4, "6582HPQ", "Seat", "Mii", 2018, 36900, 6500, 480));

        //mostramos toda la información de los vehículos incluyendo la antigüedad y el tipo de recarga
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
            System.out.println("La antigüedad del vehículo es de " + vehiculo.antiguedad() + " años.");
            if (vehiculo instanceof Auto) {
                System.out.println(((Electrico) vehiculo).cargarEnergia() + "\n");
            } else System.out.println(((Combustion) vehiculo).recargarCombustible() + "\n");
        }


    }
}