package org.example;

import java.util.Scanner;
import org.example.exception.CalculationException;
import org.example.exception.InputLimitExceededException;
import org.example.exception.InvalidArgumentException;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    InputHandler input = new InputHandler();
    Calculator calculator = new Calculator();

    System.out.println("これより下記計算を行います。");
    System.out.println("数値1 演算子 数値2");
    System.out.println("各数値及び演算子を指定してください。");

    try {
      double number1 = input.inputNumber(scanner, 1);
      String operator = input.inputOperator(scanner);
      double number2 = input.inputNumber(scanner, 2);

      double result = calculator.calculate(number1, number2, operator);

      System.out.println("計算結果 : " + result);
    } catch (InputLimitExceededException | InvalidArgumentException | CalculationException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}