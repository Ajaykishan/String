/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.removecharacteriteratively;

/**
 *
 * @author ajagurus
 */
public class RemoveIterativelyMain {

    public String removeCharacterIteratively(String string, char c) {
        StringBuilder strBuild = new StringBuilder();
        char cNew = c;
        if ((int) c < 91) {
            cNew = (char) ((int) c + 32);
        }
        if (c == '\0' && string != null) {
            return new String(string.toLowerCase());
        } else if (string != null) {
            char[] stringArray = string.toLowerCase().toCharArray();
            for (char c1 : stringArray) {
                if (c1 != cNew) {
                    strBuild.append(c1);
                }
            }
            return strBuild.toString();
        } else {
            return null;
        }

    }

}
