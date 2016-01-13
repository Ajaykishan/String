package com.string.stringpresence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ajagurus
 */
public class StringPresenceMain {

    public boolean checkStringHasAnotherString(String string, String string2) {
        if (string == null || string2 == null) {
            return false;
        }
        final String regularExpression = ".*(" + string2 + ")[ ]+.*";
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(string);
        return m.matches();
    }

}
