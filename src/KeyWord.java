import java.util.Scanner;

public class KeyWord {
    public static void main(String[] args)
    {
        System.out.println("hello i am echo, i will return every input you will give me," +
                " to stop the program enter 'EXIT' ");
        Scanner inputRead = new Scanner(System.in);
        while (true){
            String input = inputRead.nextLine();
            if (input.equals("EXIT")) {
                System.out.println("you decided to exit, goodBye!");
                break;
            }
            System.out.println(input);
        }
    }
}