/*7. Cálculo do Perímetro e Área de um Retângulo
Faça um programa que solicite a base e a altura de um retângulo e exiba o seu perímetro e sua área.

Fórmulas:

Área = base × altura

Perímetro = 2 × (base + altura).*/

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a base ");
        int baseret = sc.nextInt();
        System.out.print("Informe a altura ");
        int altret = sc.nextInt();

        double perimetroret = 2 * (baseret + altret);
        double arearet = baseret * altret;

        System.out.println("Perímetro:" + perimetroret);
        System.out.println("Área:" + arearet);

        sc.close();
    }
}
