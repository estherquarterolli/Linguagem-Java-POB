/*Exercício 9: construir um programa em Java que leia as 2 notas de um aluno e que calcule,
armazene e imprima a média. Se a média for maior ou igual a 7, imprimir “Aprovado”, caso
contrário, realizar a leitura de uma terceira nota, que terá peso 2 e calcular, armazenar e imprimir
uma nova média. Se a nova média for maior ou igual a 6, imprimir “Aprovado”, caso contrário,
imprimir “Reprovado”.*/

import java.util.Scanner;

public class AprovacaoAluno2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota:");
        Float nota1 = sc.nextFloat();
        System.out.print("Informe a segunda nota:");
        Float nota2 = sc.nextFloat();
        Float media;

        media = (nota1 + nota2) / 2;

        if (media >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.print("Informe a terceira nota:");
            Float nota3 = sc.nextFloat();
            media = ((nota3 * 2) + nota1 + nota2) / 3;
            if (media >= 6) {
                System.out.println("Aprovado!");
            } else {
                System.out.println("Reprovado!");
            }

        }
        sc.close();
    }
}
