/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.reversestringiterative.ReverseIterative;
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
public class ReverseIterativeTest {

    String input;
    String Output;
    ReverseIterative objectTest = new ReverseIterative();

    public ReverseIterativeTest(String input, String output) {
        super();
        this.input = input;
        Output = output;
    }

    @Parameters
    public static Collection<String[]> testReverseStringParameters() {
        String[][] data = new String[][]{
            {"Rasipuram", "marupisaR"},
            {"Thanjavur", "ruvajnahT"},
            {"Chicago", "ogacihC"},
            {"San Dieago", "ogaeiD naS"},
            {"Trichy", "yhcirT"},
            {null, null},
            {"123", null}
        };
        return Arrays.asList(data);
    }

    @Test(timeout = 10)
    public void test() {
        System.out.println("--Result are being tested");
        assertEquals(Output, objectTest.reverseAString(input));
    }

}
