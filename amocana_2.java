import java.util.Scanner;

/**
 * Created by geolabedu on 10/12/15.
 */
public class amocana_2 {
    public static void main (String [] args) {
        System.out.println("shemoitanet nebismieri n ricxvi :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = 1;
        while (n > 1) {
            if (n % 2 == 0) {
                System.out.println("ricxvi luwia amitom vaketebt n/2" + " " + (n /= 2));
                k++;

            } else {
                System.out.println(n + " " + "ricxvi kentia amitom vaketebt 3n+1" + " " + (n * 3 + 1));
                n = n * 3 + 1;
                k++;
            }
        }
        System.out.println("bijebis raodenoba aris:" + " " + k);
    }
}
