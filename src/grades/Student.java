package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        double numberOfGrades = grades.size();
        for(double grade : grades) {
            sum += grade;
        }
        return sum/numberOfGrades;
    }


    public void setName(String name) {
        this.name = name;
    }
    Student(){

    }

    public static void main(String[] args) {
        Student s1 = new Student("Jonathan");
        s1.addGrade(100);
        s1.addGrade(50);
        s1.addGrade(100);
        System.out.println(s1.grades);
        System.out.println(s1.getGradeAverage());

    }

}
