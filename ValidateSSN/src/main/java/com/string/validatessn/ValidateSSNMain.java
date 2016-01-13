/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.validatessn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ajagurus
 */
public class ValidateSSNMain {

    public static boolean checkValidSSN(String string) {
        String regularExpression = "[0-9]{3}[-][0-9]{2}[-][0-9]{4}";
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(string);
        return m.matches();

    }

}
