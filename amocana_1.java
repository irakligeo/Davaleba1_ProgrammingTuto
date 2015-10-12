import java.util.Scanner;

/**
 * Created by geolabedu on 10/12/15.
 */
public class amocana_1 {
    public static void main( String [] ika){

        System.out.println("sheiyvanet mnishvnelobebi: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double z = Math.pow(x, 2) + Math.pow(y, 2);
        double result = Math.sqrt(z);

        System.out.println("pasuxi:" + result);
    }
}
