/*construir um programa em Java que leia 2 números inteiros e imprima o maior
número lido.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.print("Digite o primeiro valor: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo:  ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O valor 1:(" + num1 + ") é maior que o valor 2:(" + num2 + ")!");
        } else {
            System.out.println("O valor 2:(" + num2 + ") é maior!");
        }

        sc.close();
    }
}
