package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {


    public static Movie newMovie(){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Enter movie title: ");
            String title = sc.nextLine();
            System.out.printf("Enter movie category: ");
            String category = sc.nextLine();
            return new Movie(title, category); // creating a new Movie object
        }
    }


    public static Movie[] addMovie(Movie[] movies, Movie movie) {
        Movie[] arrayCopy = Arrays.copyOf(movies, movies.length + 1);
        arrayCopy[arrayCopy.length - 1] = movie;
        return arrayCopy;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            Input userInput = new Input();
            MoviesArray movie = new MoviesArray();
            Movie[] movies = movie.findAll();


            System.out.println("What would you like to do?\n");
            System.out.printf("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category\n6 - add a new movie\nEnter your choice: ");

            choice = userInput.getInt();

            switch (choice) {
                case 0:
                    System.out.println("Thank you come again.");
                    break;
                case 1:
                    for(Movie m : movies){
                        System.out.print("\nAll Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                        System.out.print("\n=======================================\n");
                    }
                    break;
                case 2:
                    for(Movie m : movies){
                        if(m.getCategory().equals("animated")){
                            System.out.print("\nAnimated Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                            System.out.print("\n=======================================\n");
                        }
                    }
                    break;
                case 3:
                    for(Movie m : movies){
                        if(m.getCategory().equals("drama")){
                            System.out.print("\nDrama Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                            System.out.print("\n=======================================\n");
                        }
                    }
                    break;
                case 4:
                    for(Movie m : movies){
                        if(m.getCategory().equals("horror")){
                            System.out.print("\nHorror Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                            System.out.print("\n=======================================\n");
                        }
                    }
                    break;
                case 5:
                    for(Movie m : movies){
                        if(m.getCategory().equals("scifi")){
                            System.out.print("\nSci-fi Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                            System.out.print("\n=======================================\n");
                        }
                    }
                    break;
                case 6:
                    movies = addMovie(movies, newMovie());
                    for(Movie m : movies){
                        System.out.print("\nAll Movies\nTitle: " + m.getName() + "\nCategory: " + m.getCategory());
                        System.out.print("\n=======================================\n");
                    }
                    break;
                default:
                    System.out.println("That is not a choice, try again.\n\n");
            }
        }while (choice != 0);
    }
}