import java.util.Scanner;

public class AgeLimit {
    public static void main(String[] args) {
        System.out.println("how old are you? ");
        Scanner inputReader = new Scanner(System.in);
        int age = inputReader.nextInt();
        if (age < 18)
            System.out.println("go away!");
        else
            System.out.println("come in");
    }
}
