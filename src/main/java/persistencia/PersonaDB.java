package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import logica.Persona;

public class PersonaDB {
    // Método que retorna una lista de personas según el tipo de base de datos
     public List<Persona> obtenerListaPersonas(String tipoDB) {
        // Crear la lista de personas
        List<Persona> listaPersonas = new ArrayList<>();

        // Datos de Persona 1
        String query = "select * from empleado";
        tipoDB = "postgre";
        
        try (Connection connection = validarConexion(tipoDB);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                
                Persona persona = new Persona(
                    resultSet.getInt("dpi"),            // dpi
                    resultSet.getString("primer_nombre"),                    // nombre1
                    resultSet.getString("segundo_nombre"),                   // nombre2
                    resultSet.getString("primer_apellido"),                    // apellido1
                    resultSet.getString("segundo_apellido"),                    // apellido2
                    resultSet.getString("direccion"), // direccionDomicilio
                    resultSet.getString("telefono_casa"),                   // telefonoDomicilio
                    resultSet.getString("telefono_movil"),                   // telefonoMovil
                    resultSet.getBigDecimal("salario_base"),  // salarioBase
                    resultSet.getBigDecimal("bonificacion")   // bonificacion
                );
                listaPersonas.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        // Retornar la lista de personas
        return listaPersonas;
    }
    
    // Método que guarda en DB una persona y guarda en documento
    public boolean crearPersona (Persona persona, String tipoDB){
        // Aquí se pueden guardar datos en DB y Documento
        return true;
    }
    
    // Método que actualiza en DB una persona y guarda en documento
    public boolean atualizarPersona (Persona persona, String tipoDB){
        // Aquí se pueden guardar datos en DB y Documento
        return true;
    }
    
    // Método que elimina en DB una persona y guarda en documento
    public boolean eliminarPersona (Persona persona, String tipoDB){
        // Aquí se pueden guardar datos en DB y Documento
        return true;
    }
    
    // Método que sincroniza las 2 DB y guarda en documento los cambios
    public boolean sincronizar2DB (List<Persona> personas){
        // Aquí se pueden comparar y actualizar los datos en DB
        return true;
    }    
    
    public Connection validarConexion(String DB) throws SQLException{
        if(DB.equals("postgre")){
            return ConectorPostgre.getConnection();
        }else{
            return ConectorMySQL.getConnection();
        }
    }
    
    public static void agregarTransaccion(String transaccion) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("bitacora.txt", true))) {
            // Obtener la fecha y hora actuales para el registro
            String fechaHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            
            // Escribir la transacción en el archivo
            escritor.write(transaccion + " | " + fechaHora);
            escritor.newLine(); // Escribir una nueva línea para la próxima transacción
            
        } catch (IOException e) {
            System.err.println("Error al escribir en la bitácora: " + e.getMessage());
        }
    }
    
    public static List<String> leerTransacciones() {
        List<String> transacciones = new ArrayList<>();

        try (BufferedReader lector = new BufferedReader(new FileReader("bitacora.txt"))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                transacciones.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de bitácora: " + e.getMessage());
        }

        return transacciones;
    }
    
    public static void editarTransaccion(int indice, String nuevaTransaccion) {
        List<String> transacciones = leerTransacciones();

        if (indice >= 0 && indice < transacciones.size()) {
            // Modificar la transacción en el índice dado
            transacciones.set(indice, nuevaTransaccion);

            // Sobrescribir el archivo con la lista actualizada
            escribirTransacciones(transacciones);
        } else {
            System.out.println("El índice proporcionado está fuera de rango.");
        }
    }
    
    public static void escribirTransacciones(List<String> transacciones) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("bitacora.txt"))) {
            for (String transaccion : transacciones) {
                escritor.write(transaccion);
                escritor.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en la bitácora: " + e.getMessage());
        }
    }
    
    public static String validarTraslado(String cadena, char nuevoCaracter) {
        // Verifica que la cadena no esté vacía
        if (cadena == null || cadena.isEmpty()) {
            return cadena;
        }

        // Crea la nueva cadena con el primer carácter reemplazado
        return nuevoCaracter + cadena.substring(1);
    }
}
