package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double averate(int x, int y) {
    return (x + y) / 2.0;
  }

  public int sum_repeat(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum;
  }

  public double sum_repeat_ave(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += i;
    }
    return sum / (end - start + 1.0);
  }

  public int sum_repeat_odd(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }

  public int sum_repeat_even(int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    return sum;
  }
}
