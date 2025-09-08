/*Exercício 12: construir um programa em Java que leia os valores de A, B e C e que imprima
“Não forma triângulo”, se um dos valores for maior que a soma dos outros 2, caso contrário,
imprimir qual é o tipo do triângulo, que pode ser “Equilátero”, se tiver os 3 lados iguais,
“Isósceles”, se tiver 2 lados iguais e “Escaleno”, se os 3 lados forem diferentes.*/

import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do primeiro lado ");
        int A = sc.nextInt();
        System.out.print("Informe o valor do segundo lado ");
        int B = sc.nextInt();
        System.out.print("Informe o valor do terceiro lado ");
        int C = sc.nextInt();

        if ((A > B + C) || (B > A + C) || (C > A + B)) {
            System.out.println("Não forma triângulo");
        } else if ((A != B) && (A != C) && (B != C)) {
            System.out.print("Triangulo Escaleno");
        } else if ((A == B) || (A == C) || (B == C)) {
            System.out.print("Triangulo Escaleno");
        } else {
            System.out.println(" Triangulo Isósceles ");
        }

        sc.close();
    }
}