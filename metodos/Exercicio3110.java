import java.util.Scanner;
public class Exercicio3110 {
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int e,i=0,j;
		do {
		System.out.println("Digite 1 para fatorial 2 para tabuada 3 para aposentadoria e 4 para potencia");
		e= in.nextInt();
		if(e==1) {
		fatorial();
		}
		else if (e==2) {
		tabuada();
		
		}
		else if(e==3){
			String sexo = new String();
			int idade;
			
			System.out.println("Informe sua idade");
			idade = in.nextInt();
			System.out.println("Informe seu sexo se for mulhar digite f se for homem digite m");
			sexo = in.next();
			aposentadoria(sexo,idade);
			
			
			
		}
		else if(e==4) {
			potencia();
		}
		i++;
		System.out.println("Deseja continuar digite 1 senão digite 2");
		j = in.nextInt();
		if(j==2) {
			System.out.println("FIM");
		}
		}while(j==1);
			

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
	public static int aposentadoria(String sexo, int idade) {
		Scanner in = new Scanner(System.in);
		int r=0;
		if(sexo.equals("f") && idade>=60){
			System.out.println("você ja pode se Aposentar");
			
		}
		else if(sexo.equals("m") && idade>=65){
			System.out.println("você ja pode se Aposentar");
			
		}
		else if (sexo.equals("m")) {
			r = 65 - idade;
			System.out.println("Falta "+r+" anos para você se Aposentar");
			
		}
		else if (sexo.equals("f")) {
			r = 60 - idade;
			System.out.println("Falta "+r+" anos para você se Aposentar");
			
			
			
		}
	return(r);

		
	}
	public static void fatorial() {
		Scanner in = new Scanner(System.in);
		 int n1,n2,r=1,i=0;
		 System.out.println("Digite numero ");
		 n1 = in.nextInt();
		 while(n1>i){
	            n2 = n1-i;
	            r = r * n2;
	           
	            i++;
	           

	        }
		 System.out.println(r);
	}
	

}
