/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoramatematica2;

import java.util.Scanner;

/**
 *
 * @author alna7
 */
public class Calculo {
       // Método main donde se inicia el programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraMatematica2 calculadora = new CalculadoraMatematica2();

        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Captura de los 2 números
                    System.out.print("Ingrese el primer número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double num2 = scanner.nextDouble();
                    calculadora.establecerNumeros(num1, num2);
                    break;

                case 2:
                    // Sumar
                    System.out.println("Resultado de la suma: " + calculadora.sumar());
                    break;

                case 3:
                    // Restar
                    System.out.println("Resultado de la resta: " + calculadora.restar());
                    break;

                case 4:
                    // Multiplicar
                    System.out.println("Resultado de la multiplicación: " + calculadora.multiplicar());
                    break;

                case 5:
                    // Dividir
                    try {
                        System.out.println("Resultado de la división: " + calculadora.dividir());
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    // Salir
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 0);

        // Cerrar el Scanner (opcional)
        scanner.close();
    }
}

