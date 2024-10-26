/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Viru154
 */
public class RuleSet {

    // Valida si la línea contiene características requeridas
    public static boolean validateLine(String linea) {
        return linea.matches(".*(OR|AND|fr|ifito|isc\\$|\\+|SETS).*");
    }

    // Verifica si una palabra es una palabra reservada
    public static boolean isReservedWord(String word) {
        return word.equals("OR") || word.equals("AND") || word.equals("fr") 
               || word.equals("ifito") || word.equals("isc$") || word.equals("SETS");
    }
}

