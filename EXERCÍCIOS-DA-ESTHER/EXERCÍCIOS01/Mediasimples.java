
/*4. Cálculo de Média Simples
Faça um programa que solicite ao usuário três notas
(valores decimais) e exiba a média aritmética delas.*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Mediasimples {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Informe a primeira nota");
        double nota1 = sc.nextDouble();
        System.out.println("Informe a segunda nota");
        double nota2 = sc.nextDouble();
        System.out.println("Informe a terceira nota");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média:" + df.format(media));
    }
}
