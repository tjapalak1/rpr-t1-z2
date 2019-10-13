package ba.unsa.etf.rpr;
import java.util.Scanner;


public class Main
{
    static int sumacifara(int n)
    {
        int suma=0;
        do {
            suma+=n%10;
            n/=10;
        }while(n!=0);
        return suma;k
    }

    public static void main(String[] args)
    {
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        int n;
        n = ulaz.nextInt();
        for(int i=1;i<n;i++)
        {
            if(i%sumacifara(i)==0)
                System.out.println(i);
        }

    }
}
