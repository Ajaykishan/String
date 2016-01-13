/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.stringwithnumbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ajagurus
 */
public class StringNumbersMain {

    public boolean checkStringHasOnlyNumbers(String string) {
        if (string == null) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
