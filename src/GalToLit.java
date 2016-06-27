import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Serge on 27.06.2016.
 */
public class GalToLit {
    public static void main(String[] args) {
        Double Gal, Kf = 3.78541178;
        Scanner Scn = new Scanner(System.in);
        System.out.print("Enter gal.: ");
        Gal = Scn.nextDouble();
        System.out.println(Gal+" gal. = "+(Gal*Kf)+" lit.");
    }
}
