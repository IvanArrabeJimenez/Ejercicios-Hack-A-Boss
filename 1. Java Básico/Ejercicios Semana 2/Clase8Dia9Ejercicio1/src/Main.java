import java.sql.*;

/*Crear una aplicación para gestionar una lista de estudiantes en una base de datos. Los estudiantes tendrán atributos
como id, nombre, edad y calificación.El sistema debe ser capaz de permitir agregar nuevos estudiantes, recuperar la
lista de todos y mostrar su información.Crear una base de datos mediante MySQL llamada universidad y una tabla
llamada estudiantes cuyas columnas coincidan con los atributos de la clase estudiante.
Utilizar JDBC (Java Database Connectivity) para interactuar con la base de datos.*/
public class Main {
    public static void main(String[] args) {

        //Declaramos la url y usuario y contraseña para acceder a la BBDD
        String url = "jdbc:mysql://localhost:3306/universidad";
        String usuario = "root";
        String contraseña = "root";

        //Realizamos la conexión a la base de datos
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión Establecida!!");

            //Creamos los estudiantes que vamos a insertar
            Estudiante estudiante1 = new Estudiante(1, "Juan", 15, 8.7);
            Estudiante estudiante2 = new Estudiante(2, "Raquel", 14, 7.9);
            Estudiante estudiante3 = new Estudiante(3, "Pedro", 16, 6.4);
            Estudiante estudiante4 = new Estudiante(4, "Lucía", 15, 9.2);

            //insertamos los datos en la tabla de la BBDD
            String insertSql = "INSERT INTO estudiantes (id, nombre, edad, calificación) VALUES (?, ?, ?, ?)";

            //Declaramos el statement
            PreparedStatement statement = conexion.prepareStatement(insertSql);

            //Obtenemos los datos de los estudiantes
            statement.setInt(1, estudiante1.getId());
            statement.setString(2, estudiante1.getNombre());
            statement.setInt(3, estudiante1.getEdad());
            statement.setDouble(4, estudiante1.getCalificacion());
            //Ejecutamos la sentencia
            statement.executeUpdate();

            statement.setInt(1, estudiante2.getId());
            statement.setString(2, estudiante2.getNombre());
            statement.setInt(3, estudiante2.getEdad());
            statement.setDouble(4, estudiante2.getCalificacion());
            statement.executeUpdate();

            statement.setInt(1, estudiante3.getId());
            statement.setString(2, estudiante3.getNombre());
            statement.setInt(3, estudiante3.getEdad());
            statement.setDouble(4, estudiante3.getCalificacion());
            statement.executeUpdate();

            statement.setInt(1, estudiante4.getId());
            statement.setString(2, estudiante4.getNombre());
            statement.setInt(3, estudiante4.getEdad());
            statement.setDouble(4, estudiante4.getCalificacion());
            statement.executeUpdate();

            //Mostramos un mensaje para comunicar que los estudiantes se han insertado correctamente en la tabla
            System.out.println("Los estudiantes han sido registrados en la base de datos correctamente!!");

            //Comprobamos que los resultados se han insertado y los mostramos en consola
            String selectSql = "SELECT * FROM estudiantes";

            //Creamos una sentencia para consultar los datos y mostrarlos en consola
            Statement s = conexion.createStatement();
            ResultSet rs = s.executeQuery(selectSql);
            while (rs.next()) {

                System.out.println("ID: " + rs.getInt(1) + ", Nombre: " + rs.getString(2) + ", Edad: " + rs.getInt(3) + ", Calificación: " + rs.getDouble(4));
            }

            //Probamos a borrar un registro
            String borradoSql = "DELETE FROM estudiantes WHERE id=2;";
            s.execute(borradoSql);

            //Mostramos de nuevo la tabla de estudiantes para comprobar que el registro eliminado ya no existe
            System.out.println("\nTABLA DE ESTUDIANTES DESPUÉS DE LAS MODIFICACIONES\n");
            rs = s.executeQuery(selectSql);
            while (rs.next()) {

                System.out.println("ID: " + rs.getInt(1) + ", Nombre: " + rs.getString(2) + ", Edad: " + rs.getInt(3) + ", Calificación: " + rs.getDouble(4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}