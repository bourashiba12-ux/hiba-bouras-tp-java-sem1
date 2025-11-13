import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrez un entier positif: ");
        int n = sc.nextInt();
        long fact=1;
        for (int i =1;i<=n;i++){12
            fact *=i;
        }
        System.out.println(n+"!="+fact);
        
    }
}
