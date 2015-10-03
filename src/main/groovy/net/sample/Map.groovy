package net.sample


public class Map {

    public static void main(String[] args) {

        List<String> personNames = Arrays.asList("John,Smith", "Bob,Marley", "John,Lennon")

        List<Person> result = new ArrayList<>();
        for (String name : personNames) {
            String[] firstLastName = name.split(",");

            Person person = new Person();
            person.firstName = firstLastName[0];
            person.lastName = firstLastName[1];
            result.add(person);
        }

        System.out.println(result)
    }

}

class Person {
    String firstName;
    String lastName;

    @Override
    String toString() {
        return firstName + " " + lastName
    }
}
