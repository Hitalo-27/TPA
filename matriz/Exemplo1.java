import java.util.*;
import java.lang.Math;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int matriz[][] = new int[3][3];


		//preenchimento dos valores
		

		for (int linha = 0; linha <3; linha++)
		 { 
			for (int coluna = 0; coluna < 3; coluna++) {
				matriz[linha][coluna] = (int) (Math.random()*10); 
				System.out.print(matriz[linha][coluna]+" - ");
				
			} 
			
		} 
		
	}
}
