/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

/**
 *
 * @author Viru154
 */

public class TokenFactory {

    public static Token createToken(String palabra) {
        TiposTokens tipo;

        if (RuleSet.isReservedWord(palabra)) {
            tipo = TiposTokens.RESERVADA;
        } else if (palabra.matches("[0-9]+")) {
            tipo = TiposTokens.DIGITO;
        } else if (palabra.matches("[*|/|+|-]")) {
            tipo = TiposTokens.OPERADOR;
        } else if (palabra.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}")) {
            tipo = TiposTokens.CORREO;
        } else if (palabra.equals("OR")) {
            tipo = TiposTokens.OR;
        } else if (palabra.equals("AND")) {
            tipo = TiposTokens.AND;
        } else if (palabra.equals("fr")) {
            tipo = TiposTokens.FOR;
        } else if (palabra.equals("ifito")) {
            tipo = TiposTokens.IF;
        } else if (palabra.equals("isc$")) {
            tipo = TiposTokens.CASE;
        } else {
            tipo = TiposTokens.IDENTIFICADOR;
        }

        return new Token(tipo, palabra);
    }
}


