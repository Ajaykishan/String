package com.string.reversestringrecursively;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajagurus
 */
public class StringReverseMain {

    public String reverseRecursively(String word) {

        if (word == null) {
            return null;
        } else if (word.length() > 0) {
            return reverseRecursively(word.substring(1, word.length())) + word.charAt(0);
        } else {
            return "";
        }
    }

}
