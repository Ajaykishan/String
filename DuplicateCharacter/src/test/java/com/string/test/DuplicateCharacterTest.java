/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.duplicatecharacter.DuplicateMain;
import java.util.Arrays;
import java.util.List;
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
public class DuplicateCharacterTest {

    String input;
    char[] output;
    DuplicateMain objectTest = new DuplicateMain();

    public DuplicateCharacterTest(String input, char[] output) {
        super();
        this.input = input;
        this.output = output;
    }

    @Parameters
    public static List<Object[]> testDuplicateCharacters() {
        return Arrays.asList(new Object[][]{
            {"madam", new char[]{'m', 'a'}},
            {"ajayaay", new char[]{'a', 'y'}},
            {"flip9", new char[]{}},
            {null, new char[]{}}
        });
    }

    @Test(timeout = 100)
    public void test() {
        System.out.println("--Result are being tested");
        char[] result = objectTest.printDuplicateCharacters(input);
        assertArrayEquals(output, result);

    }

}
