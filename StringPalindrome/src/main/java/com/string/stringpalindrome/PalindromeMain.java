/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.stringpalindrome;

/**
 *
 * @author ajagurus
 */
public class PalindromeMain {

    public static boolean checkpalindrome(String string) {
        boolean status = true;
        String input = null;
        int length;
        if (string == null || string.matches(".*[0-9]+")) {
            status = false;
        } else {
            input = string.toLowerCase();
            length = string.length();

            if (length % 2 == 1) {
                for (int i = 0; i <= Math.floor(length / 2); i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        status = false;
                    }
                }

            } else {
                for (int i = 0; i < (length / 2); i++) {
                    if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                        status = false;
                    }
                }
            }
        }
        return status;
    }
    
    /*
    
    -- See how input parameter is being checked for null, don't use inputparameter.equals("null") as "null" is a string in java
    
    */

}
