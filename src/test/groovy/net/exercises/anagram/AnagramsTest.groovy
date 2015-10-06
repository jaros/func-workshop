package net.exercises.anagram

import org.junit.Test

import static net.exercises.anagram.Anagrams.*
import static net.exercises.anagram.Occurrence.occurrence

class AnagramsTest {

    @Test
    void testWordOccurrencesAbc() {
        assert wordOccurrences("abcd") == [occurrence('a', 1), occurrence('b', 1),
                                           occurrence('c', 1), occurrence('d', 1)]
    }

    @Test
    void testWordOccurrencesRobert() {
        assert wordOccurrences("Robert") == [occurrence('b', 1), occurrence('e', 1),
                                             occurrence('o', 1), occurrence('r', 2), occurrence('t', 1)]
    }

    @Test
    void testSentenceOccurrences_abcd_e() {
        assert sentenceOccurrences(["abcd", "e"]) == [occurrence('a', 1), occurrence('b', 1),
                                                      occurrence('c', 1), occurrence('d', 1), occurrence('e', 1)]
    }

    @Test
    void testSentenceOccurrences_Roberto_Carlos() {
        assert sentenceOccurrences(["Roberto", "Carlos"]) == [
                occurrence('a', 1), occurrence('b', 1), occurrence('c', 1), occurrence('e', 1),
                occurrence('l', 1), occurrence('o', 3), occurrence('r', 3), occurrence('s', 1), occurrence('t', 1)]
    }

    @Test
    void testSentenceOccurrences_abcd_abe() {
        assert sentenceOccurrences(["abcd", "abe"]) == [occurrence('a', 2), occurrence('b', 2),
                                                        occurrence('c', 1), occurrence('d', 1), occurrence('e', 1)]
    }

    @Test
    void testDictionaryByOccurrencesGet() {
        assert dictionaryByOccurrences.get([occurrence('a', 1), occurrence('e', 1),
                                            occurrence('t', 1)]) == ["ate", "eat", "tea"]
        assert dictionaryByOccurrences.get([occurrence('a', 1), occurrence('g', 1),
                                            occurrence('o', 1)]) == ["ago", "Goa"]
        assert dictionaryByOccurrences.get([occurrence('a', 2), occurrence('b', 2)]) == ["Abba"]
    }

    @Test
    void wordAnagrams_married() {
        assert wordAnagrams("married") == ["admirer", "married"]
    }

    @Test
    void wordAnagrams_player() {
        assert wordAnagrams("player") == ["parley", "pearly", "player", "replay"]
    }

}
