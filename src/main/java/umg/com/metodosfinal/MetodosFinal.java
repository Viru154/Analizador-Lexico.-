/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package umg.com.metodosfinal;

import java.util.Scanner;

public class MetodosFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GramaticaProcessor procesador = new GramaticaProcessor();

        System.out.println("=== Bienvenido al Analizador Lexico ===");
        System.out.println("1. Procesar archivo GRAMATICA.TXT");
        System.out.println("0. Salir");

        System.out.print("Ingrese su opcion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            procesador.procesarArchivo("GRAMATICA.TXT");
        } else if (opcion == 0) {
            System.out.println("Saliendo del programa...");
        } else {
            System.out.println("Opcion invalida.");
        }

        sc.close();
    }
}


