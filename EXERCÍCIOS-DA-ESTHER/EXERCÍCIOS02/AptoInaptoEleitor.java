/*Exercício 5: construir um programa em Java que leia o ano de nascimento de uma pessoa e que
calcule a sua idade aproximada. Se a idade aproximada for maior ou igual a 16, imprimir “Apto
a ser eleitor”, imprimir “Inapto a ser eleitor”, caso contrário.*/

import java.util.Scanner;

public class AptoInaptoEleitor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Sistema para verificar aptidão eleitoral- ");
        System.out.print("Informe o ano de nascimento: ");
        int anonasc = sc.nextInt();
        int anoatual = 2025;
        int idade = anoatual - anonasc;

        if (idade >= 16) {
            System.out.println("Apto a votar, pois sua idade é:" + idade);
        } else {
            System.out.println("Inapto a votar, pois sua idade é:" + idade);
        }

        sc.close();
    }
}
