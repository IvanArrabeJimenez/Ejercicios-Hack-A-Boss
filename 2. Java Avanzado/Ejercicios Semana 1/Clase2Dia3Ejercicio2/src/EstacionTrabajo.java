public class EstacionTrabajo implements Runnable {
    private Fabrica fabrica;
    private String nombre;

    public EstacionTrabajo(Fabrica fabrica, String nombre) {
        this.fabrica = fabrica;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int aleatorioOperaciones = (int) (Math.random() * 3) + 1;
            if (aleatorioOperaciones == 1) {
                System.out.println(nombre + " Está ensamblando un producto...");
                fabrica.ensamblarProducto();
            } else if (aleatorioOperaciones == 2) {
                System.out.println(nombre + " Está realizando un control de calidad...");
                fabrica.controlCalidad();
            } else {
                System.out.println(nombre + " Está embalando un producto");
                fabrica.embalarProducto();
            }

        }

    }
}
