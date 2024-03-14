import java.util.ArrayList;
import java.util.List;

public class Directorio {
    private int id;
    private String nombre;
    private List<Directorio> directorios;
    private List<String> archivos;

    public Directorio(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.directorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getDirectorios() {
        return directorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void agregarDirectorio(Directorio directorio) {
        directorios.add(directorio);
    }

    public void agregarArchivo(String archivo) {
        archivos.add(archivo);
    }

}
