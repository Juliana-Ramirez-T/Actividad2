/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop19;

import java.util.Scanner;
public class POOP19 {
	public static void main(String[] args) {
    	double lado, perimetro, area, altura;
        System.out.println("Ingrese el valor del lado del triangulo equilatero:");
    	Scanner entrada = new Scanner(System.in);
    	lado = entrada.nextDouble(); //lado
        perimetro = 3 * lado; //perimetro
        altura = (Math.sqrt(3))/2 * lado; //altura
    	area = (lado * altura)/2; //area
        System.out.println("Perimetro del triangulo: " + perimetro);
        System.out.println("Altura del triangulo: " + altura);
    	System.out.println("Area del triangulo: " + area);
	}
}

