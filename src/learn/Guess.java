package learn;

import java.util.Random;
import java.util.Scanner;

/**
 * @author weber
 * Created by weber on 2016/6/12.
 */
public class Guess {
    public static void main(String[] args) {
        final int size = 100;
        int rand = new Random().nextInt(size);
        int x;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a number guessing game." +
                "Please type in an integer between 0 to " + size + " to " +
                "guess if the number you think matches the system.");
        do {
            x = scanner.nextInt();
            if (x > rand) {
                System.out.println("change a smaller one");
            }
            if (x < rand) {
                System.out.println("change a bigger one");
            }
            count++;

        } while (x != rand);

        System.out.println("Bingo! You guess right!");
        System.out.println("the number is " + x + "," + "You have guessed " + count + " times");
    }
}

//  > < == >= <= !=
//作业：做一个猜数游戏，让用户知道数字是大了还是小了
