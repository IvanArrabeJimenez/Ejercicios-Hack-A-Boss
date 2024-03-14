import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*Imagina que estás construyendo una aplicación para gestionar eventos en una agenda.
        Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", "Taller").
        Implementa las siguientes operaciones utilizando Streams y Optionals:
        1.Filtra los eventos que están programados para una fecha específica.
        2.Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        3.Encuentra el evento más próximo en el tiempo utilizando Optionals.  */

        //Creamos la lista de eventos
        List<Evento> eventos = Arrays.asList(new Evento("Junta Accionistas", LocalDate.of(2024, 02, 24), "Reunión"),
                new Evento("Metodologias", LocalDate.of(2024, 03, 20), "Taller"),
                new Evento("Charla Nuevas Técnicas", LocalDate.of(2024, 02, 15), "Conferencia"),
                new Evento("Daily", LocalDate.of(2024, 03, 05), "Reunión"),
                new Evento("Charla Empresas Punteras", LocalDate.of(2024, 03, 10), "Conferencia"),
                new Evento("Convivencias y trabajo en equipo", LocalDate.of(2024, 02, 15), "Taller"));

        // Filtrar eventos programados para una fecha específica
        LocalDate fechaEspecífica = LocalDate.of(2024, 02, 15);
        List<Evento> eventosFechaEspecifica = eventos.stream()
                .filter(e -> e.getFecha().equals(fechaEspecífica))
                .toList();
        System.out.println("Eventos programados para el " + fechaEspecífica + ":");
        eventosFechaEspecifica.forEach(e -> System.out.println(e.toString()));

        //Agrupar eventos por categoría y contar cuántos eventos hay en cada categoría
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("\nCantidad de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad));

        //Encontrar el evento más próximo en el tiempo utilizando Optionals
        LocalDate fechaActual = LocalDate.now();
        Optional<Evento> eventoMasProximo = eventos.stream()
                .filter(e -> e.getFecha().isAfter(fechaActual))
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        eventoMasProximo.ifPresent(evento ->
                System.out.println("\nEvento más próximo: " + evento.getNombre() +
                        " - " + evento.getFecha()));
    }
}