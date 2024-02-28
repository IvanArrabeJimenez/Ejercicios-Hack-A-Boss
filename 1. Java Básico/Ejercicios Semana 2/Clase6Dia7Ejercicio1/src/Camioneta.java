import java.util.Calendar;

public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String recargarCombustible() {
        return "Está haciendo un repostaje de Combustible.";
    }

    @Override
    int antiguedad() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        return year - this.getAnio();
    }

    @Override
    public String toString() {
        return "Camioneta-> " +
                "id: " + this.getId() +
                ", placa: " + this.getPlaca() +
                ", marca: " + this.getMarca() +
                ", modelo: " + this.getModelo() +
                ", anio: " + this.getAnio() +
                ", costo: " + this.getCosto() +
                ", capacidadTanque: " + capacidadTanque + " L" +
                ", consumoCombustible: " + consumoCombustible + " L";
    }
}
