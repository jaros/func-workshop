package net.sample


public class Map {

    public static void main(String[] args) {

        def personNames =["John,Smith", "Bob,Marley", "John,Lennon"]

        def result = [];
        for (String name : personNames) {
            def (first, last) = name.tokenize(',')
            result.add(new Person(firstName: first, lastName: last))
        }

        println(result)
    }

}

class Person {
    String firstName
    String lastName

    @Override
    String toString() {
        firstName + " " + lastName
    }
}
