/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.validshuffle;

/**
 *
 * @author ajagurus
 */
public class ShuffleMain {

    public boolean checkValidShuffle(String string1, String string2, String string3) {

        if (string2 == null && string1 == null && string3 == null) {
            return false;
        } else if (string1 == null && string3 == string2) {
            return true;
        } else if (string2 == null && string1 == string3) {
            return true;
        } else if (string1 != null && string2 != null && string3 != null) {
            int pointer1Length = string1.length() - 1;
            int pointer2Length = string2.length() - 1;
            char[] string3Array = string3.toCharArray();
            for (int i = string3Array.length - 1; i >= 0; i--) {
                if (pointer2Length >= 0 && string3.charAt(i) == string2.charAt(pointer2Length)) {
                    pointer2Length--;
                } else if (pointer1Length >= 0 && string3.charAt(i) == string1.charAt(pointer1Length)) {
                    pointer1Length--;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
