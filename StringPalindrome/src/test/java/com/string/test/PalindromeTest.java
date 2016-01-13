/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.stringpalindrome.PalindromeMain;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ajagurus
 */
@RunWith(Parameterized.class)
public class PalindromeTest {

    String input;
    Boolean output;
    PalindromeMain objectTest = new PalindromeMain();

    public PalindromeTest(String input, Boolean output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection testCheckpalindrome() {
        return Arrays.asList(new Object[][]{
            {"Madam", true},
            {"Siva", false},
            {"flip9", false},
            {null, false}
        });
    }

    @Test(timeout = 10)
    public void test() {
        System.out.println("--Result are being tested");
        assertEquals(output, objectTest.checkpalindrome(input));
    }

}
