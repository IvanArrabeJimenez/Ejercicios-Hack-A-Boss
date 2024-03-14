import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private int id;
    private String descripcion;
    private List<Tarea> listaTareas;

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.listaTareas = new ArrayList<>();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public List<Tarea> getListaTareas() {
        return listaTareas;
    }

    public void agregarTarea(Tarea tarea) {
        listaTareas.add(tarea);
    }
}
