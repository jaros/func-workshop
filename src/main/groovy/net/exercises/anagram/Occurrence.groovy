package net.exercises.anagram


class Occurrence {
    String character
    int amount

    static def occurrence(String character, Integer amount) {
        new Occurrence(character: character, amount: amount)
    }

    @Override
    String toString() {
        return character + ':' + amount
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (getClass() != o.class) return false

        Occurrence that = o as Occurrence

        that.character == character && that.amount == amount
    }

    int hashCode() {
        int result
        result = character.hashCode()
        result = 31 * result + amount
        result
    }
}
