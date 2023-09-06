/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor15;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOR15 {
	public static void main(String[] args) {
    	double pesoa, pesob, pesoc, pesod;
        System.out.print("Ingrese el peso de la esfera A: ");
    	Scanner entrada = new Scanner(System.in);
    	pesoa = entrada.nextDouble(); 
    	System.out.print("Ingrese el peso de la esfera B: ");
    	Scanner entrada2 = new Scanner(System.in);
    	pesob = entrada2.nextDouble(); 
    	System.out.print("Ingrese el peso de la esfera C: ");
    	Scanner entrada3 = new Scanner(System.in);
    	pesoc = entrada3.nextDouble(); 
    	System.out.print("Ingrese el peso de la esfera D: ");
    	Scanner entrada4 = new Scanner(System.in);
    	pesod = entrada4.nextDouble(); 
    	if (pesoa == pesob && pesoa == pesoc) {
    	    if (pesod > pesoa) {
    	        System.out.println("La esfera D es la diferente y es de mayor peso");
            } 
            else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }
        } 
        else if (pesoa == pesob && pesoa == pesod) {
            if (pesoc > pesoa) {
                System.out.println("La esfera C es la diferente y es de mayor peso");
            } 
            else {
                System.out.println("La esfera C es la diferente y es de menor peso");
            }
        } 
        else if (pesoa == pesoc && pesoa == pesod) {
            if (pesob > pesod) {
                System.out.println("La esfera B es la diferente y es de mayor peso");
            } 
            else {
                System.out.println("La esfera B es la diferente y es de menor peso");
            }
        } 
        else {
            if (pesoa > pesob) {
                System.out.println("La esfera A es la diferente y es de mayor peso");
            } 
            else {
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
	}
}
