/*Exercício 2: construir um programa em Java que leia a idade de uma pessoa e imprima “Maior
de idade”, se a idade lida for maior ou igual a 18 e imprima “Menor de idade”, caso contrário. */

import java.util.Scanner;

public class MaiorMenorIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   

        System.out.printn("Informe sua idade: ");
        int idade = sc.nextInt();
        if((idade>0)&& (idade<=110)){

      
        if( idade>=18){
            System.out.println("Você é maior de idade!");
        }else{
            System.out.println("Você é menor de idade");
        }
  }else{
    System.out.println("Insira uma idade válida!!");
  }
        sc.close();
    }
}