import java.util.Scanner;

public class saisibuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("veuilez saisir une phrase /");
        String ch2 = sc.nextLine();
        StringBuffer ch = new StringBuffer(sc.nextLine());
        System.out.println("le contenu du StingBuffer est:"+ch);
        sc.close();
    }
}
