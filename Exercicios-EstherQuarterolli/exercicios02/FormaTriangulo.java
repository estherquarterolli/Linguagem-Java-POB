/*Exercício 11: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir “Forma triângulo”.*/

import java.util.Scanner;

public class FormaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--Verificar se pode formar um triangulo- ");
        System.out.print("Informe o valor do primeiro lado ");
        int A = sc.nextInt();
        System.out.print("Informe o valor do segundo lado ");
        int B = sc.nextInt();
        System.out.print("Informe o valor do terceiro lado ");
        int C = sc.nextInt();

        if ((A > B + C) || (B > A + C) || (C > A + B)) {
            System.out.println("Não forma triângulo");
        } else {
            System.out.println("Forma triângulo");
        }

        sc.close();
    }
}