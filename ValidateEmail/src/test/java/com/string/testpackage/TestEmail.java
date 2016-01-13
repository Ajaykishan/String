/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.testpackage;

import com.string.validateemail.ValidationMain;
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
public class TestEmail {

    String input;
    boolean output;
    ValidationMain objectTest = new ValidationMain();

    public TestEmail(String input, boolean output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static Collection testCheckValidemail() {
        return Arrays.asList(new Object[][]{
            {"asdf@lb.com", true},
            {"@lb.com", false},
            {"asdf@.com", false},
            {"asdf.com", false},
            {"asdf_1234_asdf@lb.com", true}
        });
    }

    @Test(timeout = 100)
    public void test() {
        System.out.println("--Result are being tested");
        boolean result = (boolean) objectTest.checkValidEmail(input);
        assertEquals(output, result);

    }

}
