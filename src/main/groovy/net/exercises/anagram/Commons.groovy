package net.exercises.anagram


class Commons {
    static List<String> loadDictionary() {
        getClass().getResource("/linuxwords.txt").readLines()
    }

}
