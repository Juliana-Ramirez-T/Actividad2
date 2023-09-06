/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop21;

/**
 *
 * @author Juliana
 */
import java.util.Scanner;
public class POOP21 {
	public static void main(String[] args) {
    	double lado1, lado2, lado3, perimetro, area, semiperimetro;
        System.out.println("Ingrese el valor del lado #1 del triangulo: ");
    	Scanner entrada = new Scanner(System.in);
    	lado1 = entrada.nextDouble(); //lado 1
    	System.out.println("Ingrese el valor del lado #2 del triangulo: ");
    	Scanner entrada2 = new Scanner(System.in);
    	lado2 = entrada2.nextDouble(); //lado 2
    	System.out.println("Ingrese el valor del lado #3 del triangulo: ");
    	Scanner entrada3 = new Scanner(System.in);
    	lado3 = entrada3.nextDouble(); //lado 3
    	
        perimetro = lado1 + lado2 + lado3; 
        semiperimetro = perimetro/2;
    	area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Semiperimetro del triangulo: " + semiperimetro);
    	System.out.println("Area del triangulo: " + area);
	}
}

