import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre, un salario
        y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente"). Implementa las siguientes
        operaciones utilizando Streams y Optionals:
        1.Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        2.Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        3.Encuentra al empleado con el salario más alto utilizando Optionals.*/

        List<Empleado> empleados = Arrays.asList(new Empleado("Juan", 1500.00, "Desarrollador"),
                new Empleado("Antonio", 1200.00, "Analista"), new Empleado("Luisa", 1300.00, "Desarrollador"),
                new Empleado("Pedro", 3000.00, "Gerente"), new Empleado("Francisco", 1250.00, "Analista"),
                new Empleado("Juan", 1400.00, "Desarrollador"));

        //Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        double salario = 1350.00;
        List<Empleado> filtradoSalario = empleados.stream()
                .filter(e -> e.getSalario() > salario)
                .toList();
        //Mostramos los empleados que tienen ese salario superior
        System.out.println("Empleados con salario mayor a " + salario + "€:");
        filtradoSalario.forEach(e -> System.out.println(e.getNombre() + ", salario: " + e.getSalario() + "€"));

        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> promedioSalarioCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));
        //Mostramos el salario medio por categoria
        System.out.println("\nPromedio de salarios por categoría:");
        promedioSalarioCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria + ": " + salarioPromedio + "€"));

        //Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoSalarioMáximo = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        //Mostramos el empleado con el salario máximo
        empleadoSalarioMáximo.ifPresent(e -> System.out.println("\nEl empleado con el salario más alto es: " + e.getNombre() + " con " + e.getSalario() + "€"));
    }
}