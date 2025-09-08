/*Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distC"ncia entre eles.

FC3rmula: D = sqrt((x2 - x1)B2 + (y2 - y1)B2)*/

import java.util.Scanner;

public class Dist2Pontos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados do primeiro ponto: ");
		System.out.print("X: ");
		int x1 = sc.nextInt();
		System.out.print("Y: ");
		int y1 = sc.nextInt();
		System.out.print("(" + x1 + "," + y1 + ")");
		System.out.println("Informe os dados do segundo ponto: ");
		System.out.print("X: ");
		int x2 = sc.nextInt();
		System.out.print("Y: ");
		int y2 = sc.nextInt();
		System.out.print("(" + x2 + "," + y2 + ")");

		double distpontos = (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

		System.out.println(Math.sqrt(distpontos));

		sc.close();
	}
}
