import java.util.Random;
public class Exercicio2 {
	public static void main(String[]args) {
		Random input = new Random();
		
		int a[][] = new int [3][3], ma = 0,me=0,l = 0,c=0, lN = 0,cN = 0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			System.out.print("<=>");	
			a[i][j] = input.nextInt();
			
			 ma = a[0][0];
		 	 me = a[0][0];
			}
		}
		 	for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {	
				if ( ma < a[i][j] ) {
					ma =	a[i][j];

					l = i;
					c = j;
							
				}				
				
				if ( me > a[i][j] ) {
					me = a[i][j];
					
					  lN = i;
					  cN = j;
				
				}
				
			}
		 	
		}
		 	System.out.println("O numero Maior é:  ["+ma+"] | coluna  "+(c+ 1)+" linha "  + l);
		 	System.out.println(" O número Menor é:  ["+me+"] |  coluna "+(cN +1)+"  linha  "+lN);
	}
}