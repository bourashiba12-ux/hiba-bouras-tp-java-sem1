import java.util.Scanner;

public class exercice6 {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("entrez un verbe du premier groupe:");
    String verbe =sc.nextLine().toLowerCase();
    if (!verbe .endsWith("er") || verbe.equals("aller")){
      System.out.println("n'est pas un verbe regulierdu premier groupe !");
      
    }
    else{
      String radical =verbe.substring (0,verbe.length()-2 );
      System.out.println("\nconjugaison du verbe \" "+verbe+ "\"au present l'inducatif");
      System.out.println("Je"+radical+"es");
      System.out.println("TU"+radical+"es");
      System.out.println("Il/Elle"+radical+"e");
      System.out.println("Nous"+radical+"ons");
      System.out.println("vous"+radical+"ez");
      System.out.println("Ils/Elles"+radical+"ent");

    }sc.close();
    
  }
}
