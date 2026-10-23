package org.example;

import org.example.utils.Reverse;

public class Main {
    public static void main (String[] args) {
        String text = "J@va the be$t!123";
        String result = Reverse.reverseLettersOnly(text);
        System.out.println(result);
    }
}