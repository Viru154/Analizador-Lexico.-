/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

/**
 * Clase fabrica para crear tokens basados en una palabra.
 */
public class TokenFactory {

    /**
     * Crea un token basado en el tipo correspondiente segun la palabra proporcionada.
     *
     * @param palabra La palabra a analizar.
     * @return Una instancia de Token con su tipo correspondiente.
     */
    public static Token createToken(String palabra) {
        if (palabra == null || palabra.isEmpty()) {
            return new Token(TiposTokens.ERROR, "Cadena nula o vacia");
        }

        for (TiposTokens tipo : TiposTokens.values()) {
            if (tipo.validar(palabra)) {
                return new Token(tipo, palabra);
            }
        }

        // Si no coincide con ningun tipo conocido, se clasifica como ERROR
        return new Token(TiposTokens.ERROR, palabra);
    }
}




