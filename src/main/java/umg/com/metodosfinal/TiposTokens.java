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
    CORREO("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}"),
    OR("OR"),
    AND("AND"),
    FOR("fr"),
    IF("ifito"),
    CASE("isc\\$"),
    SETS("SETS"),
    RESERVADA("RESERVADA"), // Tipo para palabras reservadas
    IDENTIFICADOR("[a-zA-Z_][a-zA-Z0-9_]*"),
    ERROR("ERROR");

    public final String patron;

    TiposTokens(String patron) {
        this.patron = patron;
    }
}
