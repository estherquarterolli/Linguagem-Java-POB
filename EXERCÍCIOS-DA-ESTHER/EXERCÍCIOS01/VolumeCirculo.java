/*8. Cálculo do Volume de uma Esfera
Crie um programa que leia o raio de uma esfera e calcule o seu volume.

Fórmula: V = (4/3) * π * raio³.

Use π = 3.14159.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class VolumeCirculo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Informe o raio do círculo: ");
        double raiocirculo = sc.nextDouble();
        double volcirc = (4 / 3) * 3.14159 * (raiocirculo * raiocirculo * raiocirculo);
        System.out.println("Volume do círculo com raio " + raiocirculo + " é: " + df.format(volcirc));
    }
}
