package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {

    // Existing tests for the constructor and add function

    @Test
    public void normalConstructor() {
        Binary binary = new Binary("1001001");
        assertTrue(binary.getValue().equals("1001001"));
    }

    @Test
    public void constructorWithInvalidDigits() {
        Binary binary = new Binary("1001001211");
        assertTrue(binary.getValue().equals("0"));
    }

    @Test
    public void constructorWithInvalidChars() {
        Binary binary = new Binary("1001001A");
        assertTrue(binary.getValue().equals("0"));
    }

    @Test
    public void constructorWithNegativeSign() {
        Binary binary = new Binary("-1001001");
        assertTrue(binary.getValue().equals("0"));
    }

    @Test
    public void constructorWithZeroTailing() {
        Binary binary = new Binary("00001001");
        assertTrue(binary.getValue().equals("1001"));
    }

    @Test
    public void constructorEmptyString() {
        Binary binary = new Binary("");
        assertTrue(binary.getValue().equals("0"));
    }

    @Test
    public void add() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("10111"));
    }

    @Test
    public void add2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1101"));
    }

    @Test
    public void add3() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1101"));
    }

    @Test
    public void add4() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("1010"));
    }

    @Test
    public void add5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.add(binary1, binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    // New tests for OR function

    @Test
    public void OR_SameLength() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.OR(binary1, binary2);
        assertTrue(result.getValue().equals("1110"));
    }

    @Test
    public void OR_DifferentLength() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.OR(binary1, binary2);
        assertTrue(result.getValue().equals("1011"));
    }

    @Test
    public void OR_WithZero() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0000");
        Binary result = Binary.OR(binary1, binary2);
        assertTrue(result.getValue().equals("1010"));
    }

    // New tests for AND function

    @Test
    public void AND_SameLength() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.AND(binary1, binary2);
        assertTrue(result.getValue().equals("1000"));
    }

    @Test
    public void AND_DifferentLength() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary result = Binary.AND(binary1, binary2);
        assertTrue(result.getValue().equals("10"));
    }

    @Test
    public void AND_WithZero() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0000");
        Binary result = Binary.AND(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }

    // New tests for Multiply function

    @Test
    public void Multiply_SameLength() {
        Binary binary1 = new Binary("1010"); // 10
        Binary binary2 = new Binary("1100"); // 12
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1111000")); // 120
    }

    @Test
    public void Multiply_DifferentLength() {
        Binary binary1 = new Binary("101"); // 5
        Binary binary2 = new Binary("10"); // 2
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("1010")); // 10
    }

    @Test
    public void Multiply_WithZero() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("0");
        Binary result = Binary.multiply(binary1, binary2);
        assertTrue(result.getValue().equals("0"));
    }
}