import java.util.Scanner;

/**
 * Created by geolabedu on 10/13/15.
 */
public class amocana2_3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int shift = scanner.nextInt();
        cesar(text,shift);

    }
    public static void cesar(String text, int shift){
        String str = "";
        if(shift>25||shift<-25){
            System.out.println("shemoitanet biji 25 dan -25 is shualedshi!");
        }
        else {
            for (int i = 0; i < text.length(); i++) {

                str += text.charAt(i);

            }
            System.out.println(str);
        }
    }
}
