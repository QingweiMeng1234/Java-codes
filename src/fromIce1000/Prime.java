package fromIce1000;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        int aa;
        Scanner in = new Scanner(System.in);
        System.out.println("小同学，你需要几个质数啊？");
        aa = in.nextInt();
        int[] a = new int[aa];
        int i = 2, k, index = 0, n;
        boolean is;
        a[0] = 2;
        while (index < aa) {
            is = true;
            k = i;
            for (n = 0; a[n] <= Math.sqrt(k); n++)
                if (k % a[n] == 0) {
                    is = false;
                    break;
                }
            if (is) {
                a[index] = i;
                index++;
            }
            i++;
        }
        n = 0;
        for (int j : a) {
            System.out.printf("|%8d", j);
            if (n % 15 == 0) printDivider();
            n++;
        }
        printDivider();
        System.out.println("\n输出完嘞~");
        in.close();
    }

    public static void printDivider() {
        System.out.println("|\n----------------------------------------------------" +
                "------------------------------------------------------------------------------------");
    }
}