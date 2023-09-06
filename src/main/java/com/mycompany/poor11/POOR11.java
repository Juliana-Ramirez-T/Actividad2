/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor11;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOR11 {
	public static void main(String[] args) {
    	int n1, n2, n3, mayor;
        System.out.println("Ingrese el primer valor: ");
    	Scanner entrad = new Scanner(System.in);
    	n1 = entrad.nextInt(); 
    	System.out.println("Ingrese el segundo valor: ");
    	Scanner entrada2 = new Scanner(System.in);
    	n2 = entrada2.nextInt(); 
    	System.out.println("Ingrese el tercer valor: ");
    	Scanner entrada = new Scanner(System.in);
    	n3 = entrada.nextInt(); 
    	
    	if ((n1>n2) && (n1>n3)) {
    	    mayor = n1;
    	}
    	else if (n2>n3){
    	    mayor = n2;
    	}
    	else{
    	    mayor=n3;
    	}
    	System.out.println("El valor mayor entre: " + n1 + ", "+ n2 + " y " + n3 + " es: "+ mayor);
	}
}
