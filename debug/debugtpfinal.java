import java.util.Scanner;
public class activite5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner une phrase : ");
        String ch = sc.nextLine();
        int nbMots = 0;
        int nbvoyelles = 0;
        String ch1 = " ";
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'Y') {
                nbvoyelles++;
            }
            if (c == ' ') {
                nbMots++;
            }
        }
        System.out.println("nbre de mots :" + (nbMots + 1));
        System.out.println("nbre de voyelles :" + nbvoyelles);
        sc.close();
    }
    
}
    
