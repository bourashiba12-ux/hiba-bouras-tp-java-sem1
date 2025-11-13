public class calcul {
 public static void main(String[] args) {
    Scanner Sc=new Scanner(System in)
    dooble th,n,anc,s;
    System.out.println("donner le nombre d'heure");
    n=Sc.nextdooble();
    System.out.println("donner le taux horaire");
    th=Sc.nextdooble();
    System.out.println("donner le nombre d'année");
    anc=Sc.nextdooble();
    s=n*th;
    if (anc>10){
        s=s+95;
    }
    System.out.println("votre salaire est+"s);


 }   
}
