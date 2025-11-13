package debug;

import java.util.Scanner;

public class debugexemple5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer un nombre entier :");
        int n =sc.nextInt();
        int somme=0;
        for(int i=1;i<=n;i++);{
            somme=somme+i;
        }
System.out.println("la sommme des entiers de 1a"+n+"est"+somme);
sc.close();
    }
}
