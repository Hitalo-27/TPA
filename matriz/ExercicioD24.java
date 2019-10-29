import java.util.*;
public class ExercicioD24 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		
		int a[] [] = new int [5] [5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
			System.out.println("Informe o numero");
			a[i][j] = in.nextInt();
						}	
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
		if(i == j) {
			
			System.out.println(a[i][j]);
		}
		else {
			
		}
		}

		}
	}
	
}