/*Exercício 1: Soma dos N primeiros números naturais
Descrição:
Crie um programa que solicite ao usuário um número N e utilize um loop for
para calcular a soma dos primeiros N números naturais.
Requisitos:
• O programa deve utilizar um contador para iterar de 1 até N.
• Deve utilizar um acumulador para somar os valores sucessivos.
• Ao final, exibir a soma total.*/

import java.util.Scanner;

public class SomaDeNumNaturais
{
    
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
		System.out.println("Informe o limite do intervalo:");
		int N = sc.nextInt();
		
		int soma=0;
		for (int i=1; i<=N; i++){
		    soma+=i;
		}
		
		System.out.printf("A soma é:"+soma);
		
	}
}
