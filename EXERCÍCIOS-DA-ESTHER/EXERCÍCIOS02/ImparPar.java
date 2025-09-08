/*Exercício 4: construir um programa em Java que leia um número inteiro e imprima “PAR”, se o
número for par e imprima “ÍMPAR”, se o número for ímpar.*/

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor a ser analisado: ");
        int valor = sc.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor :(" + valor + "é par");
        } else {
            System.out.println("O valor :(" + valor + "é ímpar");
        }

        sc.close();
    }
}
