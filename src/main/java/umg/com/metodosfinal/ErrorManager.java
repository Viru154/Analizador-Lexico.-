/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ErrorManager {
    private static final List<String> historialErrores = new ArrayList<>();

    public enum TipoError {
        CRITICO,
        ADVERTENCIA,
        INFORMACION
    }

    public static void reportarError(String mensaje, TipoError tipo) {
        String mensajeCompleto = "[" + obtenerFechaHoraActual() + "] " + tipo + ": " + mensaje;

        // Agregar al historial
        historialErrores.add(mensajeCompleto);

        // Imprimir en consola
        System.out.println(mensajeCompleto);

        // Guardar en archivo
        try (FileWriter writer = new FileWriter("errores.log", true)) {
            writer.write(mensajeCompleto + "\n");
        } catch (IOException e) {
            System.out.println("No se pudo registrar el error: " + e.getMessage());
        }
    }

    public static List<String> obtenerHistorialErrores() {
        return historialErrores;
    }

    private static String obtenerFechaHoraActual() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
