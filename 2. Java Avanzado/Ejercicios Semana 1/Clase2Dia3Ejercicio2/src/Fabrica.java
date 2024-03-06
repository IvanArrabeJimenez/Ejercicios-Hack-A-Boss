public class Fabrica {
    private int ensamblarProducto;
    private int controlCalidad;
    private int embalarProducto;

    public Fabrica() {
    }

    public int getEnsamblarProducto() {
        return ensamblarProducto;
    }

    public int getControlCalidad() {
        return controlCalidad;
    }

    public int getEmbalarProducto() {
        return embalarProducto;
    }

    public synchronized void ensamblarProducto() {
        ensamblarProducto++;
    }

    public synchronized void controlCalidad() {
        controlCalidad++;
    }

    public synchronized void embalarProducto() {
        embalarProducto++;
    }
}
