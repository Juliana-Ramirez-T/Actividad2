/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop23;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOP23 {
	public static void main(String[] args) {
    	double a, b, c, discriminante, x, x1, x2;
        System.out.println("Ingrese valor de A: ");
    	Scanner entrada = new Scanner(System.in);
    	a = entrada.nextDouble(); 
    	System.out.println("Ingrese valor de B: ");
    	Scanner entrada2 = new Scanner(System.in);
    	b = entrada2.nextDouble(); 
    	System.out.println("Ingrese valor de C: ");
    	Scanner entrada3 = new Scanner(System.in);
    	c = entrada3.nextDouble(); 
    	
    	discriminante = Math.pow(b,2) - 4*a*c;
    	
    	if (discriminante<0) {
    	    System.out.println("La ecuacion no tiene soluciones reales");
    	}
    	else if (discriminante==0){
    	    x = -(b)/(2*a);
    	    System.out.println("La solucion unica es " + x);
    	}
    	else{
    	    x1= (-b - Math.sqrt(discriminante)) / (2*a);
    	    x2= (-b + Math.sqrt(discriminante)) / (2*a);
    	    System.out.println("Las dos soluciones reales son: " + x1 + " y " + x2);
    	}
	}
}

