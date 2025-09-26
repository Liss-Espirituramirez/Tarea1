/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

/**
 *
 * @author pc
 */
import java.util.Scanner;


public class NumeroMayorMenor {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);

        // Pedir dos números al usuario
        System.out.print("Ingrese el primer numero: ");
        int num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = entrada.nextInt();

        // Comparar los números
        if (num1 > num2) {
            System.out.println("El numero mayor es: " + num1);
            System.out.println("El numero menor es: " + num2);
        } else if (num2 > num1) {
            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);
        } else {
            System.out.println("Ambos numeros son iguales.");
        }

        entrada.close();
    }
}

    

