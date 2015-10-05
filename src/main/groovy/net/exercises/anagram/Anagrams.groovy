package net.exercises.anagram

import static net.exercises.anagram.Commons.loadDictionary
import static net.exercises.anagram.Occurrence.occurrence

class Anagrams {

/** Converts the word into its character occurrences list.
 *
 *  Note: the uppercase and lowercase version of the character are treated as the
 *  same character, and are represented as a lowercase character in the occurrence list.
 */
    static List<Occurrence> wordOccurrences(String word) {
        []
    }

    /** Converts a sentence into its character occurrence list. */
    static List<Occurrence> sentenceOccurrences(List<String> sentence) {
       []
    }

    /** The `dictionaryByOccurrences` is a `Map` from different occurrences to a sequence of all
     *  the words that have that occurrence count.
     *  This map serves as an easy way to obtain all the anagrams of a word given its occurrence list.
     *
     *  For example, the word "eat" has the following character occurrence list:
     *
     *     `List(('a', 1), ('e', 1), ('t', 1))`
     *
     *  Incidentally, so do the words "ate" and "tea".
     *
     *  This means that the `dictionaryByOccurrences` map will contain an entry:
     *
     *    List(('a', 1), ('e', 1), ('t', 1)) -> Seq("ate", "eat", "tea")
     *
     */

    @Lazy
    static Map<List<Occurrence>, List<String>> dictionaryByOccurrences = [:]

}
