/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.duplicatecharacter;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ajagurus
 */
public class DuplicateMain {

    public static char[] printDuplicateCharacters(String string) {
        Map<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
        int occurance;
        Set<Character> Keys;
        if (string == null || string.matches(".*[0-9]")) {
            return new char[]{};
        }
        String testString = string.toLowerCase();
        int length = testString.length();
        for (int i = 0; i <= length - 1; i++) {
            if (hm.containsKey(testString.charAt(i))) {
                occurance = hm.get(testString.charAt(i));
                hm.put(testString.charAt(i), occurance + 1);
            } else {
                hm.put(testString.charAt(i), 1);
            }
        }
        Keys = hm.keySet();
        char[] result = new char[Keys.size()];
        Iterator<Character> i = Keys.iterator();
        int pos = 0;
        while (i.hasNext()) {
            char key = (char) i.next();
            if (hm.get(key) > 1) {
                result[pos] = key;
                pos++;
            }
        }
        return Arrays.copyOf(result, pos);
    }

}
