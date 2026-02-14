package com.emergencias.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.util.List;

public class CentroSaludUtils {
    public static List<CentroSalud> cargarCentros(String ruta) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(new File(ruta), new TypeReference<List<CentroSalud>>(){});
        } catch (Exception e) {
            System.err.println("Error leyendo centros de salud: " + e.getMessage());
            return null;
        }
    }
}
