/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author pc
 */
 import java.util.Scanner;

 public class OperacionesBasicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Solicitar los dos números al usuario
        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextDouble();

        // Realizar las operaciones
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division;

        // Validar división por cero
        if (num2 != 0) {
            division = num1 / num2;
        } else {
            division = Double.NaN; // NaN = Not a Number (no se puede dividir entre 0)
        }

        // Mostrar resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("División: No se puede dividir entre 0");
        }

        entrada.close();
    }
}
    

    

