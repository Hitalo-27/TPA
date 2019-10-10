import java.util.*;
public class Exercicio3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a [] = new int [10];
		int t = 0;

		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+"º valor");
			a[i] = in.nextInt();

			for(int i2 = 1; i2 <= a[i]; i2++) {
				if(a[i] % i2 == 0) {
					t++;

				}
			}
			if(t == 2) {
				System.out.println("É primo");
			}
			else {
				System.out.println("Não é primo");
			}
			t = 0;
		}

	}
}