package org.example;

public class Calculator {

  //指定した計算を行う
  public double calculate(double number1, double number2, String operator) {
    switch (operator) {
      case "+":
        return number1 + number2;
      case "-":
        return number1 - number2;
      case "*":
        return number1 * number2;
      case "/":
        if (number2 == 0) {
          throw new ArithmeticException("0で割ることはできません。");
        }
        return number1 / number2;
    }
    //計算ができない場合はcaseで想定する演算子でなかった場合
    throw new IllegalArgumentException("演算子が不正です。演算子: " + operator);
  }

}
