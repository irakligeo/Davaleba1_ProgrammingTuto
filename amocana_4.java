import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by geolabedu on 10/12/15.
 */
public class amocana_4 {
    public static void main(String [] args) {

        Scanner specialuri = new Scanner(System.in);

        System.out.println("sheiyvanet secialuri simbolo:");
        int n = specialuri.nextInt();
        System.out.println("sheiyvanet namdvili ricxvebi: ");


        int input = specialuri.nextInt();
        int max = input;
        int min = input;
        if (n == input) {
            System.out.println("sheyvanilia specialuri simbolo");

        } else {
            while (n != input) {
                if (input > max) {
                    max = input;
                }
                if (input < min) {
                    min = input;
                }
                input = specialuri.nextInt();

            }
            System.out.println("maximaluri ricxvia:" + max);
            System.out.println("minimaluri ricxvia:" + min);

        }
    }

    }
