package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double alturaMedia,porcentagemMenores = 0, alturaTotal =0;
		int numMenores = 0;
		
		System.out.print("quantas pessoas serao digitadas? ");
		int n = scan.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		for(int i=0; i<n;i++) {
			System.out.printf("dados da %d ª pessoa: ", i+1);
			System.out.println();
			System.out.print("nome: ");
			scan.nextLine();
			String name= scan.nextLine();
			System.out.print("idade: ");
			int idade = scan.nextInt();
			System.out.print("altura: ");
			double altura = scan.nextDouble();
			
			vect[i] = new Pessoa(name, idade, altura);
				
		}
		 
		for(int i =0; i<n; i++) {
			alturaTotal += vect[i].getAltura();
		}
	
		alturaMedia = alturaTotal/n;
		System.out.println();
		System.out.printf("altura media: %.2f\n", alturaMedia);
		
		
		for(int i =0; i<n; i++) {
			if(vect[i].getIdade()< 16) {
				numMenores++;
			}
		}
		
		porcentagemMenores = ((double)numMenores / n) *100;
		
		System.out.printf("pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores);
		
		for(int i =0; i<n; i++) {
			if(vect[i].getIdade()< 16) {
				System.out.println(vect[i].getName());
			}
		}	
		
		scan.close();

	}

}
