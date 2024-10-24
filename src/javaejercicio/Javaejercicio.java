/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercicio;

public class Javaejercicio {
    public static void main(String[] args) {
      
        int[] numeros = {1, 2, 3};

     
        System.out.printf("%-5s %-8s %-8s %-15s%n", "N", "N * 2", "N / 2", "Divisible por 3?");

   
        for (int N : numeros) {
            int multiplicado = N * 2;
            double dividido = N / 2.0; 
            String divisiblePor3 = (N % 3 == 0) ? "S" : "N";
            
            System.out.printf("%-5d %-8d %-8.2f %-15s%n", N, multiplicado, dividido, divisiblePor3);
        }
    }
}
