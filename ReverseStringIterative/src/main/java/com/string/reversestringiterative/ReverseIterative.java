/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.reversestringiterative;

/**
 *
 * @author ajagurus
 */
public class ReverseIterative {

    public String reverseAString(String manipulationString) {
        String newSting = null;
        if (manipulationString == null || manipulationString.matches("[1-9]+")) {
            return null;
        }
        char[] chararray = new char[manipulationString.length()];
        for (int i = 0; i <= manipulationString.length() - 1; i++) {
            // Insert Character from Right, "minus i" very imp.
            chararray[i] = manipulationString.charAt(manipulationString.length() - 1 - i);
        }
        return newSting = new String(chararray);

        // StringBuilder obj = new StringBuilder(manipulationString);
        // System.out.println(""+obj);
        // obj.reverse();
        // System.out.println(""+obj);
        // StringBuffer obj1 = new StringBuffer(manipulationString);
        // System.out.println(""+obj1);
        // obj1.reverse();
        // System.out.println(""+obj1);
    }

}
