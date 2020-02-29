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
                    case 3:
                        System.out.println("UPDATE");
                        System.out.print("SELECT NUMBER TO UPDATE FROM THE LIST: ");
                        int numToFind = sc.nextInt();
                        if (numbers.contains(numToFind)) {
                            System.out.print("SELECT TO WHICH NUMBER TO UPDATE: ");
                            int numToUpdate = sc.nextInt();
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) == (numToFind)) {
                                    numbers.set(i, numToUpdate);
                                    break;
                                }
                            }
                            System.out.println(numbers);
                        } else
                            System.out.println("NUMBER WAS NOT FOUND!");
                        break;
                    case 4:
                        System.out.println("DELETE: ");
                        System.out.print("SELECT NUMBER TO DELETE: ");
                        int numToDelete = sc.nextInt();
                        if (!numbers.contains(numToDelete))
                            System.out.println("NUMBER WAS NOT FOUND!");
                        else {
                            for (int i = 0; i < numbers.size(); i++) {
                                if (numbers.get(i) == numToDelete)
                                    numbers.remove(i);
                                System.out.println("NUMBER " + numToDelete + " DELETED!");
                                System.out.println(numbers);
                                break;
                            }
                        }
                        break;
                    case 5:
                        isRunning = false;
                        System.out.println("EXITING...");
                        System.exit(-1);
                    default:
                        System.out.println("\nPLEASE TYPE A VALID CHOICE BETWEEN [1-5]");

                        break;
                }
                System.out.println();

                message();
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("YOU DID NOT TYPE A NUMBER!");
        }
    }

}
