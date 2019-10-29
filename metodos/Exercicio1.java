import java.util.Scanner;
public class Exercicio1 {
	public static void main (String[]args) {
		potencia();
		
		
	}
	public static void potencia () {
		Scanner in = new Scanner(System.in);
		int n,i=0,s=0;
		System.out.println("Informe o numero");
		n = in.nextInt();
		
		for(i=0;i<4;i++) {
			s += n*n;
			
			
		}
		System.out.println(s);
		
	}

}
