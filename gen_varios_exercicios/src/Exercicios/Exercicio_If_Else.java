package Exercicios;

import java.util.Scanner;

public class Exercicio_If_Else {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		n1 = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		n2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		n3 = sc.nextInt();
		
		int soma = n1 + n2;
		
		if (soma > n3) {
			System.out.println("A soma de "+ n1+" e "+ n2 +" eh maior que "+ n3);
		} else if (soma < n3) {
			System.out.println("A soma de "+ n1+" e "+ n2 +" eh menor que "+ n3);
		}else {
			System.out.println("A soma de "+ n1+" e "+ n2 +" eh igual ah "+ n3);
		}
		
	}
	
}
