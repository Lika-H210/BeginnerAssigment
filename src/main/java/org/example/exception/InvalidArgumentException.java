package org.example.exception;

public class InvalidArgumentException extends RuntimeException {

  public InvalidArgumentException(String message) {
    super("引数が不正であるため処理を中止します：" + message);
  }

}
