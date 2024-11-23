/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

/**
 * Representa un token identificado en el análisis léxico.
 * Cada token tiene un tipo (TiposTokens) y un valor asociado.
 */
public final class Token {
    private final TiposTokens tipo;
    private final String valor;

    /**
     * Constructor de la clase Token.
     *
     * @param tipo  El tipo del token, según TiposTokens.
     * @param valor El valor literal del token.
     */
    public Token(TiposTokens tipo, String valor) {
        if (!tipo.validar(valor)) {
            throw new IllegalArgumentException("El valor '" + valor + "' no coincide con el patron del tipo " + tipo);
        }
        this.tipo = tipo;
        this.valor = valor;
    }

    /**
     * Devuelve el tipo del token.
     *
     * @return Tipo del token (TiposTokens).
     */
    public TiposTokens getTipo() {
        return tipo;
    }

    /**
     * Devuelve el valor literal del token.
     *
     * @return Valor del token (String).
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sobrescribe el método toString para mostrar una representación clara del token.
     *
     * @return Representación en texto del token.
     */
    @Override
    public String toString() {
        return "Token{" +
                "tipo=" + tipo +
                ", valor='" + valor + '\'' +
                '}';
    }

    /**
     * Método estático para crear un token validando su tipo automáticamente.
     *
     * @param entrada La cadena a analizar.
     * @return Un token del tipo correspondiente o de tipo ERROR si no coincide.
     */
    public static Token crearToken(String entrada) {
        for (TiposTokens tipo : TiposTokens.values()) {
            if (tipo.validar(entrada)) {
                return new Token(tipo, entrada);
            }
        }
        return new Token(TiposTokens.ERROR, entrada); // Si no coincide con ningún patrón
    }
}

