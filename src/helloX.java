import java.util.Scanner;

public class helloX {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("whats your name? ");
        String name = inputReader.nextLine();
        System.out.println("hello " + name);
    }
}
