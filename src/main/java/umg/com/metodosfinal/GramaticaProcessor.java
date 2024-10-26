/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package umg.com.metodosfinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Viru154
 */

public class GramaticaProcessor {

    public void procesarArchivo(String nombreArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            String seccionActual = "";

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                System.out.println("\nLinea leida: " + linea);

                // Identificar la sección actual
                if (linea.startsWith("TOKENS")) {
                    seccionActual = "TOKENS";
                    System.out.println("\nSeccion: TOKENS");
                } else if (linea.startsWith("SETEO")) {
                    seccionActual = "SETEO";
                    System.out.println("\nSeccion: SETEO");
                } else if (linea.startsWith("Lisp")) {
                    seccionActual = "LISP";
                    System.out.println("\nSeccion: LISP");
                }

                // Procesar la línea según la sección
                switch (seccionActual) {
                    case "TOKENS" -> {
                        System.out.println("Procesando como TOKEN\n");
                        procesarTokens(linea);
                    }
                    case "SETEO" -> {
                        System.out.println("Procesando como SETEO\n");
                        procesarSeteo(linea);
                    }
                    case "LISP" -> {
                        System.out.println("Procesando como LISP\n");
                        procesarLisp(linea);
                    }
                    default -> System.out.println("Linea fuera de secciones.\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public void procesarTokens(String linea) {
        if (RuleSet.validateLine(linea)) {
            System.out.println("Linea valida: " + linea);
            String[] palabras = linea.split("\\s+");
            for (String palabra : palabras) {
                Token token = TokenFactory.createToken(palabra);
                System.out.println("Token creado: (" + token.getTipo() + ": " + token.getValor() + ")");
            }
        } else {
            System.out.println("Linea invalida: " + linea);
        }
    }

    public void procesarSeteo(String linea) {
        System.out.println("Procesando Seteo: " + linea);
        // Aquí puedes agregar más lógica específica para procesar SETEO
    }

    public void procesarLisp(String linea) {
        System.out.println("Procesando Lisp: " + linea);
        // Aquí puedes agregar más lógica específica para procesar Lisp
    }
}
