import java.util.Scanner;

public class ex3 {
    public  static int  lectureN(){
        Scanner sc = new Scanner(System.in);
    
       int n;
        do { 
            System.out.println("enter un entier positif :");
            n = sc.nextInt();
        } while (n<0);  
        return n;                  
    }
    public static int calculeSomme(int n){
        int s =0 ;
        for(int i = 1 ; i <= n ; i++){
            s = s + i*i ;
        }
        return s;
    }
    public static void main(String[] args) {
        int x =lectureN();
        int somme = calculeSomme(x);
        System.out.println("La somme des carrés des entiers " + x + " est: " + somme);
    }
}
