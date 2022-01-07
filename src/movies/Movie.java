package movies;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    // FIELDS
    private String name;
    private String category;

    // EMPTY CONSTRUCTOR 
    public Movie(){

    }

    // CONSTRUCTOR WITH ONE ARG 
    public Movie(String name){
        this.name = name;
    }

    // CONSTRUCTOR WITH TWO ARGS
    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // GETTERS 
    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    //SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
