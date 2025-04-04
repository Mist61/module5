package mist;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalcTest {

    @Test
    public void testMultipy() {
        Calc calc = new Calc();
        double result = calc.multiply(4, 5);
        System.out.println("multiply result: " + result);
        assertEquals(20, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        Calc calc = new Calc();
        double result = calc.division(4, 0);

        if (result == -1) {
            System.out.println("Cannot divide by 0.");
        } else {
            System.out.println("result: " + result);
        }

        assertEquals(-1, result, 0.0001);
    }

    @Test
    public void testDivision() {
        Calc calc = new Calc();
        double result = calc.division(10, 2);
        System.out.println("division result: " + result);
        assertEquals(5, result, 0.0001);
    }

    @Test
    public void testAddition() {
        Calc calc = new Calc();
        double result = calc.addition(4, 5);
        System.out.println("addition result: " + result);
        assertEquals(9, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        Calc calc = new Calc();
        double result = calc.subtraction(4, 5);
        System.out.println("subtraction result: " + result);
        assertEquals(-1, result, 0.0001);
    }
}
