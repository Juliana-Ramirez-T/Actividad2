/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poor13;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOR13 {
	public static void main(String[] args) {
    	double valcomp, valpag, pdes;
    	String color;
        System.out.println("Ingrese valor de la compra: ");
    	Scanner entrada = new Scanner(System.in);
    	valcomp = entrada.nextDouble(); 
    	System.out.println("Ingrese color: ");
    	Scanner entrada2 = new Scanner(System.in);
    	color = entrada2.nextLine(); 
    	
    	if (color.equals("blanco")) {
    	    pdes = 0;
    	}
    	else if (color.equals("verde")){
    	    pdes = 10;
    	}
    	else if (color.equals("amarillo")){
    	    pdes = 25;
    	}  
    	else if (color.equals("azul")){
    	    pdes = 50;
    	} 
    	else{
    	    pdes = 100;
    	}
    	valpag = valcomp - pdes * (valcomp/100);
    	System.out.println("El cliente debe pagar: $" + valpag);
	}
}

