package vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmeticaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] vet = new int[n];
		
		double soma = 0;
		double media;
		int qtdPares = 0;
		
		for(int i=0; i<n; i++) {
			vet[i] = sc.nextInt();
		}
		for(int i=0; i<n; i++) {
			if(vet[i] % 2 == 0) {
				soma = soma + vet[i];
				qtdPares++;
			}
		}
		
		media = soma / qtdPares;
		
	
			System.out.printf("%.1f%n", media);
		
		
		sc.close();
	}

}
