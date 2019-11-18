import java.util.Scanner;
public class Avaliacao1 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int m;
		double v;
		System.out.println("Informe o valor");
		v = in.nextDouble();

		System.out.println("Informe os meses");
		m = in.nextInt();
				
		System.out.println(juros(v,m)); 
		
		
	}
	public static double juros (double v ,int m ) {
		Scanner in = new Scanner(System.in);
        for(int i = 1; i <= m;i++){
		v += v*1/100;
		
        }

		

			
		return v;	
		}
	
		
	}


