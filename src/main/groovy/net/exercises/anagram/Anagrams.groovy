package net.exercises.anagram

class Anagrams {

    /** Converts the word into its character occurrences list.
     *
     *  Note: the uppercase and lowercase version of the character are treated as the
     *  same character, and are represented as a lowercase character in the occurrence list.
     */
    static List<List> wordOccurrences(String word) {
        []
    }

    /** Converts a sentence into its character occurrence list. */
    static List<List> sentenceOccurrences(List<String> sentence) {
        []
    }

    /** The `dictionaryByOccurrences` is a `Map` from different occurrences to a sequence of all
     *  the words that have that occurrence count.
     *  This map serves as an easy way to obtain all the anagrams of a word given its occurrence list.
     *
     *  For example, the word "eat" has the following character occurrence list:
     *
     *     `[['a', 1], ['e', 1], ['t', 1])`
     *
     *  Incidentally, so do the words "ate" and "tea".
     *
     *  This means that the `dictionaryByOccurrences` map will contain an entry:
     *
     *    [['a', 1], ['e', 1], ['t', 1]] -> ["ate", "eat", "tea"]
     *
     */

    @Lazy
    static Map<List<List>, List<String>> dictionaryByOccurrences = [:]

    /** Returns all the anagrams of a given word. */
    static List<String> wordAnagrams(String word) {
        []
    }

    /** Returns the list of all subsets of the occurrence list.
     *  This includes the occurrence itself, i.e. `[['k', 1], ['o', 1]]`
     *  is a subset of `[['k', 1], ['o', 1]]`.
     *  It also include the empty subset `[]`.
     *
     *  Example: the subsets of the occurrence list `[['a', 2], ['b', 2]]` are:
     *
     *    [
     *      [],
     *      [['a', 1]],
     *      [['a', 2]],
     *      [['b', 1]],
     *      [['a', 1], ['b', 1]],
     *      [['a', 2), ['b', 1]],
     *      [['b', 2]],
     *      [['a', 1], ['b', 2]],
     *      [['a', 2], ['b', 2]]
     *    ]
     *
     *  Note that the order of the occurrence list subsets does not matter -- the subsets
     *  in the example above could have been displayed in some other order.
     */
    static List<List<List>> combinations(List<List> occurrences) {
        []
    }
}
