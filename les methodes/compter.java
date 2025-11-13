import java.util.Scanner;

public class compter {

 
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }
    public static int compter(int n) {
        int compteur = 0;
        while (n > 0) {
            n = n / 10;
            compteur++;
        }
        return compteur;
    }
    public static void main(String[] args) {
        int nombre = lectureN();
        int nbChiffres = compter(nombre);
        System.out.println("Le nombre contient " + nbChiffres + " chiffre(s).");
    }
}
