import java.util.Scanner;


public class watermelon {

    public static void main(String[] args){

        int w;
        
        
        Scanner input = new Scanner(System.in);
       
        w = input.nextInt();

        if (w > 2 && w % 2 == 0){

            System.out.println("Yes");
        }else{
            
            System.out.println("No");
        }
    }
}