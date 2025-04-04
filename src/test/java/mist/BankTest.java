package mist;

import static org.junit.Assert.*;
import org.junit.Test;

public class BankTest {
    @Test
    public void testWithdraw() {
        Bank account = new Bank(130000);
        double result = account.withdraw(100);
        System.out.println("Deposit Result: " + result);
        assertEquals(129900, result, 0.00001);
    }

    @Test
    public void testDeposit() {
        Bank account = new Bank(130000);
        double result = account.deposit(100);
        System.out.println("Deposit Result: " + result);
        assertEquals(130100, result, 0.00001);
    }

    @Test
    public void testUnable() {
        Bank account = new Bank(130000);
        double result = account.withdraw(200000);
        if (result == -1) {
            System.out.println("Cannot withdraw more than the balance ");
        }
        assertEquals(-1, result, 0.00001);
    }

    @Test
    public void testNegative() {
        Bank account = new Bank(130000);
        double result = account.deposit(-100);
        if (result == -1) {
            System.out.println("Cannot Deposit a negative  amount ");
        }
        assertEquals(-1, result, 0.00001);
    }

}
