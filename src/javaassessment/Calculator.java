package javaassessment;

import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        System.out.println("------xxxxx---------Calculator-------xxxx--------");
        do {
            System.out.print("1. Addition \n2. Subtraction\n3. Multiplication \n4. Division \n5. Exit \n\nEnter your option= ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    doAdditionOperation();
                    break;
                case 2:
                    doSubtractionOperation();
                    break;
                case 3:
                    doMultiplicationOperation();
                    break;
                case 4:
                    doDivisionOperation();
                    break;
                case 5:
                    System.out.println("Exiting.....");
                    System.exit(0);
                    break;
            }

        } while (choice != 5);

    }

    private static void doAdditionOperation() {
        System.out.print("\nEnter two numbers: ");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        Addition addition = new Addition();
        addition.setNo1(no1);
        addition.setNo2(no2);
        System.out.println("Addition is " + addition.additionOperation());
    }

    private static void doSubtractionOperation() {
        System.out.print("\nEnter two numbers: ");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        Subtraction subtraction = new Subtraction(no1, no2);
        System.out.println("Subtraction is " + subtraction.subtractionOperation());
    }

    private static void doMultiplicationOperation() {
        System.out.print("\nEnter two numbers: ");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        Multiplication multiplication = new Multiplication();
        multiplication.setNo1(no1);
        multiplication.setNo2(no2);
        System.out.println("Multiplication is " + multiplication.multiplicationOperation());

    }

    private static void doDivisionOperation() {
        System.out.print("\nEnter two numbers: ");
        int no1 = scanner.nextInt();
        int no2 = scanner.nextInt();
        Division division = new Division(no1, no2);
        System.out.println("Division is " + division.divisionOperation());
    }
}
