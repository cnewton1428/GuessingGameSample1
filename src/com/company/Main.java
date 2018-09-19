package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number = 1;
        Scanner kbd = new Scanner(System.in);
        while (number <=10) {
            System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
            number++;


            int guess = kbd.nextInt();

                if (guess <6 && guess>6);
            System.out.println("That is incorrect. Guess again.");

            if (guess==6);
            System.out.println("That's right! You're a good guesser.");
        }

        }
    }
