/*Exercício 8: construir um programa em Java que leia a quantidade de disciplinas em que um
aluno não alcançou a média. Se a quantidade for igual a 0, imprimir “Aprovado”, se a quantidade
for menor ou igual a 5, imprimir “Recuperação” e se a quantidade for maior que 5, imprimir
“Reprovado”.*/

import java.util.Scanner;

public class AprovacaoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de disciplinas em que o aluno ficou abaixo da média: ");
        int quantdisc = sc.nextInt();

        if (quantdisc == 0) {
            System.out.println("Aprovado!");
        } else if (quantdisc <= 5) {
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }

        sc.close();
    }
}
