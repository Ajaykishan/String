/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.characterreplace;

/**
 *
 * @author ajagurus
 */
public class CharacterReplaceString {

    public String replaceCharacter(String string, char c, char d) {
        String input;
        if (string == null || string.matches("[0-9]*")) {
            return null;
        } else {
            input = string.toLowerCase();
        }

        char[] array = input.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c) {
                array[i] = d;
            }

        }
        return new String(array);
    }

}
