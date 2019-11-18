import java.util.Scanner;
public class Avaliacao2 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int n;
		double t;
		
		System.out.println("Informe o valor total");
		t = in.nextDouble();
		System.out.println("Informe a foma de pagamento sendo: \n 1= a vista com 10% de desconto \n 2 = Em duas vezes \n 3 = De 3 ate 10 vezes com 3 % de juros ao mes (somente para comprar acima de 100 reais ");
		n = in.nextInt();
		menu(n,t);
		

		
				
		
	}
	public static int menu (int n ,double t) {
		int v,j;
		Scanner in = new Scanner(System.in);
		if(n==1) {
		System.out.println("o valor do pagamento será"+opcao1(t));
			
			
		}
		else if (n==2) {
		System.out.println("o valor será duas vezes de" +opcao2(t));
		
		
		}
		else if(n==3){
			if(t>100) {
				System.out.println("selecione em quantas veses vc ira pagar de 3 ate 10 vezes");
				v = in.nextInt();
				if(v >= 3 && v<=10){
					System.out.println("o valor parelado em "+v+"vezes deu "+opcao3 (t,v));
				
					
				}
				else {
					System.out.println("so e possivel parcelar de 3 a 10 vezes");
				}
			
			}
			else {
				System.out.println("o valor deve ser acima de 100 reais");
			}
			
			
			

		}
		else{
			System.out.println("invalido");
		}
		return n;
	}
	public static double opcao1 (double t) {
		
		t -= t*10/100;
		
		
		return t;
		
		
		
		
		
	}
	public static double opcao2 (double t) {
		t = t/2;
		
		return t;
		
		
		
		
		
	}
	public static double opcao3 (double t , int v) {
	    for(int i = 3;i <=v;i++) {
	    	t += t*3/100;
	    }
		

		return t;
		
		
}
		
		
	
}
