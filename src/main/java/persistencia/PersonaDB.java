package persistencia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import logica.Persona;

public class PersonaDB {
    // Método que retorna una lista de personas según el tipo de base de datos
    public List<Persona> obtenerListaPersonas(String tipoDB) {
        // Crear la lista de personas
        List<Persona> listaPersonas = new ArrayList<>();

        // Datos de Persona 1
        Persona persona1 = new Persona(
            "1234567890101",            // dpi
            "Juan",                     // nombre1
            "Carlos",                   // nombre2
            "Pérez",                    // apellido1
            "Gómez",                    // apellido2
            "Calle 10, Zona 1, Ciudad", // direccionDomicilio
            22558877,                   // telefonoDomicilio
            55556666,                   // telefonoMovil
            new BigDecimal("3500.50"),  // salarioBase
            new BigDecimal("500.25")    // bonificacion
        );

        // Datos de Persona 2
        Persona persona2 = new Persona(
            "9876543210123",            // dpi
            "María",                    // nombre1
            "Luisa",                    // nombre2
            "Ramírez",                  // apellido1
            "López",                    // apellido2
            "Avenida Principal, Zona 5",// direccionDomicilio
            22334455,                   // telefonoDomicilio
            55667788,                   // telefonoMovil
            new BigDecimal("4200.75"),  // salarioBase
            new BigDecimal("600.50")    // bonificacion
        );

        // Agregar personas a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);

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
}
