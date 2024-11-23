package umg.com.metodosfinal;

public enum TiposTokens {
    DIGITO("[0-9]+"),
    OPERADOR("(>=|<=|<>|>|<|=|\\+|\\-|\\*|/|\\$|\\|)"),
    CORREO("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"),
    IDENTIFICADOR("[a-zA-Z_][a-zA-Z0-9_]*"),
    CHARSET("'[^']*'|\"[^\"]*\""), // Maneja cadenas con comillas simples o dobles
    ERROR(".*"); // Todo lo que no coincide con otro patrón

    public final String patron;

    TiposTokens(String patron) {
        this.patron = patron;
    }

    public boolean validar(String entrada) {
        return entrada.matches(this.patron);
    }
}
