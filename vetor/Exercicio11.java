import java.util.*;
public class Exercicio11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int [10];
        int i, n, r = 0;

        for(i = 0; i<10; i++){
            System.out.println("Informe o numero da" +(i+1)+"ª Posição");
            a[i] = in.nextInt();
        }
        System.out.println("Numeros colocados");
        System.out.println("Informe o numero:");
        n = in.nextInt();

        for(i = 0; i<10; i++){
            if(n==a[i]){
                r++;
                System.out.println("Seu numero está na "+(i+1)+" posição");
            }
        }
        if(r==0){
            System.out.println("Invalido");
        }
    }
}
