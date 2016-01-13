/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.stringpresence.StringPresenceMain;
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
public class StringPresenceTest {

    String input1;
    String input2;
    Boolean output;
    StringPresenceMain objectTest = new StringPresenceMain();

    public StringPresenceTest(String input1, String input2, Boolean output) {
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
    }

    @Parameters
    public static Collection testCheckStringHasAnotherString() {
        return Arrays.asList(new Object[][]{
            {"ajay kishan ajay", "kishan", true},
            {"United States of America", "Unite", false},
            {"Great Britain", "Briain", false},
            {"Pakistan", null, false},
            {null, "Sri Lanka", false}
        });
    }

    @Test(timeout = 100)
    public void test() {
        System.out.println("--Result are being tested");
        Boolean result = objectTest.checkStringHasAnotherString(input1, input2);
        assertEquals(output, result);

    }

}
