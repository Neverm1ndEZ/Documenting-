package com.module3.ppt;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // Addition Operator
        System.out.println();
        int sum = 6+9;
        System.out.println("The sum is: "+sum);
        // directly
        System.out.println("The sum with parentheses is: "+(6+9));
        System.out.println();
        // use of parentheses is important, else
//        System.out.println("The sum is: "+6+9); //it'll concatenate the two

        // Subtraction Operator
        int diff = 9-6;
        System.out.println("The difference is: "+diff);
        // directly
        System.out.println("The difference with parentheses is: "+(9-6));
        System.out.println();
//        System.out.println("The difference is: "+9-6); because there's no way to subtract an integer value to a string value.

        // Multiplication Operator
        int product = 5*9;
        System.out.println("The product is: "+product);
        System.out.println("The product without parentheses is: "+5*9);
        System.out.println();

        // Division Operator
        int divide = 4/2;
        System.out.println("The result is: "+ divide);
        System.out.println("The result without parentheses is: "+ 4/2);
        System.out.println();

        // Modulo Operator
        int mod = 5%2;
        System.out.println("The mod is: "+mod);
        System.out.println("The mod without parentheses is: "+6%4);
        System.out.println();

        // Operator Precedence
        int ans = 2 * (1 + 5) - 12 / (4 + 2);
        System.out.println("Operator Precedence result is: "+ans);
        System.out.println();
    }
}