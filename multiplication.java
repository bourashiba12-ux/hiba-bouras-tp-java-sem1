import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("entrez un nombre compris entre 1et10:");
        int n =sc.nextInt();
        if (n>=1&&n<=10){
            System.out.println("table de multiplication de "+n+": ");
            for ( int i =1;i<=10;i++){
                System.out.println(n+"x"+i+"="+(n*i));

            }
            

        }
        else {
            System.out.println("nombre invalide!");
            
        }
    }
}
