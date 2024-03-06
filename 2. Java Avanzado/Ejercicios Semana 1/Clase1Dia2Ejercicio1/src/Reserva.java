public class Reserva {
    private String nombre;
    private String destino;
    private String fechaViaje;
    private int asientosElegidos;
    private int asientosDisponibles;

    public Reserva() {
    }

    public Reserva(String nombre, String destino, String fechaViaje, int asientosElegidos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosElegidos = asientosElegidos;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void ValidacionDatos() throws ReservaInvalidaException {
        //En función del dato que no hemos introducido solicitamos al usuario que lo introduzca controlando la excepcion
        if (this.nombre.equals("")) {
            throw new ReservaInvalidaException("La reserva está incompleta, falta introducir el nombre");
        } else if (this.destino.equals("")) {
            throw new ReservaInvalidaException("La reserva está incompleta, falta introducir el destino");
        }else if (this.fechaViaje.equals("")) {
            throw new ReservaInvalidaException("La reserva está incompleta, falta introducir la fecha de viaje");
        }else if (this.asientosElegidos<=0) {
            throw new ReservaInvalidaException("La reserva está incompleta, no ha introducido el número de asientos");
        }

    }

    public void reservarVuelo(int asientos, int asientosDisponibles) throws ReservaInvalidaException {
        //Si se introduce un número correcto de asientos se realiza la reserva y se actualiza el número de asientos disponibles para el vuelo
        this.asientosDisponibles=asientosDisponibles;
        if (this.asientosDisponibles < asientos) {
            throw new ReservaInvalidaException("Lo sentimos, no disponemos del número de asientos que solicita. Asientos disponibles: " + this.asientosDisponibles);
        }
        this.asientosDisponibles -= asientos;
    }
}
