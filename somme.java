import java.util.Scanner;

public class somme {
    public static void main(String[] args) {
        Scanner.sc=new scanner (System.in);
        int j,i,s,n;
        i=0;
        do{
            System.out.println("donner un nombre positive ");
            n=sc.nextInt();
            i=i+1;}
        while(n>0);
        s=0;
        for (j=1;j<=n;j++){
            s=s+j;
        }
        
    }
}
