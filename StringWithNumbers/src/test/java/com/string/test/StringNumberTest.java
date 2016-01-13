/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.stringwithnumbers.StringNumbersMain;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ajagurus
 */
@RunWith(Parameterized.class)
public class StringNumberTest {

    String input1;
    Boolean Output;
    StringNumbersMain objectTest = new StringNumbersMain();

    public StringNumberTest(String input1, Boolean output) {
        super();
        this.input1 = input1;
        this.Output = output;
    }

    @Parameters
    public static Collection testCheckStringHasAnotherString() {
        return Arrays.asList(new Object[][]{
            {"12345", true},
            {null, false},
            {"123as123", false},
            {"123asd", false},
            {"asd123", false},
            {"asdf123asdf", false}
        });
    }

    @Test(timeout = 100)
    public void test() {
        System.out.println("--Result are being tested");
        Boolean result = objectTest.checkStringHasOnlyNumbers(input1);
        assertEquals(Output, result);

    }

}
