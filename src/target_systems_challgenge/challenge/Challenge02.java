package target_systems_challgenge.challenge;

import java.util.Scanner;

public class Challenge02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int numero = scanner.nextInt();
		scanner.close();

		if (isFibonacci(numero)) {
			System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
		}
	}

	public static boolean isFibonacci(int n) {
		int a = 0, b = 1;
		while (a <= n) {
			if (a == n) {
				return true;
			}
			int temp = a;
			a = b;
			b = temp + b;
		}
		return false;
	}

}
