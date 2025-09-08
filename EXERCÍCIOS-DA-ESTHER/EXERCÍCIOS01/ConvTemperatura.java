/*3. Conversão de Temperatura
       Crie um programa que leia uma temperatura em graus Celsius e a converta para Fahrenheit.
       
       Fórmula: F = (C × 9/5) + 32.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.0");

        System.out.println("Informe a temperatura em graus Celsius:");
        double tempcelsius = sc.nextDouble();
        double tempfahren = (tempcelsius * 9 / 5) + 32;
        System.out.println(df.format(tempcelsius) + "Cº = " + df.format(tempfahren) + " Fahrenheit");
    }

}
