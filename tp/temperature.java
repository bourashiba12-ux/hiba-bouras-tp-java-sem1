package tp;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner Sc = new Scanner (System.in);
        double x;
        system .out.println("donnedr une temperateur ");
        x=Sc.nextDouble();
        if( x<0){
            system .out.println("GLACE  ");

        }
        else if (x<100){
            system .out.println("eau ");

        }
        else{
            system.out.println("vapeur ");

        }
    }
}
