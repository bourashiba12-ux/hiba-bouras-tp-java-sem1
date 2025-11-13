import java.util.Scanner;
public class permutation {
public static void main(String[] args) {
Scanner Sc=new Scanner(System.in);
 int a;
 int b;
 int aux;
 System.out.println("donner a");
 a=Sc.nextInt();
 System.out.println("donner b");
 b=Sc.nextInt();
 aux=a;
 a=b;
 b=aux;
 System.out.println("la nouvelle de a est"+a);
 System.out.println("la nouvelle de b est"+b);

}
    
}