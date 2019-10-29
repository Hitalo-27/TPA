import java.util.Scanner;
public class ExercicioD24Cruzada {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a[] [] = new int [5] [5];
		 int p=2;
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			a[i][j] = in.nextInt();
						}	
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
		if(i == j) {
			
			System.out.println(a[i][j]);
		}
		else {
			
		}
		}

		}
		for(int i=2 ;i<5;i++) {
			System.out.println(a[i][p]);

			p--;
		
		}


		}
	}
	
