package net.exercises.anagram

import org.junit.Test

import static net.exercises.anagram.Anagrams.wordOccurrences
import static net.exercises.anagram.Occurrence.occurrence

class AnagramsTest {

    @Test
    void testWordOccurrencesAbc() {
        assert wordOccurrences("abcd") == [occurrence('a', 1), occurrence('b', 1), occurrence('c', 1), occurrence('d', 1)]
    }

    @Test
    void testWordOccurrencesRobert() {
        assert wordOccurrences("Robert") == [occurrence('b', 1), occurrence('e', 1), occurrence('o', 1), occurrence('r', 2), occurrence('t', 1)]
    }
}
