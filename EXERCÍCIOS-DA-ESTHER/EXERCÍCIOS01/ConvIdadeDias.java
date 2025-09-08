
/*5. Conversão de Idade para Dias
Desenvolva um programa que leia a idade de uma pessoa em anos
e exiba a quantidade aproximada de dias que ela já viveu.

Considere um ano com 365 dias.*/
import java.util.Scanner;

public class ConvIdadeDias {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade (em anos)");
        int idade = sc.nextInt();
        int idadeemdias = idade * 365;
        System.out.println("Sua idade em dias é: " + idadeemdias);
    }
}
