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


    /*********************************************************************
     *
     * OPTIONAL TASKS
     *
     *********************************************************************/


    /** Subtracts occurrence list `y` from occurrence list `x`.
     *
     *  The precondition is that the occurrence list `y` is a subset of
     *  the occurrence list `x` -- any character appearing in `y` must
     *  appear in `x`, and its frequency in `y` must be smaller or equal
     *  than its frequency in `x`.
     *
     *  Note: the resulting value is an occurrence - meaning it is sorted
     *  and has no zero-entries.
     */
    static List<List> subtract(List<List> x, List<List> y) {
        []
    }

    /** Returns a list of all anagram sentences of the given sentence.
     *
     *  An anagram of a sentence is formed by taking the occurrences of all the characters of
     *  all the words in the sentence, and producing all possible combinations of words with those characters,
     *  such that the words have to be from the dictionary.
     *
     *  The number of words in the sentence and its anagrams does not have to correspond.
     *  For example, the sentence `["I", "love", "you"]` is an anagram of the sentence `["You", "olive"]`.
     *
     *  Also, two sentences with the same words but in a different order are considered two different anagrams.
     *  For example, sentences `["You", "olive"]` and `["olive", "you"]` are different anagrams of
     *  ["I", "love", "you"]`.
     *
     *  Here is a full example of a sentence `["Yes", "man"]` and its anagrams for our dictionary:
     *
     *    [
     *      [en, as, my],
     *      [en, my, as],
     *      [man, yes],
     *      [men, say],
     *      [as, en, my],
     *      [as, my, en],
     *      [sane, my],
     *      [Sean, my],
     *      [my, en, as],
     *      [my, as, en],
     *      [my, sane],
     *      [my, Sean],
     *      [say, men],
     *      [yes, man]
     *    ]
     *
     *  The different sentences do not have to be output in the order shown above - any order is fine as long as
     *  all the anagrams are there. Every returned word has to exist in the dictionary.
     *
     *  Note: in case that the words of the sentence are in the dictionary, then the sentence is the anagram of itself,
     *  so it has to be returned in this list.
     *
     *  Note: There is only one anagram of an empty sentence.
     */
    static List<List<String>> sentenceAnagrams(List<String> sentence) {
        []
    }

}
