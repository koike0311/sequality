package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

  @Test
  public void testGetIndividualFeeChild() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getIndividualFee(10));
  }

  @Test
  public void testGetIndividualFeeAdult() {
    Calculate calc = new Calculate();
    assertEquals(2000, calc.getIndividualFee(25));
  }

  @Test
  public void testGetTotalFeeWithoutDiscount() {
    Calculate calc = new Calculate();
    assertEquals(1000, calc.getTotalFee(10, 1));
  }

  @Test
  public void testGetTotalFeeWithDiscount() {
    Calculate calc = new Calculate();
    assertEquals(27000, calc.getTotalFee(25, 15));
  }
}
