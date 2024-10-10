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
        
        // Datos de Persona 3
        Persona persona3 = new Persona(
            "1234567890123",            // dpi
            "Carlos",                   // nombre1
            "Andrés",                   // nombre2
            "Pérez",                    // apellido1
            "García",                   // apellido2
            "Calle 4, Zona 1",          // direccionDomicilio
            24446677,                   // telefonoDomicilio
            55443322,                   // telefonoMovil
            new BigDecimal("3500.00"),  // salarioBase
            new BigDecimal("500.00")    // bonificacion
        );
        
        // Datos de Persona 4
        Persona persona4 = new Persona(
            "1496033598266",            // dpi
            "Ana",                      // nombre1
            "Gabriela",                 // nombre2
            "Martínez",                 // apellido1
            "Rodríguez",                // apellido2
            "Calle Los Almendros, Zona 7", // direccionDomicilio
            23334455,                   // telefonoDomicilio
            55660099,                   // telefonoMovil
            new BigDecimal("3800.25"),  // salarioBase
            new BigDecimal("650.75")    // bonificacion
        );    
        
        // Datos de Persona 5
        Persona persona5 = new Persona(
            "9998887776665",            // dpi
            "Juan",                     // nombre1
            "Esteban",                  // nombre2
            "Santos",                   // apellido1
            "Velásquez",                // apellido2
            "Boulevard Miraflores, Zona 8", // direccionDomicilio
            22557788,                   // telefonoDomicilio
            56667788,                   // telefonoMovil
            new BigDecimal("4200.50"),  // salarioBase
            new BigDecimal("700.00")    // bonificacion
        );

        // Datos de Persona 6
        Persona persona6 = new Persona(
            "5544332211009",            // dpi
            "Lucía",                    // nombre1
            "Beatriz",                  // nombre2
            "Gómez",                    // apellido1
            "Morales",                  // apellido2
            "Avenida Las Flores, Zona 12", // direccionDomicilio
            22330077,                   // telefonoDomicilio
            55779988,                   // telefonoMovil
           new BigDecimal("4000.75"),  // salarioBase
           new BigDecimal("580.25")    // bonificacion
        );

          

        // Agregar personas a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);

        
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
