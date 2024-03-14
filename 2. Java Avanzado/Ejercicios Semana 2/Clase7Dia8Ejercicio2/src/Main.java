public class Main {
    public static void main(String[] args) {
        /*Desarrolla una aplicación para organizar tareas en un proyecto. Utiliza la recursividad para crear
        una estructura jerárquica de tareas. Cada tarea puede tener subtareas asociadas, y estas subtareas también
        pueden tener sus propias subtareas, creando así una estructura de "árbol de tareas".
        El programa debe permitir al usuario agregar tareas principales y subtareas de manera recursiva.
        Además, debe ofrecer la capacidad de visualizar la estructura completa de tareas con sus respectivas
        subtareas.*/

        //Creamos el proyecto
        Tarea proyecto = new Tarea(1, "Proyecto: Desarrollo de Software");

        //Creamos las tareas principales
        Tarea principal1 = new Tarea(2, "Tarea Principal: Diseño de la Aplicación");
        Tarea principal2 = new Tarea(3, "Tarea Principal: Implementación del código");
        Tarea principal3 = new Tarea(4, "Tarea Principal: Pruebas y depuración");

        //Agregamos las tareas principales al proyecto
        proyecto.agregarTarea(principal1);
        proyecto.agregarTarea(principal2);
        proyecto.agregarTarea(principal3);

        //Creamos las sub tareas
        Tarea subtarea1 = new Tarea(5, "Subtarea: Crear Prototipo");
        Tarea subtarea2 = new Tarea(6, "Subtarea: Diseñar Interfaz");
        Tarea subtarea3 = new Tarea(7, "Subtarea: Documentar Requisitos");
        Tarea subtarea4 = new Tarea(8, "Subtarea: Desarrollar Backend");
        Tarea subtarea5 = new Tarea(9, "Subtarea: Desarrollar Frontend");
        Tarea subtarea6 = new Tarea(10, "Subtarea: Ejecutar pruebas de Integración");
        Tarea subtarea7 = new Tarea(11, "Subtarea: solucionar Errores");

        //Las añadimos a las tareas principales
        principal1.agregarTarea(subtarea1);
        principal1.agregarTarea(subtarea2);
        principal1.agregarTarea(subtarea3);
        principal2.agregarTarea(subtarea4);
        principal2.agregarTarea(subtarea5);
        principal3.agregarTarea(subtarea6);
        principal3.agregarTarea(subtarea7);

        //Creamos las sub-subtareas
        Tarea subSubtarea1 = new Tarea(12, "Sub-subtarea: Definir Esquema de Colores");
        Tarea subSubtarea2 = new Tarea(13, "Sub-subtarea: Diseñar Diseño Responsivo");
        Tarea subSubtarea3 = new Tarea(14, "Sub-subtarea: Configurar Base de Datos");
        Tarea subSubtarea4 = new Tarea(15, "Sub-subtarea: Crear Lógica de Negocios");
        Tarea subSubtarea5 = new Tarea(16, "Sub-subtarea: Codificar Interfaz de Ususario");
        Tarea subSubtarea6 = new Tarea(17, "Sub-subtarea: Integrar con Backend");

        //Las añadimos a las subtareas
        subtarea2.agregarTarea(subSubtarea1);
        subtarea2.agregarTarea(subSubtarea2);
        subtarea4.agregarTarea(subSubtarea3);
        subtarea4.agregarTarea(subSubtarea4);
        subtarea5.agregarTarea(subSubtarea5);
        subtarea5.agregarTarea(subSubtarea6);

        //Una vez que están todas las tareas introducidas procedemos a visualizarlas
        mostrarEstructuraTareas(proyecto, 0);
    }

    private static void mostrarEstructuraTareas(Tarea proyecto, int nivel) {
        //No soy capaz de mostrar el dibujo como en el ejemplo pero tabulandolo tiene la misma forma
        String ascii = "";
        for (int i = 0; i < nivel; i++) {
            ascii += "\t";
        }
        System.out.println(ascii + proyecto.getDescripcion());
        for (Tarea tarea : proyecto.getListaTareas()) {
            mostrarEstructuraTareas(tarea, nivel + 1);
        }
    }
}