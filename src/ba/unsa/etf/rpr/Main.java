package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    private static int sumaCifara (int n) {
        int s=0;
        while (n>0) {
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Unesi broj n: ");
        Scanner ulaz=new Scanner(System.in);
        n=ulaz.nextInt();
        System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara u opsegu od 1 do " + n + " su: ");
        for (int i = 1; i <= n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i + " ");
        }
    }
}
