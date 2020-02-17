package calculator;
import javaassessment.*;
import org.testng.annotations.AfterTest;

import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    static float result1;

    static float no3;


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        float result1=0,result;
        String expression = scanner.next();
        char exp2=' ';
        try {
            float no1 = Float.parseFloat(String.valueOf(expression.charAt(0)));
            float no2 = Float.parseFloat(String.valueOf(expression.charAt(2)));
            int length=expression.length();
            char exp1 = expression.charAt(1);
            if(length>3){
               exp2 = expression.charAt(3);
               no3 = Float.parseFloat(String.valueOf(expression.charAt(4)));
            }

            switch (exp1) {

                case '+':
                    result1=doAdd(no1, no2);
                    if (length==3){
                        System.out.println(result1);
                    }
                    break;
                case '-':
                    result1=doSub(no1, no2);
                    if (length==3){
                        System.out.println(result1);
                    }
                    break;
                case '*':
                    result1=doMul(no1, no2);
                    if (length==3){
                        System.out.println(result1);
                    }
                    break;
                case '/':
                    result1=doDiv(no1, no2);
                    if (length==3){
                        System.out.println(result1);
                    }
                default:
                    System.out.println("Wrong operand entered....");
            }
            if (length>3){
                switch (exp2) {
                    case '+':
                        result=doAdd(result1, no3);
                        System.out.println(result);
                        break;
                    case '-':
                        result=doSub(result1, no3);
                        System.out.println(result);
                        break;
                    case '*':
                        result=doMul(result1, no3);
                        System.out.println(result);
                        break;
                    case '/':
                        result=doDiv(result1, no3);
                        System.out.println(result);
                    default:
                        System.out.println("Wrong operand entered....");
                }

            }
        } catch (Exception e) {
            System.out.println("Exception found....");
        }
    }

    private static float doDiv(float no1, float no2) {
        Division division = new Division(no1, no2);
        return division.divisionOperation();
    }

    private static float doMul(float no1, float no2) {
        Multiplication multiplication = new Multiplication();
        multiplication.setNo1(no1);
        multiplication.setNo2(no2);
        return multiplication.multiplicationOperation();
    }

    private static float doSub(float no1, float no2) {
        Subtraction subtraction = new Subtraction(no1, no2);
       return subtraction.subtractionOperation();
    }

    private static float doAdd(float no1, float no2) {
        Addition addition = new Addition();
        addition.setNo1(no1);
        addition.setNo2(no2);
        return  addition.additionOperation();
    }
}
