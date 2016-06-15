package learn;

import java.util.Scanner;

/**
 * Created by weber on 2016/6/15.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("R=");
        int R = scanner.nextInt();
        System.out.println("n=");
        int n = scanner.nextInt();
        int r = R;
        for (int i = 1; i < n; i++) {
            R = R * r;
        }

        System.out.println("S= " + R);
    }

}

