package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = pref.length <= word.length;
        for (int i = 0; i < pref.length; i++) {
            if (result) {
                result = pref[i] == word[i];
            } else {
                break;
            }
        }
        return result;
    }
}
