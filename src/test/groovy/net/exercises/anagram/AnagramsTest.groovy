package net.exercises.anagram

import org.junit.Test

import static net.exercises.anagram.Anagrams.*

class AnagramsTest {

    @Test
    void testWordOccurrencesAbc() {
        assert wordOccurrences("abcd") == [['a', 1], ['b', 1], ['c', 1], ['d', 1]]
    }

    @Test
    void testWordOccurrencesRobert() {
        assert wordOccurrences("Robert") == [['b', 1], ['e', 1], ['o', 1], ['r', 2], ['t', 1]]
    }

    @Test
    void testSentenceOccurrences_abcd_e() {
        assert sentenceOccurrences(["abcd", "e"]) == [['a', 1], ['b', 1], ['c', 1], ['d', 1], ['e', 1]]
    }

    @Test
    void testSentenceOccurrences_Roberto_Carlos() {
        assert sentenceOccurrences(["Roberto", "Carlos"]) == [
                ['a', 1], ['b', 1], ['c', 1], ['e', 1], ['l', 1], ['o', 3], ['r', 3], ['s', 1], ['t', 1]
        ]
    }

    @Test
    void testSentenceOccurrences_abcd_abe() {
        assert sentenceOccurrences(["abcd", "abe"]) == [['a', 2], ['b', 2], ['c', 1], ['d', 1], ['e', 1]]
    }

    @Test
    void testDictionaryByOccurrencesGet() {
        assert dictionaryByOccurrences.get([['a', 1], ['e', 1],
                                            ['t', 1]]) == ["ate", "eat", "tea"]
        assert dictionaryByOccurrences.get([['a', 1], ['g', 1],
                                            ['o', 1]]) == ["ago", "Goa"]
        assert dictionaryByOccurrences.get([['a', 2], ['b', 2]]) == ["Abba"]
    }

    @Test
    void testWordAnagrams_married() {
        assert wordAnagrams("married") == ["admirer", "married"]
    }

    @Test
    void testWordAnagrams_player() {
        assert wordAnagrams("player") == ["parley", "pearly", "player", "replay"]
    }

    @Test
    void testCombinations_a_b() {
        def input = [['a', 2], ['b', 2]]
        def output = [
                [],
                [['a', 1]],
                [['a', 2]],
                [['b', 1]],
                [['a', 1], ['b', 1]],
                [['a', 2], ['b', 1]],
                [['b', 2]],
                [['a', 1], ['b', 2]],
                [['a', 2], ['b', 2]]
        ].sort()


        def lists = combinations(input).sort()
        println lists
        assert lists == output
    }

}
