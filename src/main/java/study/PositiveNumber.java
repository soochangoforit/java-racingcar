package study;

import java.util.Arrays;

/**
 * 양수 값을 저장하게 되는 VO 객체
 */
public class PositiveNumber {

  private final int[] numbers;

  public PositiveNumber(int[] numbers) {
    validateNonNegative(numbers);
    this.numbers = numbers;
  }

  public int sum() {
    return Arrays.stream(numbers).sum();
  }

  public int size(){
    return numbers.length;
  }

  public int[] values() {
    return numbers;
  }

  private void validateNonNegative(int[] numbers) {
    for (int number : numbers) {
      validate(number);
    }
  }

  private static void validate(int number) {
    if (number < 0) {
      throw new RuntimeException();
    }
  }
}
