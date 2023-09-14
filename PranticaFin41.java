/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pranticafin4;

import java.util.Scanner;
public class PranticaFin4 {

 
    public static void main(String[] args) 
    {
      Scanner pesos = new Scanner(System.in);
        System.out.println("Dame tu cantidad de pesos: ");
        int cantidad = pesos.nextInt();
        pesos.nextLine();
        final double dolar = 17.13;
        final double euro = 18.27;
        int cantidad1 = (int) (cantidad/dolar);
        System.out.println("tu cantidad en dolares es: " + cantidad1);
        int cantidad2 = (int) (cantidad/euro);
        System.out.println("tu cantidad en euros es: " + cantidad2);
        pesos.close();
        
    }
    
}
