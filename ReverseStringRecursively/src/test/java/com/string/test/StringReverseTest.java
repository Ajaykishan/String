/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.reversestringrecursively.StringReverseMain;
import java.util.Arrays;
import java.util.Collection;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ajagurus
 */
@RunWith(Parameterized.class)
public class StringReverseTest {

    String input1;
    String output;
    StringReverseMain objectTest = new StringReverseMain();

    public StringReverseTest(String input1, String output) {
        super();
        this.input1 = input1;
        this.output = output;
    }

    @Parameters
    public static Collection testReplaceCharacter() {
        return Arrays.asList(new Object[][]{
            {"Ajay", "yajA"},
            {"Sivaganga", "agnagaviS"},
            {null, null}
        });
    }

    @Test(timeout = 100)
    public void test() {
        String result = objectTest.reverseRecursively(input1);
        assertEquals(output, result);
    }

}
