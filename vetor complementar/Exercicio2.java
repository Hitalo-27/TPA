import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		
		int t;
		int a[] = new int [20];
		
		
		for(int i3=1; i3<=5; i3++) {
			System.out.println("Digite o valor " +i3);
			t = in.nextInt();
			for(int i=0; i<10; i++) {
		
			a[i] = t* (i+1);
				
				}
			for(int i2 = 0; i2<10; i2++) {
				System.out.println("\n"+a[i2]);	
				
			}
			
			}
					
		}
		
	}