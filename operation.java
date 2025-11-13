public class operation{
    public static void main(String[] args) {
        int A=6,B=21;
        boolean Res;
        Res=A>B;
        System.out.println("A>B?"+Res);//false
        Res=!(A>B);
        System.out.println("!(A>B?)"+Res);//true
        Res=A<B;
        System.out.println("A>B?"+Res);//true
        Res=A==B;
        System.out.println("A==B?"+Res); //false
        Res=A!=B;
        System.out.println("!(A!=B?)"+Res); //true
        Res=(A<B)&(A==B);
        System.out.println("(A<B)&(A==B)?"+Res); //false
        Res=(A<B)^(A==B);
        System.out.println("(A<B)^(A==B)?"+Res); //true
       Res=(A<B)|(A==B); 
       System.out.println("(A<B)|(A==B)"+Res); //true
       Res=A<B?true :false ;
       System.out.println("A<B?true :false"+Res);//falsetrue
    }
}
