package com.cursojava.aula13.labs;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double tamanhoArquivo = 0;
		double velocidadeDownload = 0;
		double tempoDownload = 0;
		
		System.out.println("Informe o tamanho do arquivo a ser baixado, em MB: ");
		tamanhoArquivo = scan.nextDouble();
		System.out.println("Informe a velocidade de download, em Mbps: ");
		velocidadeDownload = scan.nextDouble();
		tempoDownload = tamanhoArquivo / (velocidadeDownload * 60);
		
		System.out.println("O download do arquivo " + tempoDownload + " minutos.");
		scan.close();

	}

}
