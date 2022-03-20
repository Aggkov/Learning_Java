public class Person implements Comparable<Person> {
    String firstName;
    String lastName;

    public Person(String firstName, String surName) {
        this.firstName = firstName;
        lastName = surName;
    }

    //Sorts Objects in array. If lastname matches compare two firstnames. If not compare lastnames.
    @Override
    public int compareTo(Person o) {
        if (lastName.equals(o.lastName))
            return firstName.compareTo(o.firstName);
        return lastName.compareTo(o.lastName);
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}