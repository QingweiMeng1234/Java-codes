package learn;

import java.util.Scanner;

/**
 * @author weber
 *         Created by weber on 2016/6/13.
 */
public class FunctionExercise {

    public static void main(String[] args) {
//        p("Hello world");
//        p("Hello Node");
//        p("Hello Java");
//        p("Hello Kotlin");
//        p("Hello Ruby");
//        p("Hello C");
//        p("Hello Machine Learning");

//        p(f(40));
//        f(100.0);
//        Prime.main(new String[0]);
        String[] fuckers = new Scanner(System.in).nextLine().split(" ");
        int[] a = new int[fuckers.length];
        for (int i = 0; i < fuckers.length; i++)
            a[i] = Integer.parseInt(fuckers[i]);
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void p(Object s) {
        if (s instanceof String ||
                s instanceof Integer ||
                s instanceof Double ||
                s instanceof Float ||
                s instanceof Short ||
                s instanceof Long ||
                s instanceof Character) {
            System.out.println(s);
        } else {
            System.out.println(s.toString());
        }
    }

    static double f(double x) {
        for (int i = 0; i < x; i++)
            System.out.println("counting, now value is " + i);
        System.out.println(3 * x);
        return 3 * x;
    }

    static void bubbleSort(int[] a) {
        int temp;
        for (int i = 0; i < a.length; ++i) {
            for (int j = a.length - 1; j > i; --j) {
                if (a[j] < a[j - 1]) {
                    temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    int main(int argc, String[] argv) {
        return 0;
    }
}


/*
* f(x) ->
* static double f(double x) {
*   // do some calculations
* }
*
* p(f(x));
*
* */
