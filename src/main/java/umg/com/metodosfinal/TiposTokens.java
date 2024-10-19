/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

/**
 *
 * @author Viru154
 */
public enum TiposTokens {
    DIGITO("[0-9]+"),
    OPERADOR("[*|/|+|-]"),
    CORREO("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}");

    public final String patron;

    TiposTokens(String patron) {
        this.patron = patron;
    }
}


/* public enum TiposTokens {
    NUMERO("[0-9]+"),  
    OPERADOR("[*|/|+|-]"),
    PARENTESIS_APERTURA("\\("),
    PARENTESIS_CIERRE("\\)"),
    PALABRA_RESERVADA("(SETEO|isc\\$|ifito)"),  // Palabras reservadas de tu gramática
    OR("\\|"),  // OR lógico
    AND("\\$"),  // AND lógico
    EMAIL("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"),  // Formato básico de correo electrónico
    ERROR(".+");  // Cualquier token que no coincida con las reglas anteriores (posible error)

    private final String patron;

    TiposTokens(String patron) {
        this.patron = patron;
    }

    public String getPatron() {
        return patron;
    }
} */

