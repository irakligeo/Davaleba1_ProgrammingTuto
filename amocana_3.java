import java.util.Scanner;

/**
 * Created by geolabedu on 10/12/15.
 */
public class amocana_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int count = n / 2;

        for( int i = 0 ; i < count + 1; i ++) {
            String spaces = "";
            String a = "";
            for (int j = 0; j < i; j++) {
                a += "a";
            }
            for (int j = 0; j < count - i; j++)  {
                spaces += " ";
            }
            String toPrint = spaces + a + "a" + a + spaces;
            System.out.println(toPrint);
        }

    }
}
