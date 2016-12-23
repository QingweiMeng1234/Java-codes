package com.company;

import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/23.
 */
public class elseif {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);
        final int i = age.nextInt();
        if (i <= 0) {
            System.out.println("error");

        }
        else if(i <= 16) {
            System.out.println("too young!");
        }
        else if(i < 100) {
            System.out.println("Welcome!");
        }else{
            System.out.println("really?");
        }
    }
}