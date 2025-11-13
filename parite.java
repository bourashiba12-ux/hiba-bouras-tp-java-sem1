import java.util.Scanner;

public class parite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
         do {
            System.out.print("Entrez un entier non nul : ");
             n = sc.nextInt();
            if (n == 0) {
                System.out.println("Le nombre ne doit pas être nul !");
            }
        } while (n== 0);
        if (n % 2 == 0) {
            System.out.println("Le nombre " + n+ " est pair.");
        } else {
            System.out.println("Le nombre " + n + " est impair.");
        }

        sc.close();
    }
}
