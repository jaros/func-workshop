package net.sample


public class Map {

    public static void main(String[] args) {

        def personNames =["John,Smith", "Bob,Marley", "John,Lennon"]

        def result = [];
        for (String name : personNames) {
            String[] firstLastName = name.split(",")

            result.add(new Person(firstName: firstLastName[0], lastName: firstLastName[1]))
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
