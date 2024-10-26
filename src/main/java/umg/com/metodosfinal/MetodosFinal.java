/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.com.metodosfinal;
import java.util.Scanner;

/**
 *
 * @author Viru154
 */

public class MetodosFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("#############################################");
        System.out.println("|   BIENVENIDO AL ANALIZADOR DE GRAMATICA   |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|###########################################|");
        System.out.println("|               MENU PRINCIPAL              |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  1. Procesar archivo GRAMATICA.TXT        |");
        System.out.println("|  0. Salir                                 |");
        System.out.println("#############################################");

        System.out.print("Por favor, ingrese su operacion: ");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            GramaticaProcessor procesador = new GramaticaProcessor();
            procesador.procesarArchivo("GRAMATICA.TXT");

            System.out.println("\n¿Desea reiniciar o terminar?");
            System.out.println("1. Reiniciar");
            System.out.println("0. Terminar");
            System.out.print("Por favor, ingrese su eleccion: ");
            int eleccion = sc.nextInt();

            if (eleccion == 1) {
                main(args);  // Reiniciar el programa
            } else {
                System.out.println("Saliendo del programa...");
            }
        } else {
            System.out.println("Saliendo del programa...");
        }
    }
}
