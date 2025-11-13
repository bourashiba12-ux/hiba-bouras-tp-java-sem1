import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercice8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = sc.nextLine();
        phrase = phrase.toLowerCase();
        String[] mots = phrase.trim().split("\\s+");
        System.out.println("\nLes mots de la phrase sont :");
        for (String mot : mots) {
            System.out.println(mot);
        }
        Map<String, Integer> occurrences = new HashMap<>();

        for (String mot : mots) {
            occurrences.put(mot, occurrences.getOrDefault(mot, 0) + 1);
        }
        System.out.println("\nNombre total de mots : " + mots.length);
        System.out.println("\nOccurrences de chaque mot :");
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close(); 
    }
}
