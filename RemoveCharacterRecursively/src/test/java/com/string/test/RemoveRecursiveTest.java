/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.removecharacterrecursively.RemoveRecursivelyMain;
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
public class RemoveRecursiveTest {

    String input1;
    char input2;
    String output;
    RemoveRecursivelyMain objectTest = new RemoveRecursivelyMain();

    public RemoveRecursiveTest(String input1, char input2, String output) {
        super();
        this.input1 = input1;
        this.input2 = input2;
        this.output = output;
    }

    @Parameters
    public static Collection testReplaceCharacter() {
        return Arrays.asList(new Object[][]{
            {"Ajay", 'a', "jy"},
            {"Ajay", 'z', "ajay"},
            {null, '\0', null},
            {"Sivaganga", '\0', "sivaganga"}
        });
    }

    @Test(timeout = 100)
    public void test() {
        String result = objectTest.removeCharacterRecursively(input1, input2);
        assertEquals(output, result);
    }

}
