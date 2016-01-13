/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.string.removecharacterrecursively;

/**
 *
 * @author ajagurus
 */
public class RemoveRecursivelyMain {

    public String removeCharacterRecursively(String word, char ch) {
        String new_word = word;
        if (new_word == null) {
            return null;
        } else if (ch == '\0') {
            return word.toLowerCase();
        } else {
            new_word = word.toLowerCase();
        }
        int index = new_word.indexOf(ch);
        if (index == -1) {
            return new_word;
        }
        return removeCharacterRecursively(new_word.substring(0, index) + new_word.substring(index + 1, new_word.length()), ch);
    }

}
