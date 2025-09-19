/*Exercício 4: Média de notas de uma turma

Descrição:
Desenvolva um programa que calcule a média das notas de uma turma, onde
o usuário informe quantos alunos há na turma e suas respectivas notas.
Requisitos:
• O programa deve solicitar a quantidade de alunos.
• Deve utilizar um loop for para receber as notas de cada aluno.
• Utilizar um acumulador para somar todas as notas.
• No final, exibir a média da turma.*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class SomaTurma
{
    
	public static void main(String[] args) {
	    
	    Scanner sc= new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat("#.00");
	    
		System.out.println("Informe a quantidade de alunos:");
		int qtalunos = sc.nextInt();
		double somatotnotas;
	    double somaTotalNotas = 0.0; // Inicializa o acumulador fora do loop
        
        for (int i = 1; i <= qtalunos; i++) { // Loop para cada aluno
            System.out.println("Informe a nota do aluno " + i + ":");
            double nota = sc.nextDouble();
            somaTotalNotas += nota; // Acumula a nota de cada aluno
        }
        
        double mediaTurma = somaTotalNotas / qtalunos;
        
        System.out.println("A média de notas da turma é: " + df.format(mediaTurma));
        
        sc.close();
}}
