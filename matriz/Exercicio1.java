import java.util.*;
import java.lang.Math;

public class Exercicio1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[] [] = new int [4] [4];
	    int i,j,r =1;
	    a[0][0] = 2;
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
				
				r = r * a[0][0];
				a[i][j] = r;
				System.out.print("["+a[i][j]+" ]");
				
			}
			
			if(j==4) {
				System.out.print("\n");
			
		}
		
		}
	}
}
