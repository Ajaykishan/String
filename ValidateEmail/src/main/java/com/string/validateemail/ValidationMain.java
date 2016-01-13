/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.validateemail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Ajaykishan Gurusamy
 */
public class ValidationMain {

    public static boolean checkValidEmail(String string) {
        String regularExpression = "[0-9[a-z[_]]]{1,}[@][a-z]{1,}[.][a-z]{1,}";
        Pattern p = Pattern.compile(regularExpression);
        Matcher m = p.matcher(string);
        return m.matches();
    }
}
