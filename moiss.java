import java.util.Scanner;

public class moiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("entrer le numéro du mois:");
            int mois=sc.nextInt();
            System.out.println("entrer l'année:");
            int année=sc.nextInt();
            int jours;
            switch (mois) {
                case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                jours= 31;

                break;
                case 4:case 6:case 9:case 11:
                jours=30;
                break;
                case 2:
                // verifier si l'année est bissextile;
                if ( ((année % 4)==0 )&& (année%100!=0)||(année %400==0)) {
                    jours=29;
                }
                else{
                    jours=28;
                }
                default:
                System.out.println("erreur");
            }

        



   }
}
