import java.util.*;
import java.lang.Math;

public class Exercicio3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] [] = new int [3] [4];
	    int i,j,r = 0;
		for(r=0,i=0;i<3;i++) {
			for(r=0,j=0;j<3;j++) {
				System.out.println("\nEntra valor ["+(i+1)+"] ["+(j+i)+"] :");
				a[i][j] = in.nextInt();
				r = r + a[i][j] ;
				if(j==2) {
					a[i][j] = r;
					System.out.print("["+a[i][j]+"]");
				
			}
			
			
		}
			
		
		}
		
	}
}
