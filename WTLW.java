import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class WTLW {

    public static void main(String[] args) {

        char[] word = new char[30];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < word.length; i++) {

            word= input.next().toCharArray();
            
            
            char[] Firstword = Arrays.copyOfRange(word, 0, 1);
            char[] hexWord = Arrays.copyOfRange(word, 1, word.length - 1);
            char[] lastWord = Arrays.copyOfRange(word, word.length - 1 , word.length);



            System.out.println(Firstword);
            System.out.println(hexWord);
            System.out.println(lastWord);

            
        }
       


    }
    
}
