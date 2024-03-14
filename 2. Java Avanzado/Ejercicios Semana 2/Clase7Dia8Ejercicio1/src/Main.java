public class Main {
    public static void main(String[] args) {
        /*Crea un programa que simule la exploración recursiva de directorios en el sistema de archivos de un
        sistema operativo utilizando una estructura de datos propia.
        Emplea una estructura donde cada nodo representa un directorio y contiene referencias a sus subdirectorios.

El programa debe realizar una exploración simulada para mostrar la jerarquía de directorios y archivos.*/
        //Creamos el menú Principal
        Directorio raiz = new Directorio(1, "C:/");

        //Creamos los subdirectorios
        Directorio documentos = new Directorio(2, "Documentos/");
        Directorio descargas = new Directorio(2, "Descargas/");
        Directorio imagenes = new Directorio(2, "Imagenes/");
        Directorio usuarios = new Directorio(2, "Usuarios/");

        //Agregamos los directorios al directorio raíz y a su vez introducimos varios archivos en cada directorio
        raiz.agregarDirectorio(documentos);
        documentos.agregarArchivo("documento1.txt");
        documentos.agregarArchivo("documento2.txt");
        raiz.agregarDirectorio(descargas);
        descargas.agregarArchivo("descarga1.txt");
        descargas.agregarArchivo("descarga2.png");
        descargas.agregarArchivo("descarga3.zip");
        descargas.agregarArchivo("descarga4.exe");
        raiz.agregarDirectorio(imagenes);
        imagenes.agregarArchivo("imagen1.png");
        imagenes.agregarArchivo("imagen2.png");
        imagenes.agregarArchivo("imagen3.png");
        raiz.agregarDirectorio(usuarios);
        usuarios.agregarArchivo("Usuario Principal");

        //Una vez que tenemos todos los directorios y archivos creados procedemos a visualizarlo
        mostrarEstructura(raiz, 0);
    }

    private static void mostrarEstructura(Directorio directorio, int nivel) {
        //Con esta estructura le damos forma de arbol
        String tabulacion = "";
        for (int i = 0; i < nivel; i++) {
            tabulacion += "\t";
        }
        System.out.println(tabulacion + directorio.getNombre());
        for (Directorio subdirectorio : directorio.getDirectorios()) {
            mostrarEstructura(subdirectorio, nivel + 1);
        }
        for (String archivo : directorio.getArchivos()) {
            System.out.println(tabulacion + tabulacion + archivo);
        }
    }
}