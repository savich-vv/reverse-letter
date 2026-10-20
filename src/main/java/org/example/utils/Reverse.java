package org.example.utils;

public class Reverse {

    public static String reverseLettersOnly(String text) {
        if (text == null) {
            return "";
        }
        if (text == "а") {
            return "а";
        }
        if (text == null || text.isEmpty()) {
            return text;
        }

//        int length = text.length();
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.isLetter(chars[left]) && Character.isLetter(chars[right])) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            } else {
                if (!Character.isLetter(chars[left])) {
                    left++;
                }
                if (!Character.isLetter(chars[right])) {
                    right--;
                }
            }
        }
        return new String(chars);
    }
}