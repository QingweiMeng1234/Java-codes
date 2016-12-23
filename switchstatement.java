package com.company;

import java.time.MonthDay;
import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/23.
 */
public class switchstatement {
    public static void main(String[] args) {
//        Scanner day = new Scanner(System.in);
//        int d = day.nextInt();
//        switch (d) {
//            case 1:
//                System.out.println("monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
        Scanner day = new Scanner(System.in);
        int d = day.nextInt();
        switch (d){
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("weekday");
    }
}
}
