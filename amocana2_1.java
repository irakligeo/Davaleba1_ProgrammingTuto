import java.util.Scanner;

/**
 * Created by geolabedu on 10/12/15.
 */
public class amocana2_1 {
    public static void main ( String [] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        acronym(text);
    }
    public static void  acronym(String text) {

        String acro = "" + text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {

                acro = acro + text.charAt(i+1);
            }
        }
        System.out.println(acro);
    }
}
