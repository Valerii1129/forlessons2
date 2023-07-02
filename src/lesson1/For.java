package lesson1;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int ownNumber = -1;
        while (true) {
            System.out.println("Enter your number from 0 to 10:");
            ownNumber = scnr.nextInt();// from 0 to 10
            if (ownNumber > 10 || ownNumber < 0) {
                System.out.println("You should enter from 0 to 10.");
            } else {
                break;
            }
        }
        int sum = 0;
        for (int i = 10; i > ownNumber; i--) {
            sum++;
        }
        System.out.println("range of number 10 is: " + sum);
    }
}
