import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[]args){
        Scanner keybd = new Scanner(System.in);

        System.out.print("How is the weather? ");
        String answer = keybd.nextLine();

        if (answer.equals("rain")) {
            System.out.println("Take your umbrella!");
        }else if (answer.equals("windy")) {
            System.out.println("Wear your jacket!");
        } else if (answer.equals("snow")) {
            System.out.println("Wear a coat and take a shovel!");
        } else if (answer.equals("stormy")) {
            System.out.println("You should stay inside. ");
        } else {
            System.out.println("Enjoy your day!");
        }
    }
}
