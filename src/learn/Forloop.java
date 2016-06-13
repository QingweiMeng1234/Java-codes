package learn;

import java.util.Scanner;

/**
 * @author weber
 *         Created by weber on 2016/6/13.
 */
public class ForLoop {
    public static void main(String[] args) {
//        int[] a = new int[3456];
//        int i = 0;
//        while(i < a.length) {
//            a[i] = i;
//            System.out.println("i = " + i);
//            i++;
//        }
//        i = 0;
//        while(i < a.length) {
//            System.out.println("a[" + i + "] = " + a[i]);
//            i++;
//        }
//        int j = 0;
//        while(j < 100) {
//            // codes
//            j++;
//        }
//
//        for(int k = 0; k < 100; k += 10) {
//            // codes
//        }
//        Scanner scanner = new Scanner(System.in);
//        int x = scanner.nextInt();
//        int a = 0, i = 0;
//        while (i <= x) {
//            a = a + i;
//            i++;
//        }
//        for (int j = 0; j < x; j++) {
//            a = a + j;
//        }
//        System.out.println("sum=" + a);
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();
        int min = 1000, a;
        for (int i = 0; i < cnt; i++) {
            a = scanner.nextInt();
            if (a <min) {
                min = a;
            }
        }
        System.out.println("the min value is: "+min);
    }

}