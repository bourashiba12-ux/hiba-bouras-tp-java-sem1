import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int s = 0;
        do {
            System.out.println("donner chaine");
            ch = sc.nextLine();
        } while (ch.length() > 30);
        for (int i = 0; i < ch.length(); i++) {
            char c = ch.charAt(i);
            if (Character.isLowerCase(c)) {
                s++;
            }
        }
        System.out.println("le nombre en mnuscille" + " " + s);
    }
}
