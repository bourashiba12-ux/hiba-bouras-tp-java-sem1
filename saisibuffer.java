import java.util.Scanner;

public class saisibuffer {
    public static void main(String[] args) {
        Scanner Sc = new scanner(System.in);
        System.out.println("veuilez saisir une phrase /");
        String ch2 = sc.nextLine();
        StringBuffer ch = new StringBuffer(ch2);
        System.out.println("le contenu du StingBuffer est:"+ch);
        sc.close();
    }
}
