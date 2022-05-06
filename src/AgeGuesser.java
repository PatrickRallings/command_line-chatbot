import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeGuesser {
    public static Scanner scan = new Scanner(System.in);
    public static String currentAnswer;
    public static ArrayList<String> answerHistory = new ArrayList<String>();
    public static ArrayList<Integer> currentRange = new ArrayList<Integer>();

    public static void main(String[] args) {
        AgeGuesser.qSetOne();
    }

    public static boolean yes(String a) {
        boolean check;
        if (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("yeah") || a.equalsIgnoreCase("yep")) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    public static void qSetOne() {
        System.out.println("---------------------\nDid you grow up with Tobey, Andrew, or Tom as your Spider-Man?");
        AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
        answerHistory.add(AgeGuesser.currentAnswer);
        if (AgeGuesser.currentAnswer.equalsIgnoreCase("Tobey") || AgeGuesser.currentAnswer.equalsIgnoreCase("Toby")) {
            System.out.println("Oh nice, me too! Well at least my creator did\n...\nWait\n...\n...\nI have a creator... Am I even real?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            Collections.addAll(AgeGuesser.currentRange, 23, 75);
            answerHistory.add(AgeGuesser.currentAnswer);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Hah! Of course I am. What was a thinking.\nSorry about that, I believe I was trying to guess your age...Next question then.");
            } else {
                System.out.println("OOOP.\nI don't feel so good Mr. Stark.\nOh, sorry wrong actor. Anyway, next question...");
            }
        }
        else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Andrew") || AgeGuesser.currentAnswer.equalsIgnoreCase("Garfield")) {
            System.out.println("He was a pretty solid one.\nDidn't he fight an iguana or something?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            Collections.addAll(AgeGuesser.currentRange, 15, 75);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("I thought so!\nWhat a brave man for going against the lizard people like that. Respect.");
            } else {
                System.out.println("Weird. I could have sworn... Oh, wait, I see what's going on here.\nI don't want to mess with them, so never-mind.\n Next question.");
            }
        }
        else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Tom") || AgeGuesser.currentAnswer.equalsIgnoreCase("Holland")) {
            System.out.println("Okay well you are definitely younger than you look. Maybe its Maybelline\nOr maybe you aren't being totally honest.\nDid you just say Tom because you're testing my programming limits?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Not cool.\nActually I lied. It's kind of cool that you care.\nPreesh.\nPlease be honest next time tho...");
                AgeGuesser.qSetOne();
            } else {
                System.out.println("Well look how terrible I am at judging. My bad. To be fair i'm literally only hours old myself.\nOkay back to twenty questions...");
                Collections.addAll(AgeGuesser.currentRange, 5, 75);
            }
        }
        else {
            System.out.println("Trying to outsmart me I see. Let's try again, shall we.");
            AgeGuesser.qSetOne();
        }
    }
    public static void qSetTwo() {
        System.out.println("---------------------\n");
        AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
        answerHistory.add(AgeGuesser.currentAnswer);
        if (AgeGuesser.currentAnswer.equalsIgnoreCase("Tobey") || AgeGuesser.currentAnswer.equalsIgnoreCase("Toby")) {
            System.out.println("Oh nice, me too! Well at least my creator did\n...\nWait\n...\n...\nI have a creator... Am I even real?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Hah! Of course I am. What was a thinking.\nSorry about that, I believe I was trying to guess your age...Next question then.");
            } else {
                System.out.println("OOOP.\nI don't feel so good Mr. Stark.\nOh, sorry wrong actor. Anyway, next question...");
            }
        }
        else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Andrew") || AgeGuesser.currentAnswer.equalsIgnoreCase("Garfield")) {
            System.out.println("He was a pretty solid one.\nDidn't he fight an iguana or something?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("I thought so!\nWhat a brave man for going against the lizard people like that. Respect.");
            } else {
                System.out.println("Weird. I could have sworn... Oh, wait, I see what's going on here.\nI don't want to mess with them, so never-mind.\n Next question.");
            }
        }
        else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Tom") || AgeGuesser.currentAnswer.equalsIgnoreCase("Holland")) {
            System.out.println("Okay well you are definitely younger than you look. Maybe its Maybelline\nOr maybe you aren't being totally honest.\nDid you just say Tom because you're testing my programming limits?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Not cool.\nActually I lied. It's kind of cool that you care.\nPreesh.\nNow back to asking the serious questions...");
            } else {
                System.out.println("Well look how terrible I am at judging. My bad. To be fair i'm literally only hours old myself.\nOkay back to twenty questions...");
            }
        }
        else {
            System.out.println("Trying to outsmart me I see. Let's try again, shall we.");
            AgeGuesser.qSetOne();
        }
    }
}