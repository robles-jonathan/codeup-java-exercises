public class MethodsExercises {
    public static int addition(int num1, int num2){
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int division(int num1, int num2){
        return num1 / num2;
    }
    public static int remainder( int num1, int num2){
        return num1 % num2;
    }
    public static void main(String[] args) {
        System.out.println(addition(4, 5));
        System.out.println(subtraction(3, 4));
        System.out.println(multiplication(3, 4));
        System.out.println(division(40, 5));
        System.out.println(division(35, 5));
        System.out.println(remainder(388, 5));
//Food for thought: What happens if we try to divide by zero? What should happen?
    }

}
