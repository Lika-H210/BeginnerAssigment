package org.example.exception;

public class InputLimitExceededException extends RuntimeException {

  public InputLimitExceededException(String message) {
    super("入力制限を超えたため処理を中止します：" + message);
  }

}
