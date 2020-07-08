package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ArrayCharTest {

    @Test
    public void whenStartWithPrefixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenPrefMoreWordThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] pref = {'H', 'e', 'l', 'l', 'o', ',', 'E', 'u', 'g', 'e', 'n', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }

    @Test
    public void whenZeroWordAndPrefThenFalse() {
        char[] word = {};
        char[] pref = {};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenOneCharacterWordAndPrefThenFalse() {
        char[] word = {'H'};
        char[] pref = {'h'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}