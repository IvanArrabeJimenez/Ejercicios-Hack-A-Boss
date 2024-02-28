import java.util.Calendar;

public class Auto extends Vehiculo implements Electrico {
    private double capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public String cargarEnergia() {
        return "Está haciendo una recarga Eléctrica.";
    }

    @Override
    int antiguedad() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year - this.getAnio();
    }

    @Override
    public String toString() {
        return "Auto-> " +
                "id: " + this.getId() +
                ", placa: " + this.getPlaca() +
                ", marca: " + this.getMarca() +
                ", modelo: " + this.getModelo() +
                ", anio: " + this.getAnio() +
                ", costo: " + this.getCosto() +
                ", capacidadBateria: " + capacidadBateria + " mah" +
                ", autonomia: " + autonomia + " hrs";
    }
}
