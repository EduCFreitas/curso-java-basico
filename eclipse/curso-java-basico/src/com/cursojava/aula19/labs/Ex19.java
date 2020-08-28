package com.cursojava.aula19.labs;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] result = new double[notas2.length];
		
		for(int i=0; i<notas1.length; i++) {
			System.out.println("Informe as notas do aluno " + (i+1) + " separadas por espaço: ");
			notas1[i] = scan.nextDouble();
			notas2[i] = scan.nextDouble();
			result[i] = (notas1[i]+notas2[1])/2;
		}
		
		for(int i=0; i<result.length; i++) {
			System.out.print("Aluno " + (i+1) + ": Nota 1: " + notas1[i] + " | Nota 2: " + notas2[i] + " | Média: " + result[i]);
			if(result[i]>=7) {
				System.out.println(" | Situação: APROVADO");
			}else {
				System.out.println(" | Situação: REPROVADO");
			}
		}
		scan.close();

	}

}
