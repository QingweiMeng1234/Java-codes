package com.company;

/**
 * Created by lenovo on 2016/12/23.
 */
public class loopcontrol {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break;

            }
            System.out.println(i);
        }
        System.out.println("Weber is cool");
        for (int j = 0; j < 5 ; j++) {
            if (j==2 || j==3){continue;

        }
            System.out.println(j);
            System.out.println("weber is very cool");
        }

    }
}
