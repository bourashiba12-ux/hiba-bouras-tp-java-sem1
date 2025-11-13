import java.util.Scanner;

public class fonction {
     public static boolean EstPair(int x){
        if (x%2==0 ){
            return true ;
        }
        else{
            return false;
        }
    }
    public static int LectureN (){
        Scanner sc=new Scanner(System.in);
        int x ;
        do{
            System.out.println("donner un entier ");
            x=sc.nextInt();
        }while(x<0);
        return x;
    }
}
