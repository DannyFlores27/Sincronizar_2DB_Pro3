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
        
        // Datos de Persona 7
        Persona persona7 = new Persona(
            "6677889900112",            // dpi
            "Roberto",                  // nombre1
            "Ignacio",                  // nombre2
            "Castillo",                 // apellido1
            "Monterroso",               // apellido2
            "Callejón San Juan, Zona 3",// direccionDomicilio
            21123344,                   // telefonoDomicilio
            56554422,                   // telefonoMovil
            new BigDecimal("3200.30"),  // salarioBase
            new BigDecimal("450.00")    // bonificacion
        );
         
        // Datos de Persona 8
        Persona persona8 = new Persona(
           "1234567809876",            // dpi
           "Paula",                    // nombre1
           "Isabel",                   // nombre2
           "González",                 // apellido1
           "Cruz",                     // apellido2
           "Residenciales del Norte, Zona 10", // direccionDomicilio
           22660044,                   // telefonoDomicilio
           55992211,                   // telefonoMovil
           new BigDecimal("4400.60"),  // salarioBase
           new BigDecimal("640.80")    // bonificacion
        );

        // Datos de Persona 9
        Persona persona9 = new Persona(
          "0987654321098",            // dpi
          "Ana",                      // nombre1
          "Sofía",                    // nombre2
          "Siana",                    // apellido1
          "Zanches",                  // apellido2
          "Calle de los Álamos, Zona 6",// direccionDomicilio
           21110077,                   // telefonoDomicilio
           55880044,                   // telefonoMovil
           new BigDecimal("3900.20"),  // salarioBase
           new BigDecimal("500.50")    // bonificacion
        );

        // Datos de Persona 10
        Persona persona10 = new Persona(
          "8765432109876",            // dpi
          "Javier",                   // nombre1
          "Eduardo",                  // nombre2
          "Salazar",                  // apellido1
          "Quiñones",                 // apellido2
          "Avenida del Sol, Zona 9",  // direccionDomicilio
          22002211,                   // telefonoDomicilio
          55332288,                   // telefonoMovil
          new BigDecimal("4300.45"),  // salarioBase
          new BigDecimal("610.75")    // bonificacion
        );

        // Datos de Persona 11
        Persona persona11 = new Persona(
           "2233445566778",            // dpi
           "Victoria",                 // nombre1
           "Angélica",                 // nombre2
           "Hernández",                // apellido1
           "Castro",                   // apellido2
           "Boulevard de las Rosas, Zona 2", // direccionDomicilio
           22223344,                   // telefonoDomicilio
           55668844,                   // telefonoMovil
           new BigDecimal("3800.35"),  // salarioBase
           new BigDecimal("450.60")    // bonificacion
        );

        // Datos de Persona 12
        Persona persona12 = new Persona(
           "6655443322119",            // dpi
           "Jose",                     // nombre1
           "Francisco",                // nombre2
           "Vásquez",                  // apellido1
           "Sinai",                    // apellido2
           "Calle del Río, Zona 13",   // direccionDomicilio
           23335566,                   // telefonoDomicilio
           55221100,                   // telefonoMovil
           new BigDecimal("4600.25"),  // salarioBase
           new BigDecimal("670.00")    // bonificacion
        );

        // Datos de Persona 13
        Persona persona13 = new Persona(
            "7766554433221",            // dpi
            "Raquel",                   // nombre1
            "Marina",                   // nombre2
            "Escobar",                  // apellido1
            "Domínguez",                // apellido2
            "Avenida 15, Zona 14",      // direccionDomicilio
            21110066,                   // telefonoDomicilio
            55667700,                   // telefonoMovil
            new BigDecimal("4100.10"),  // salarioBase
            new BigDecimal("520.50")    // bonificacion
        );

       // Datos de Persona 14
       Persona persona14 = new Persona(
          "4455667788990",            // dpi
          "David",                    // nombre1
          "Alonso",                   // nombre2
          "Medina",                   // apellido1
          "López",                    // apellido2
          "Calle 9, Zona 4",          // direccionDomicilio
          22007711,                   // telefonoDomicilio
          55443300,                   // telefonoMovil
          new BigDecimal("3900.80"),  // salarioBase
          new BigDecimal("500.25")    // bonificacion
        );

       // Datos de Persona 15
       Persona persona15 = new Persona(
          "1122334455667",            // dpi
          "Mónica",                   // nombre1
          "Claudia",                  // nombre2
          "Campos",                   // apellido1
          "Reyes",                    // apellido2
          "Colonia Los Pinos, Zona 5",// direccionDomicilio
          22110022,                   // telefonoDomicilio
          55990077,                   // telefonoMovil
          new BigDecimal("4500.35"),  // salarioBase
          new BigDecimal("680.50")    // bonificacion
        );

        // Agregar personas a la lista
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);
        listaPersonas.add(persona6);
        listaPersonas.add(persona7);
        listaPersonas.add(persona8);
        listaPersonas.add(persona9);
        listaPersonas.add(persona10);
        listaPersonas.add(persona11);
        listaPersonas.add(persona12);
        listaPersonas.add(persona13);
        listaPersonas.add(persona14);
        listaPersonas.add(persona15);
        
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
