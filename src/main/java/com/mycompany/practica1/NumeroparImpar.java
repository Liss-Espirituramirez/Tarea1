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
public class NumeroparImpar {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println(numero + " es un numero par.");
        } else {
            System.out.println(numero + " es un numero impar.");
        }

        sc.close();
    }
}

