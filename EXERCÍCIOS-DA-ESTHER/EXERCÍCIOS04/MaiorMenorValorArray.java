import java.util.Scanner;

public class MaiorMenorValorArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Cria um array para guardar 5 números inteiros
        int[] numeros = new int[5];

        System.out.println("Por favor, digite 5 números inteiros:");

        //guarda no array
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // O primeiro número do array é usado como ponto de partida
        int maior = numeros[0];
        int menor = numeros[0];

        
        for (int i = 1; i < 5; i++) {
    
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
         
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // 5. Exibe os resultados
        System.out.println("\nO maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        sc.close();
    }
}