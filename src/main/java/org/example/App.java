package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        message();
        switchToOperation();
    }

    public static void message() {
        System.out.println("=================================");
        System.out.println("1. ADD");
        System.out.println("2. READ");
        System.out.println("3. UPDATE");
        System.out.println("4. DELETE");
        System.out.println("5. EXIT");
        System.out.println("=================================");

    }

    public static void switchToOperation() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        boolean isRunning = true;
        try {
            while (isRunning) {
                System.out.println();

                System.out.print("Operation: ");
                int operation = sc.nextInt();

                switch (operation) {
                    case 1:
                        System.out.print("ADD: ");
                        int num = sc.nextInt();
                        numbers.add(num);
                        System.out.println("NUMBER " + num + " WAS ADDED");
                        System.out.println(numbers);
                        break;
                    case 2:
                        System.out.print("PRINT: ");
                        if (numbers.size() == 0)
                            System.out.println("EMPTY LIST!");
                        else
                            System.out.println(numbers);
                        break;





                }
                message();
                sc.close();
            }
        } catch (Exception e) {
            System.out.println("YOU DID NOT TYPE A NUMBER!");
        }
    }
}


