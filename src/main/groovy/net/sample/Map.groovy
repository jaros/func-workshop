package net.sample


def personNames =["John,Smith", "Bob,Marley", "John,Lennon"]

def result = personNames.collect {name ->
    def (first, last) = name.tokenize(',')
    new Person(firstName: first, lastName: last)
}

println(result)

class Person {
    String firstName
    String lastName

    @Override
    String toString() {
        firstName + " " + lastName
    }
}
