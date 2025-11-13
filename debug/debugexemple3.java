package debug;

import java.io.StreamTokenizer;
import java.util.StringTokenizer;

public class debugexemple3 {
    public static void main(String[] args) {
        String phrase="java est amusant";
        StringBuffer sb =new StringBuffer(phrase);
        sb.reverse();
        System.out.println("phrase inversée :"+sb);
        StringTokenizer st =new StringTokenizer(phrase," ");
        int compteur=0;
        while (st.hasMoreTokens()) {
            String mot =st.nextToken();
            compteur++;

        }
        System.out.println("nombre de mots :"+compteur);

    }
}
