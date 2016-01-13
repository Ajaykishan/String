/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.validatessn.ValidateSSNMain;
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
public class SSNTest {

    String input;
    Boolean Output;
    ValidateSSNMain objectTest = new ValidateSSNMain();

    public SSNTest(String input, Boolean output) {
        super();
        this.input = input;
        this.Output = output;
    }

    @Parameters
    public static Collection testCheckValidSSN() {
        return Arrays.asList(new Object[][]{
            {"123-45-7899", true},
            {"1234-45-1234", false},
            {"12-45-1245", false},
            {"-12-4547", false},
            {"SSN", false},
            {"123-HJ-1456", false}
        });
    }

    @Test(timeout = 100)
    public void test() {
        System.out.println("--Result are being tested");
        Boolean result = objectTest.checkValidSSN(input);
        assertEquals(Output, result);

    }

}
