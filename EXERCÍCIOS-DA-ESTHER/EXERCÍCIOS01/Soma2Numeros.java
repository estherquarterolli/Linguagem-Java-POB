/*1. Soma de Dois Números:Escreva um programa que 
solicite ao usuário dois números inteiros e exiba a soma deles.*/

import java.util.Scanner;

public class Soma2Numeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Soma de 2 Valores:");
        System.out.print("Primeiro Valor:");
        int valor1 = sc.nextInt();
        System.out.print("+");
        System.out.print("Segundo Valor:");
        int valor2 = sc.nextInt();

        int soma = valor1 + valor2;
        System.out.println("Soma: " + soma);

    }
}
