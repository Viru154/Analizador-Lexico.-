/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/**
 * Clase para validar reglas específicas en el análisis léxico.
 */
public class RuleSet {

    // Conjunto de palabras reservadas
    private static final Set<String> PALABRAS_RESERVADAS = new HashSet<>();

    // Expresiones regulares para validaciones
    private static final Pattern LINE_PATTERN = Pattern.compile(".*(OR|AND|fr|ifito|isc\\$|\\+|SETS).*");

    static {
        // Inicialización de palabras reservadas
        PALABRAS_RESERVADAS.add("OR");
        PALABRAS_RESERVADAS.add("AND");
        PALABRAS_RESERVADAS.add("fr");
        PALABRAS_RESERVADAS.add("ifito");
        PALABRAS_RESERVADAS.add("isc$");
        PALABRAS_RESERVADAS.add("SETS");
    }

    /**
     * Valida si la línea contiene características requeridas.
     *
     * @param linea Línea a validar.
     * @return true si la línea cumple con las reglas definidas, false en caso contrario.
     */
    public static boolean validateLine(String linea) {
        if (linea == null || linea.isEmpty()) {
            return false; // Las líneas vacías no son válidas
        }
        return LINE_PATTERN.matcher(linea).matches();
    }

    /**
     * Verifica si una palabra es una palabra reservada.
     *
     * @param word Palabra a verificar.
     * @return true si es reservada, false en caso contrario.
     */
    public static boolean isReservedWord(String word) {
        if (word == null || word.isEmpty()) {
            return false; // No puede ser reservada si es nula o vacía
        }
        return PALABRAS_RESERVADAS.contains(word);
    }

    /**
     * Devuelve todas las palabras reservadas en el sistema.
     *
     * @return Un conjunto inmutable con las palabras reservadas.
     */
    public static Set<String> getReservedWords() {
        return Set.copyOf(PALABRAS_RESERVADAS); // Retorna una copia inmutable
    }
}


