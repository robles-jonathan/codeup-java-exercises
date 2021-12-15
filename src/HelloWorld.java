public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Will this be read?

        //Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 210;
        System.out.println(myFavoriteNumber);

        //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Hello, welcome to my blog";
        System.out.println(myString);
        //Change your code to assign a character value to myString. What do you notice?  Will not work, String is provided not char

        //Change your code to assign the value 3.14159 to myString. What happens? Will not work, double provided not String

        //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens? myNumber has not been initialized

        //Change your code to assign the value 3.14 to myNumber. What do you notice? Will not work, double provided not Long
//        float myNumber = 3.14F;
        //or
        float myNumber = (float)3.14;
        System.out.println(myNumber);

        //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does? Because Long does not recognize decimal

        //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        // We can add F literal notation to the end of the number.
        // ex. float myNumber = 3.14F;
        // Or we can cast to a float.
        // ex. float myNumber = (float)3.14;
        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        int y = 5;
        System.out.println(++y);
        System.out.println(y);
//        What is the difference between the above code blocks? Explain why the code outputs what it does. x++ does a post increment, ++y does a pre increment

//        Try to create a variable named class. What happens? Will not work, class is considered a keyword;
//    int class = 232;


        //Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        //Exception in thread "main" java.lang.ClassCastException: java.lang.String incompatible with java.lang.Integer
        //	at java.base/java.lang.ClassCastException.<init>(ClassCastException.java:71)
        //	at HelloWorld.main(HelloWorld.java:42)
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        //java: incompatible types: java.lang.String cannot be converted to int
//        int three = (int) "three";

        //Rewrite following expressions using shorthand
//        int x = 4;
//        x = x + 5;
        int a = 4;
        a += 5;
        System.out.println(a);
//        int x = 3;
//        int y = 4;
//        y = y * x;
        int b = 3;
        int c = 4;
        b *= c;
        System.out.println(b);

//        int x = 10;
//        int y = 2;
//        x = x / y;
//        y = y - x;
        int d = 10;
        int e = 2;
//        d /= e;
        e -= d;
        System.out.println("10/2 = " + d);
        System.out.println("2-10 = " + e);

        //What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
        //
        //Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//        byte w = 129;
        System.out.println(Byte.MAX_VALUE);

        //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~LECTURE~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        int month = 12;


//        System.out.println(month);

        short daysInAYear = 365;
//        System.out.println(daysInAYear);

        String greeting = "Hello, welcome to my blog!";

        String name;
        name = "Jonathan";

//        System.out.println(greeting);

        float pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679F;
//        double pi = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
//        System.out.println(pi);

        final String API_KEY = "lkjaflkj3#$4lkjafo0p";

        int firstNumber = 20;
        int secondNumber = 20;
//        System.out.println(firstNumber / secondNumber);

        byte dayOfMonth = 28;
        byte birthday = 7;

        //Implicit Casting - less specific data type, to a more specific data type.
        int result = dayOfMonth + birthday;

        //Explicit Casting - more specific data type, to a less specific data type.

    }

    // this is a comment that reads words.



}
