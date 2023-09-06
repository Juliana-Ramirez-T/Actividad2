/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor7;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOR7 {
	public static void main(String[] args) {
    	double a, b;
        System.out.println("Ingrese el valor A: ");
    	Scanner entrada = new Scanner(System.in);
    	a = entrada.nextDouble(); 
    	System.out.println("Ingrese el valor B: ");
    	Scanner entrada2 = new Scanner(System.in);
    	b = entrada2.nextDouble(); 
    	if (a>b){
    	    System.out.println(a + " es mayor que " + b);
    	}
    	else if (a==b){
    	    System.out.println(a + " es igual a " + b);
    	}
    	else{
    	    System.out.println(a + " es menor que " + b);
    	}
	}
}
