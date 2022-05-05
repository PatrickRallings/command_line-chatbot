import java.util.Scanner;

public class AgeGuesser {
    public static Scanner scan = new Scanner(System.in);
    public static String currentAnswer;

    public static void main(String[] args) {
        q("Do you have an age?");
    }
    public static void q(String q) {
        System.out.println(q);
        AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
    }
    public static boolean yes(String a) {
        boolean check;
        if (a.equalsIgnoreCase("yes")||a.equalsIgnoreCase("yeah")||a.equalsIgnoreCase("yep")) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }
    public static void narrow1(boolean b) {
        if (b) {
            System.out.println("Okay, I thought you might.");
        }
    }
}