public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*• Crea una simulación de una cadena de producción en una fábrica en la que varios trabajadores pueden
        realizar tareas concurrentemente.
        • Cada trabajador se representa como un hilo independiente.
        • Los trabajadores deben llevar a cabo tareas como ensamblar productos, realizar controles de calidad y
        embalar productos.
        • Utiliza hilos para simular la ejecución concurrente de estas tareas en diferentes estaciones de
        trabajo de la fábrica.
        • Asegúrate de controlar la concurrencia para evitar problemas como la sobreproducción o la falta de
        coordinación entre las tareas.*/

        Fabrica fabrica = new Fabrica();

        Thread estacion1 =new Thread(new EstacionTrabajo(fabrica,"Pedro"));
        estacion1.start();
        estacion1.join();
        Thread estacion2 =new Thread(new EstacionTrabajo(fabrica,"Julia"));
        estacion2.start();
        estacion2.join();
        Thread estacion3 =new Thread(new EstacionTrabajo(fabrica,"Raquel"));
        estacion3.start();
        estacion3.join();
        Thread estacion4 =new Thread(new EstacionTrabajo(fabrica,"Manuel"));
        estacion4.start();
        estacion4.join();
        Thread estacion5 =new Thread(new EstacionTrabajo(fabrica,"Antonio"));
        estacion5.start();
        estacion5.join();
        
        System.out.println("Total productos ensamblados: "+ fabrica.getEnsamblarProducto());
        System.out.println("Total controles realizados: "+ fabrica.getControlCalidad());
        System.out.println("Total productos embalados: "+ fabrica.getEmbalarProducto());
    }
}