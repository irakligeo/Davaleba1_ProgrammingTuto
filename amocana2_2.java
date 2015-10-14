import java.util.Scanner;

/**
 * Created by geolabedu on 10/13/15.
 */
public class amocana2_2 {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        IsPalindrome(text);

    }
    public static void IsPalindrome(String text){

        boolean palindrome = false;
        String start= "";
        String end ="";
        if (text.length()%2==0){
            for (int i = 0; i < text.length() / 2; i++) {
                start += "" + text.charAt(i);
            }
            for (int i = text.length()-1; i > text.length()/2-1; i--) {

                end += "" + text.charAt(i);
            }
            if(start.equals(end)){
                palindrome = true;
            }
            System.out.println(palindrome);
        }
        else {
            for (int i = 0; i < text.length() / 2; i++) {
                start += "" + text.charAt(i);
            }
            for (int i = text.length()-1; i > text.length()/2; i--) {

                end += "" + text.charAt(i);
            }
        if(start.equals(end)){
            palindrome = true;
        }
            System.out.println(palindrome);
        }
    }
}
