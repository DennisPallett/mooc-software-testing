package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TwoNumbersSumTest {
    @Test
    public void simpleTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1,0));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(2,2)), result);
    }

    @Test
    public void firstNumberMoreDigitsTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1,0));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,3,2)), result);
    }

    @Test
    public void secondNumberMoreDigitsTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2,2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(1,2,0));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,4,2)), result);
    }

    @Test
    public void complementTenTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(2,2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(2,8));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(5,0)), result);
    }

    @Test
    public void complementHundredTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2,0));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(2,8,0));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(4,0,0)), result);
    }

    @Test
    public void addZeroTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(0));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,2)), result);
    }

    @Test
    public void complementFirstDigitsTest() {
        TwoNumbersSum sum = new TwoNumbersSum();

        ArrayList<Integer> num1 = new ArrayList<>(Arrays.asList(9));
        ArrayList<Integer> num2 = new ArrayList<>(Arrays.asList(8));

        ArrayList<Integer> result = sum.addTwoNumbers(num1, num2);

        Assertions.assertEquals(new ArrayList<>(Arrays.asList(1,7)), result);
    }
}
