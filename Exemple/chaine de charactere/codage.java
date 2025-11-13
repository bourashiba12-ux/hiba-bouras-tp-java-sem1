import java.util.Scanner;

public class codage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       String ch, code ="";
       System.out.println("entrer une chaine" );
       ch=sc.nextLine();
       for (int i=0 ; i<ch.length();i++){
        char c =ch.charAt(i);
       if(c >= "a" && cn<="z"){
        c=(char)((c-"a"+3)%26+"a");
       }
       


            
        }
    }
}
