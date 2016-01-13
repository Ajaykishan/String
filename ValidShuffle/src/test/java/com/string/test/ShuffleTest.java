/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.validshuffle.ShuffleMain;
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
public class ShuffleTest {

    String input1;
    String input2;
    String input3;
    Boolean output;
    ShuffleMain objectTest = new ShuffleMain();

    public ShuffleTest(String input1, String input2, String input3, Boolean output) {
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
        this.output = output;
    }

    @Parameters
    public static Collection testReplaceCharacter() {
        return Arrays.asList(new Object[][]{
            {"Ajay", "kishan", "Akjiasyhan", true},
            {"Sivaganga", "Rasipuram", "SivaRasipgangauram", true},
            {null, "Chicago", null, false},
            {null, null, "Thanjavur", false},
            {"Sivaganga", "Rasipuram", null, false}
        });
    }

    @Test(timeout = 100)
    public void test() {
        Boolean result = objectTest.checkValidShuffle(input1, input2, input3);
        assertEquals(output, result);
    }

}
