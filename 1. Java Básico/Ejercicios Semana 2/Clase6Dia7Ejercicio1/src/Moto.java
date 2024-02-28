import java.util.Calendar;

public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
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
        return "Moto-> " +
                "id: " + this.getId() +
                ", placa: " + this.getPlaca() +
                ", marca: " + this.getMarca() +
                ", modelo: " + this.getModelo() +
                ", anio: " + this.getAnio() +
                ", costo: " + this.getCosto() +
                ", cilindrada: " + cilindrada + " cc" +
                ", tipoMotor: " + tipoMotor;
    }
}
