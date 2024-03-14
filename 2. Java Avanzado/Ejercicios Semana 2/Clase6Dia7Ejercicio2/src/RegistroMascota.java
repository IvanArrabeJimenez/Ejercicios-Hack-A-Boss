import java.util.ArrayList;
import java.util.List;

public class RegistroMascota {
    private List<Mascota> mascotaList;

    public RegistroMascota() {
        this.mascotaList = new ArrayList<>();
    }

    void agregarMascota(Mascota mascota) {
        mascotaList.add(mascota);
    }

    public List<Mascota> buscarPorNombre(String nombreBuscado) {
        return mascotaList.stream()
                .filter(m -> m.getNombre().equals(nombreBuscado))
                .toList();
    }

    public List<Mascota> buscarPorEspecie(String especieBuscada) {
        return mascotaList.stream()
                .filter(m -> m.getEspecie().equals(especieBuscada))
                .toList();
    }

    public void mostrarMascotas() {
        for (Mascota mascota : mascotaList) {
            System.out.println(mascota.toString());
        }
    }

    public int contarMascotas() {
        return mascotaList.size();
    }
}
