package com.company;

import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/23.
 */
public class logicalstatement {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        Scanner money = new Scanner(System.in);
        int a = age.nextInt();
        int m = money.nextInt();
//        if (a > 18 && m > 500) {
//            System.out.println("welcome!");
//  and operator

//        if (a > 18 || m > 500) {
//            System.out.println("welcome");
//        or operator
        if (!(a > 18)) {
            System.out.println("too young");
        } else {
            System.out.println("welcome");
        }
    }
}


