/*Exercício 1: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18. */

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        }

        sc.close();
    }
}