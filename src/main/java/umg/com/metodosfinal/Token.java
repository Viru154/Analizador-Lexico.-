/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umg.com.metodosfinal;

/**
 *
 * @author Viru154
 */

public class Token {
    private final TiposTokens tipo;
    private final String valor;

    public Token(TiposTokens tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public TiposTokens getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }
}

