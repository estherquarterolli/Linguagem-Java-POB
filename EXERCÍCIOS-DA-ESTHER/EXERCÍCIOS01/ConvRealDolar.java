/*9. Conversão de Moeda
Faça um programa que leia um valor em reais (R$) e a cotação
do dólar no dia. O programa deve calcular e exibir o valor equivalente em dólares (US$).*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ConvRealDolar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Informe o valor em reais (R$):");
        double valoreal = sc.nextDouble();
        System.out.println("Informe a cotação do dolar:");
        double cotdolar = sc.nextDouble();

        double valordol = valoreal * cotdolar;
        System.out.println("Valor em dólares: USD" + df.format(valordol));
    }
}
