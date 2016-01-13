/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.test;

import com.string.characterreplace.CharacterReplaceString;
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
public class StringReplaceTest {

    String input1;
    char char1;
    char char2;
    String output;
    CharacterReplaceString objectTest = new CharacterReplaceString();

    public StringReplaceTest(String input1, char char1, char char2, String output) {
        super();
        this.input1 = input1;
        this.char1 = char1;
        this.char2 = char2;
        this.output = output;
    }

    @Parameters
    public static Collection testReplaceCharacter() {
        return Arrays.asList(new Object[][]{
            {"Ajay", 'a', 'k', "kjky"},
            {"asdf", 'd', 'f', "asff"},
            {"123123", 'a', 's', null},
            {null, 'a', 's', null}
        });
    }

    @Test(timeout = 100)
    public void test() {
        String result = objectTest.replaceCharacter(input1, char1, char2);
        assertEquals(output, result);
    }

}
