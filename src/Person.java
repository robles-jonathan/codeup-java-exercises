public class Person{
    private String name;

    //returns the persons name
    public String getName(){
        return name;
    }

    // changes the name property to the passed value
    public void setName(String name){
        this.name = name;
    }

    //prints a message to the console using the person's name
    String sayHello(){
        return String.format("Hello %s, nice to meet you.", name);
    }

    //constructor that accepts a string value and sets the person's name to the passed string
    public Person(String name){
        this.name = name;
    }

    //create a main method on the class that creates a new Person object and tests the above methods
    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        person1.sayHello();
//        person1.setName("James");
//        System.out.println("\n" + person1.getName());


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); // true
//        System.out.println(person1 == person2); //false

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); //true

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName()); //John
//        System.out.println(person2.getName()); //John
//        person2.setName("Jane");
//        System.out.println(person1.getName()); //Jane
//        System.out.println(person2.getName()); //Jane


    }
}
