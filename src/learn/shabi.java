package learn;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by weber on 2016/6/18.
 */
public class shabi {
    public static void main(String[] args) {
        System.out.println("这是一个双人游戏，" + "每个人会玩这个猜数游戏三次，系统将会记录每个人3次猜的总数");
        //加上输入姓名的功能
        int b = 0;
        int c = 0;
        for (int x = 0; x < 6; x++) {
            if (x < 3) {
                int rand = new Random().nextInt(100);
                Scanner scanner = new Scanner(System.in);
                System.out.println("这是一个猜数游戏。您需要在规定的次数内猜出正确的数字。" + "系统将提供一个小于100的正整数"
                        + "如果您的次数超过7次，则会被算作8次");
                int i;
                for (i = 0; i < 7; i++) {
                    int a = scanner.nextInt();
                    if (rand == a) {
                        System.out.println("Bingo!You are right!");
                        break;
                    }
                    if (rand > a) {
                        System.out.println("You may change a bigger number");
                    }
                    if (rand < a) {
                        System.out.println("You may change a smaller number");
                    }
                    System.out.println("你已经猜了" + (i + 1) + "次");
                }
                if (i < 7) System.out.println("你猜了" + (i + 1) + "次");
                else {
                    System.out.println("你是煞笔，回家洗洗睡吧。");
                    System.out.println("正确的数是=" + rand);
                    System.out.println("傻逼！");
                }
                b = b + i + 1;
                System.out.println("你一共猜了" + b + "次");
            }
            if (x == 3) {

                System.out.println("下面有请下一位玩家。");


                int rand = new Random().nextInt(100);
                Scanner scanner = new Scanner(System.in);
                System.out.println("这是一个猜数游戏。您需要在规定的次数内猜出正确的数字。" + "系统将提供一个小于100的正整数"
                        + "如果您的次数超过7次，则会被算作8次");

                int i;
                for (i = 0; i < 7; i++) {
                    int a = scanner.nextInt();
                    if (rand == a) {
                        System.out.println("Bingo!You are right!");
                        break;
                    }
                    if (rand > a) {
                        System.out.println("You may change a bigger number");
                    }
                    if (rand < a) {
                        System.out.println("You may change a smaller number");
                    }
                    System.out.println("你已经猜了" + (i + 1) + "次");
                }
                if (i < 7) System.out.println("你猜了" + (i + 1) + "次");
                else {
                    System.out.println("你是煞笔，回家洗洗睡吧。");
                    System.out.println("正确的数是=" + rand);
                    System.out.println("傻逼！");
                }
                c = c + i + 1;
                System.out.println("你一共猜了" + c + "次");
                System.out.println("上一位玩家一共猜了" + b + "次，加油哦！");
            }

            if (x > 3) {
                int rand = new Random().nextInt(100);
                Scanner scanner = new Scanner(System.in);
                System.out.println("这是一个猜数游戏。您需要在规定的次数内猜出正确的数字。" + "系统将提供一个小于100的正整数"
                        + "如果您的次数超7次，则会被算作8次");

                int i;
                for (i = 0; i < 7; i++) {
                    int a = scanner.nextInt();
                    if (rand == a) {
                        System.out.println("Bingo!You are right!");
                        break;
                    }
                    if (rand > a) {
                        System.out.println("You may change a bigger number");
                    }
                    if (rand < a) {
                        System.out.println("You may change a smaller number");
                    }
                    System.out.println("你已经猜了" + (i + 1) + "次");
                }
                if (i < 7) System.out.println("你猜了" + (i + 1) + "次");
                else {
                    System.out.println("你是煞笔，回家洗洗睡吧。");
                    System.out.println("正确的数是=" + rand);
                    System.out.println("傻逼！");
                }
                c = c + i + 1;
                System.out.println("你一共猜了" + c + "次");
                System.out.println("上一位玩家一共猜了" + b + "次，加油哦！");

            }
        }
        if (b < c) {
            System.out.println("第一位玩家获胜！");
        }
        if (b > c) {
            System.out.println("第二位玩家获胜！");
        }
        if (b == c) {
            System.out.println("两个傻逼，你们平局了!");
        }
        System.out.println("第一位玩家猜的次数为" + b + "次,"
                + "第二位玩家猜的次数为" + c + "次。");
    }
}




