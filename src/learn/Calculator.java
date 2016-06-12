package learn;

import javax.swing.*;
import java.util.Scanner;

/**
 * @author weber
 * Created by weber on 2016/6/12.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, j;
        System.out.println("this is a plus process");
        System.out.println("first is:");
        i = scanner.nextInt();
        System.out.println("second is:");
        j = scanner.nextInt();
        System.out.println("the sum is:" + (i + j));
    }
}
