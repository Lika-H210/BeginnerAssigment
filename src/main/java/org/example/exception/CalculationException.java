package org.example.exception;

public class CalculationException extends RuntimeException {

  public CalculationException(String message) {
    super("計算中に異常が発生したため処理を中止します：" + message);
  }

}
