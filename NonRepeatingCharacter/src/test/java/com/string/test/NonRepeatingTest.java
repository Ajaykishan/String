/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.nonrepeatingcharacter.NonRepeatingCharacterMain;
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
public class NonRepeatingTest {

    String input;
    char Output;
    NonRepeatingCharacterMain objectTest = new NonRepeatingCharacterMain();

    public NonRepeatingTest(String input, char output) {
        super();
        this.input = input;
        this.Output = output;
    }

    @Parameters
    public static Collection testfindFirstNonRepeatativeCharacter() {
        return Arrays.asList(new Object[][]{
            {"Rasipuram", 's'},
            {"Ajy", 'a'},
            {"kkii", '0'},
            {null, '0'},
            {"123", '0'}
        });
    }

    @Test(timeout = 10)
    public void test() {
        System.out.println("--Result are being tested");
        assertEquals(Output, objectTest.findFirstNonRepeatativeCharacter(input));
    }

}
