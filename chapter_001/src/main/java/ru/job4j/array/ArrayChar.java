package ru.job4j.array;
/**
 * ArrayChar.
 */
public class ArrayChar {
    /**
     * Checks that the word starts with the prefix.
     * @param word , prefix.
     * @return if the word starts with a prefix.
     */
    public boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        int minLength = Math.min(wrd.length, pref.length);
        for (int i = 0; i < minLength; i++) {
            if (wrd[i] != pref[i]) {
                 result = false;
            }
        }
        return result;
    }
}