import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 12/28/2018.
 */
public class Main {
    public static void main(String[] args) {
        String input;
        System.out.println("Enter a word to be checked if it follows 'i before e, except after c'. ");
        System.out.println("Enter '!' to quit.");
        while(true) {
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if(input.equals("!")) break;
            System.out.println(input + " => " + check(input));
        }
    }

    private static boolean check(String string) {
        for(int i = 0; i < string.length() - 1; i++) {
            char charOne = string.charAt(i);
            char charTwo = string.charAt(i + 1);
            if(charOne == 'i' && string.charAt(i + 1) == 'e') {
                if(i == 0);
                else if(string.charAt(i - 1) == 'c') return false;
            }
            if(charOne == 'e' && string.charAt(i + 1) == 'i') {
                if(i == 0) return false;
                else if(string.charAt(i - 1) != 'c') return false;
            }
        }
        return true;
    }
}
