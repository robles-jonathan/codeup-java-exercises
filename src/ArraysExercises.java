import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] people, Person person) {
        Person[] arrayCopy = Arrays.copyOf(people, people.length + 1);
        arrayCopy[arrayCopy.length - 1] = person;
        return arrayCopy;
    }

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers); // it displays a variable where it is stored locally in the memory

        //Create an array that holds 3 Person Objects
        Person[] people = new Person[3];

        //Assign a new instance of the Person class to each element
        Person p1 = new Person("Tammy");
        Person p2 = new Person("Britney");
        Person p3 = new Person("Whitney");
        Person p4 = new Person("Gina");

        //Writing to the array
        people[0] = p1;
        people[1] = p2;
        people[2] = p3;

        people = addPerson(people, new Person("Khaleesi"));

        //Iterate through the array and print out the name of each person in the array.
        for (Person person : people) {
            System.out.println(person.getName());
        }


    }
}
