package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTest {
    @Test
    void isPrimeTrueTest(){
        JUnit jUnit = new JUnit();
        boolean num = jUnit.isPrime(2);
        Assertions.assertEquals(true, num);

    }
    @Test
    void isPrimeFalseTest(){
        JUnit jUnit = new JUnit();
        boolean num = jUnit.isPrime(1);
        boolean num2 = jUnit.isPrime(-1);
        Assertions.assertEquals(false, num);
        Assertions.assertEquals(false,num2);
    }
    @Test
    void isEvenTest(){
        JUnit jUnit = new JUnit();
        String num = jUnit.isEven(34);
        Assertions.assertEquals("Yes the number is even", num);
    }
    @Test
    void isNotEvenTest(){
        JUnit jUnit = new JUnit();
        String num = jUnit.isEven(9);
        Assertions.assertEquals("No, the number is not even", num);
    }
    @Test
    void invalidNumTest(){
        JUnit jUnit = new JUnit();
        String num = jUnit.isEven(-29);
        Assertions.assertEquals("Number provided does not work", num);
    }
}