package com.example.utils;

import com.example.utils.StringReverser;

public class Main {
    public static void (String[] args) {
        String text = "J@va the be$t!123";
        String result = StringReverser.reverseLettersOnly(text);
        System.out.println(result);
    }
}