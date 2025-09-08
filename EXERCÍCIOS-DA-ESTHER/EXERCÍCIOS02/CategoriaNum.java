/*Exercício 7: construir um programa em Java que leia um número inteiro e imprima “Positivo”,
se o número lido for maior que 0, imprima “Negativo”, se o número lido for menor que 0 e
imprima “Nulo”, se o número lido for igual a 0.*/

import java.util.Scanner;

public class CategoriaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        Double num = sc.nextDouble();

        if (num > 0) {
            System.out.println("Positivo");
        } else if (num == 0) {
            System.out.println("Nulo");
        } else {
            System.out.println("Negativo");
        }

        sc.close();
    }
}
