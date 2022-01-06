public class Penquin {
    private static String name;
    private static int weight;
    private static String species;
    private static char sex;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Penquin.name = name;
    }

    public static int getWeight() {
        return weight;
    }

    public static void setWeight(int weight) {
        Penquin.weight = weight;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Penquin.species = species;
    }

    public static char getSex() {
        return sex;
    }

    public static void setSex(char sex) {
        Penquin.sex = sex;
    }

    public Penquin() {
    }

    public static boolean canFly(){
        return false;
    }

    public static boolean areEvil(){
        return true;
    }

    public static void main(String[] args) {

    }
}
