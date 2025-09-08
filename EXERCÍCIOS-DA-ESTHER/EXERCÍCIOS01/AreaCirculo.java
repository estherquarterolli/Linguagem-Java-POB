
/*2. Área de um Círculo
Desenvolva um programa que leia o raio de um círculo e calcule sua área.

Fórmula: Área = π * raio²

Considere π = 3.14159.*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class AreaCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Informe o raio do círculo: ");
        double raiocirculo = sc.nextDouble();
        double areacirc = 3.14159 * (raiocirculo * raiocirculo);
        System.out.println("Área do círculo com raio " + raiocirculo + " é: " + df.format(areacirc));
    }
}
