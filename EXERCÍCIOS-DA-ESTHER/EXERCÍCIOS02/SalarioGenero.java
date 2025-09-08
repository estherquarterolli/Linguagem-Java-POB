/*Exercício 6: construir um programa em Java que leia o salário bruto e o sexo de um funcionário.
Se o sexo for “M” (masculino), calcular, armazenar e imprimir um desconto de 5% e o salário
líquido, caso contrário, calcular, armazenar e imprimir um desconto de 3% e o salário líquido.*/

import java.util.Scanner;

public class SalarioGenero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Calcular Salário Líquido:- ");
        System.out.print("Informe seu salário bruto: ");
        float salbruto = sc.nextFloat();

        System.out.println("1- Masculino | 2- Feminino");
        System.out.print("Informe seu gênero: ");
        int genero = sc.nextInt();
        if ((genero == 1) || (genero == 2)) {

            // Inicialmente usei Float para salliq, no entanto, o compilador estava dando
            // erro!!
            if (genero == 1) {
                Double salliq = salbruto - (0.05 * salbruto);
                System.out.println("Seu salário líquido é:" + salliq);
            } else {

                Double salliq = salbruto - (0.03 * salbruto);
                System.out.println("Seu salário líquido é:" + salliq);
            }
        }

        sc.close();
    }
}
