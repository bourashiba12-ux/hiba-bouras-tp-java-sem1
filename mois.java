import java.util.Scanner;

public class mois {
    public static void main(String[] args) {
        Scanner sc=new Scanner(system.in);
        int n;
        System.out.println("donner un entier de 1 à 12");
        n=sc.nextInt();
        switch (n) {
            case 1 :System.out.println("le mois est janvier ");
                
                break;
            case 12 :System.out.println("le mois est december ");
                break;
        
            default:
                   System.out.println("saisir invalide");
                break;
        }
    }
}
