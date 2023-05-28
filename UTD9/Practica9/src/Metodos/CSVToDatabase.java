package Metodos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class CSVToDatabase {
    public static void CSVToDatabase() {
        System.out.println("Escriba la ruta de su base de datos:");
        Scanner export1 = new Scanner(System.in);
        String rutaDatabase = export1.nextLine();

        System.out.println("Escriba la ruta del archivo:");
        Scanner export2 = new Scanner(System.in);
        String nombreTabla = export1.nextLine();

        try (Connection connection = DriverManager.getConnection(rutaDatabase);
             BufferedReader br = new BufferedReader(new FileReader(nombreTabla))) {

            String line;
            String insertQuery = "INSERT INTO alumnos (nombre, intervenciones, fecha_intervencion) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = connection.prepareStatement(insertQuery);

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String nombre = data[0];
                String intervenciones = data[1];
                String fecha_intervencion = data[2];

                insertStatement.setString(1, nombre);
                insertStatement.setString(2, intervenciones);
                insertStatement.setString(3, fecha_intervencion);
                insertStatement.executeUpdate();
            }

            System.out.println("Datos insertados correctamente en la base de datos.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
