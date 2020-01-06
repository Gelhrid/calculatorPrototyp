package com.company;

import com.company.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        String input = "1+2-3+4-5+6";
//        String input = "1+1";

        Calculator calculator = new Calculator();

        int result = calculator.calculate(input);

        System.out.println(result);
    }
}
