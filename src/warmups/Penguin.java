package warmups;

public class Penguin {
    private static String name;
    private static int weight;
    private static String species;
    private static char sex;
    public Penguin() {

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Penguin.name = name;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Penguin.weight = weight;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Penguin.species = species;
    }

    public static char getSex() {
        return sex;
    }

    public static void setSex(char sex) {
        Penguin.sex = sex;
    }

    public static boolean canFly(){
        return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public static void main(String[] args) {
        Penguin charlie = new Penguin();
        charlie.name = "Charlie";
        System.out.println(charlie.getName());
        Penguin velma = new Penguin();
        velma.name = "Velma";
        System.out.println(velma.getName());


    }
}
