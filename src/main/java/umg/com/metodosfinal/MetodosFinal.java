/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package umg.com.metodosfinal;

/**
 *
 * @author Viru154
 */
import java.util.Scanner;

public class MetodosFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("#############################################");
            System.out.println("#   BIENVENIDO AL ANALIZADOR DE GRAMATICA   #");
            System.out.println("#############################################");
            System.out.println("?????????????????????????????????????????????");
            System.out.println("?               MENU PRINCIPAL              ?");
            System.out.println("?????????????????????????????????????????????");
            System.out.println("?  1. Procesar archivo GRAMATICA.TXT        ?");
            System.out.println("?  0. Salir                                 ?");
            System.out.println("?????????????????????????????????????????????");
            System.out.print("Por favor, ingrese su operacion: ");
            
            opcion = sc.nextInt(); // Leer opción del usuario
            
            if (opcion == 1) {
                // Procesar el archivo GRAMATICA.TXT
                GramaticaProcessor procesador = new GramaticaProcessor();
                procesador.procesarArchivo("GRAMATICA.TXT");
                
                // Preguntar si desea reiniciar o terminar
                System.out.println("\n¿Desea reiniciar o terminar?");
                System.out.println("1. Reiniciar");
                System.out.println("0. Terminar");
                System.out.print("Por favor, ingrese su eleccion: ");
                
                opcion = sc.nextInt(); // Leer opción para reiniciar o terminar
                if (opcion == 0) {
                    System.out.println("Saliendo del programa...");
                    break; // Terminar el programa si se elige la opción 0
                }
            } else if (opcion == 0) {
                System.out.println("Saliendo del programa...");
                break; // Terminar el programa si se elige la opción 0 desde el menú principal
            } else {
                System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (true); // Bucle para reiniciar si es necesario

        sc.close(); // Cerrar el Scanner al final
    }
}

