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
public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedir al usuario la tabla que quiere ver
        System.out.print("Ingrese el número de la tabla que desea imprimir: ");
        int numero = entrada.nextInt();

        // Usar un bucle for para generar la tabla
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}

    

