import java.util.Scanner;

public class parité {
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for (int i=0 ; i<11 ; i++){
            int x = LectureN();
            if(EstPair(x)==true){
                System.out.println("est paire");
            }
            else{
                System.out.println("est impair");
            }

        }
       
    }
}
