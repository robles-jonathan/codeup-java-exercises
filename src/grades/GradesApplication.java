package grades;


import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean response;
        HashMap <String, Student> students = new HashMap<>();
        Student student1 = new Student("Bruce Wayne"); //Batman
        Student student2 = new Student("Jefferson Pierce"); //BlackLightning
        Student student3 = new Student("Matthew Michael Murdock"); //Daredevil
        Student student4 = new Student("Floyd Lawton"); //Deadshot
        student1.addGrade(100);
        student1.addGrade(80);
        student1.addGrade(100);
        student2.addGrade(99);
        student2.addGrade(70);
        student2.addGrade(85);
        student3.addGrade(90);
        student3.addGrade(80);
        student3.addGrade(50);
        student4.addGrade(70);
        student4.addGrade(80);
        student4.addGrade(99);
        students.put("Batman", student1);
        students.put("BlackLightning", student2);
        students.put("Daredevil", student3);
        students.put("Deadshot", student4);
        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students:");
        for(String i : students.keySet()){
            System.out.printf("|%s| ", i);
        }
        do {
            System.out.println("\nWhat student would you like to see more information on?");
            String input = sc.nextLine();
            if (students.containsKey(input)) {
                String name = students.get(input).getName();
                String username = input;
                Double average = students.get(input).getGradeAverage();
                System.out.printf("Name: %s - GitHub Username: %s\nCurrent Average: %f\n", name, username, average);
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", input);
            }
            System.out.println("Would you like to see another student?");
            Input test = new Input();
            response = test.yesNo();
        }while(response);
        System.out.println("Have a nice day!");
    }

}
