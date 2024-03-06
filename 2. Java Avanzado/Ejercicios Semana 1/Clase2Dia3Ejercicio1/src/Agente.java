public class Agente extends Thread {

    private String nombre;
    private int llamadaRecibida;
    private int consultaResuelta;
    private int registroInformacion;

    public Agente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLlamadaRecibida() {
        return llamadaRecibida;
    }

    public int getConsultaResuelta() {
        return consultaResuelta;
    }

    public int getRegistroInformacion() {
        return registroInformacion;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            //Mediante un número aleatorio entre 1 y 3 generamos las diferentes operaciones que está realizando cada agente
            int aleatorioOperaciones = (int) (Math.random() * 3) + 1;
            switch (aleatorioOperaciones) {
                case 1:
                    atenderLlamada();
                    break;
                case 2:
                    resolverConsulta();
                    break;
                case 3:
                    registrarInformacion();
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + aleatorioOperaciones);
            }
        }
        System.out.println("Total de registros hechos por "+this.nombre+": "+this.registroInformacion);
        System.out.println("Total de consultas resueltas por "+this.nombre+": "+this.consultaResuelta);
        System.out.println("Total de llamadas recibidas por "+this.nombre+": "+this.llamadaRecibida);
    }

    private synchronized void registrarInformacion() {
        System.out.println("El agente "+this.nombre+" está registrando información");
        this.registroInformacion++;
    }

    private synchronized void resolverConsulta() {
        System.out.println("El agente "+this.nombre+" está resolviendo una consulta");
        this.consultaResuelta++;
    }

    private synchronized void atenderLlamada() {
        System.out.println("El agente "+this.nombre+" está atendiendo una llamada");
        this.llamadaRecibida++;
    }
}
