package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void test_sum_repeat() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sum_repeat(1, 10));
  }

  @Test
  public void test_sum_repeat_ave() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.sum_repeat_ave(1, 10), 0.001);
  }

  @Test
  public void test_sum_repeat_odd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sum_repeat_odd(1, 10));
  }

  @Test
  public void test_sum_repeat_even() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sum_repeat_even(1, 10));
  }

}
