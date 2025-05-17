package org.example;

import java.util.Scanner;

public class InputHandler {

  private static final int MAX_TRY_COUNT = 3;

  //数値を入力値から取得する
  public double inputNumber(Scanner scanner, int numbersCount) {
    int inputCount = 1;
    while (inputCount <= MAX_TRY_COUNT) {
      System.out.print(numbersCount + "番目の数値を入力してください。 > ");
      if (scanner.hasNextDouble()) {
        return scanner.nextDouble();
      } else {
        int rest = MAX_TRY_COUNT - inputCount;
        System.out.println("数値が入力されていません。※残入力可能回数: " + rest + "回");
        scanner.next();
        inputCount++;
      }
    }
    throw new IllegalArgumentException("3回入力に失敗したため、処理を中止します。");
  }

  //演算子を入力値から取得する
  public String inputOperator(Scanner scanner) {
    int inputCount = 1;
    while (inputCount <= MAX_TRY_COUNT) {
      System.out.print("演算子(+,-,*,/)を一つ入力してください。 > ");
      if (scanner.hasNext()) {
        String inputContext = scanner.next();
        if (inputContext.matches("[+\\-*/]")) {
          return inputContext;
        } else {
          int rest = MAX_TRY_COUNT - inputCount;
          System.out.println("適切な演算子を入力してください。※残入力可能回数: " + rest + "回");
        }
        inputCount++;
      }
    }
    throw new IllegalArgumentException("3回入力に失敗したため、処理を中止します。");
  }
}
