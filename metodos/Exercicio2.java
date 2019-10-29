import java.util.Scanner;
public class Exercicio2 {
	public static void main (String[]args) {
		tabuada();
		
		
	}
	public static void tabuada () {
		Scanner in = new Scanner(System.in);
		int n,i=0,s=0;
		System.out.println("Informe o numero");
		n = in.nextInt();
		
		for(i=0;i<=10;i++) {
			s = n*i;
			System.out.println(n+"x"+i+"="+s);
			
		}

		
	}

}