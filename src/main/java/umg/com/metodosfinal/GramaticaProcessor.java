package umg.com.metodosfinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GramaticaProcessor {

    public void procesarArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            Map<String, Integer> conteoTokens = inicializarConteo();

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                System.out.println("Linea leida: " + linea);

                // Dividir la línea en tokens con el nuevo separador
                String[] palabras = linea.split("\\s+|(?=[^a-zA-Z0-9@._])|(?<=[^a-zA-Z0-9@._])");
                for (String palabra : palabras) {
                    if (palabra.isEmpty()) continue;

                    Token token = TokenFactory.createToken(palabra);
                    System.out.println("Token encontrado: (" + token.getTipo() + ": " + token.getValor() + ")");

                    // Incrementar el conteo del tipo de token
                    conteoTokens.put(token.getTipo().name(), conteoTokens.get(token.getTipo().name()) + 1);
                }
            }

            // Mostrar resultados
            mostrarResultados(conteoTokens);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    private Map<String, Integer> inicializarConteo() {
        Map<String, Integer> conteo = new HashMap<>();
        for (TiposTokens tipo : TiposTokens.values()) {
            conteo.put(tipo.name(), 0);
        }
        conteo.put("ERROR", 0); // Conteo especial para errores
        return conteo;
    }

    private void mostrarResultados(Map<String, Integer> conteoTokens) {
        System.out.println("\n=== Resultados del Analizador Lexico ===");
        for (Map.Entry<String, Integer> entry : conteoTokens.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
