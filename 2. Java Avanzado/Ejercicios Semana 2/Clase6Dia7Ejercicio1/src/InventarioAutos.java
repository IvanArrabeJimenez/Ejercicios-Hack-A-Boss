import java.util.ArrayList;
import java.util.List;

public class InventarioAutos {
    private List inventario;

    public InventarioAutos() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(Auto auto) {
        inventario.add(auto);
    }

    public List<Auto> buscarPorMarca(String marca) {
        return inventario.stream()
                .filter(a -> ((Auto) a).getMarca().equals(marca))
                .toList();
    }

    public List<Auto> buscarPorAnio(int anio) {
        return inventario.stream()
                .filter(a -> ((Auto) a).getAnio() == anio)
                .toList();
    }

    public double calcularValorTotalInventario() {
        return inventario.stream()
                .mapToDouble(a -> ((Auto) a).getPrecio())
                .sum();
    }
}
