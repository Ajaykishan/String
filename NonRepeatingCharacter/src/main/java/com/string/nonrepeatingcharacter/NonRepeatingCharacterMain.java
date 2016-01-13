/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.nonrepeatingcharacter;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/**
 *
 * @author ajagurus
 */
public class NonRepeatingCharacterMain {

    public char findFirstNonRepeatativeCharacter(String string) {
        if (string == null || string.matches("[1-9]+")) {
            return '0';
        }
        String testString = string.toLowerCase();
        char result = '0';
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
        int length = testString.length();
        int occurance;
        Set<Character> Keys;
        for (int i = 0; i <= length - 1; i++) {
            if (lhm.containsKey(testString.charAt(i))) {
                occurance = lhm.get(testString.charAt(i));
                lhm.put(testString.charAt(i), occurance + 1);
            } else {
                lhm.put(testString.charAt(i), 1);
            }
        }
        Keys = lhm.keySet();
        Iterator<Character> i = Keys.iterator();
        while (i.hasNext()) {
            char key = (char) i.next();
            if (lhm.get(key) == 1) {
                return key;
            }
        }
        return result;
    }

}
