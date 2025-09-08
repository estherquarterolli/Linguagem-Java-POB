/*6. Cálculo do Salário
Escreva um programa que receba o salário bruto de um funcionário
e o valor de desconto do INSS. O programa deve calcular e exibir o salário líquido.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class SalarioEmpregados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Digite ao salario bruto: ");
        int salbruto = sc.nextInt();
        System.out.print("Informe a % de desconto do INSS(somente números):");
        double porcinss = sc.nextDouble();

        double descinss = (porcinss / 100) * salbruto;
        double salliq = salbruto - descinss;

        System.out.println("O desconto do INSS é:R$" + df.format(descinss));
        System.out.println("Seu salário líquido é:R$" + df.format(salliq));

        sc.close();
    }
}
