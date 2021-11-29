package aulaide.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digita o primeiro valor: ");
		a = scan.nextInt();
		
		System.out.println("Digita o segundo valor: ");
		b = scan.nextInt();
		
		int soma = somar(a,b);
		int subtracao = subtrair(a,b);
		int multiplicacao = multiplicar(a,b);
		double divisao = dividir(a,b);
		
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		

	}
	
	public static int somar(int a, int b) {
		return a+b;		
	}
	
	public static int subtrair(int a, int b) {
		return a-b;		
	}
	
	public static int multiplicar(int a, int b) {
		return a*b;		
	}
	
	public static double dividir(double a, double b) {
		return a/b;		
	}

}
