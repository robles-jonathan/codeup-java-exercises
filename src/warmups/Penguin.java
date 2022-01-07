package warmups;

public class Penguin {
    private static String name;
    private static int weight;
    private static String species;
    private static char sex;
    //empty constructor
    public Penguin() {

    }

    //getter
    public static String getName() {
        return name;
    }

    //setter
    public static void setName(String name) {
        Penguin.name = name;
    }

    //getter
    public static int getWeight() {
        return weight;
    }

    //setter
    public static void setWeight(int weight) {
        Penguin.weight = weight;
    }

    //gettter
    public static String getSpecies() {
        return species;
    }

    //setter
    public static void setSpecies(String species) {
        Penguin.species = species;
    }

    //getter
    public static char getSex() {
        return sex;
    }

    //setter
    public static void setSex(char sex) {
        Penguin.sex = sex;
    }

    //public static Method
    public static boolean canFly(){
        return false;
    }

    //public static Method
    public static boolean areEvil(){
        return true;
    }

    //Public Static Main Method
    public static void main(String[] args) {
        Penguin charlie = new Penguin();
        charlie.name = "Charlie";
        System.out.println(charlie.getName());
        Penguin velma = new Penguin();
        velma.name = "Velma";
        System.out.println(velma.getName());


    }
}
