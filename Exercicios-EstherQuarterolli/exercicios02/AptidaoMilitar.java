/*Exercício 10: construir um programa em Java que leia o ano de nascimento e o sexo de uma
pessoa e que calcule a sua idade aproximada. Se o sexo for igual a “M” (masculino) e a idade for
igual a 18, imprimir “Serviço Militar Obrigatório”, caso contrário, imprimir “Isento de Serviço
Militar”.*/

import java.util.Scanner;

public class AptidaoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Sistema para verificar aptidão militar- ");
        System.out.print("Informe o ano de nascimento: ");
        int anonasc = sc.nextInt();
        int anoatual = 2025;
        int idade = anoatual - anonasc;

        System.out.println("1- Masculino | 2- Feminino");
        System.out.print("Informe seu gênero: ");
        int genero = sc.nextInt();
        if ((genero == 1) || (genero == 2)) {

            if ((genero == 1) && (idade >= 18)) {
                System.out.println("Serviço Militar Obrigatório");
            } else {

                System.out.println("Isento Serviço Militar");
            }
        }

        sc.close();
    }
}
