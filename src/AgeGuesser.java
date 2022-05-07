import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeGuesser {
    public static Scanner scan = new Scanner(System.in);
    public static String currentAnswer;
    public static boolean ageNotGuessed = true;
    public static int age;
    public static ArrayList<String> answerHistory = new ArrayList<String>();
    public static ArrayList<Integer> currentRange = new ArrayList<Integer>();

    public static void main(String[] args) {
        AgeGuesser.qSetOne();
        AgeGuesser.qSetTwo();
        AgeGuesser.qSetThree();
        AgeGuesser.qSetFour();
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
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Andrew") || AgeGuesser.currentAnswer.equalsIgnoreCase("Garfield")) {
            System.out.println("He was a pretty solid one.\nDidn't he fight an iguana or something?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            answerHistory.add(AgeGuesser.currentAnswer);
            Collections.addAll(AgeGuesser.currentRange, 15, 75);
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("I thought so!\nWhat a brave man for going against the lizard people like that. Respect.");
            } else {
                System.out.println("Weird. I could have sworn... Oh, wait, I see what's going on here.\nI don't want to mess with them, so never-mind.\nNext question.");
            }
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Tom") || AgeGuesser.currentAnswer.equalsIgnoreCase("Holland")) {
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
        } else {
            System.out.println("Trying to outsmart me I see. Let's try again, shall we.");
            AgeGuesser.qSetOne();
        }
    }

    public static void qSetTwo() {
        System.out.println("---------------------\nHave you ever used a senior citizen discount?");
        AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
        answerHistory.add(AgeGuesser.currentAnswer);
        if (yes(AgeGuesser.currentAnswer)) {
            System.out.println("Nice. I would too if I was old enough.\nOr could shop.\nOr was not a program made up of just a few lines.\nOOP.");
        } else {
            System.out.println("Alright, that's one small step for this guessing game, and one large\nActually, never-mind.");
            AgeGuesser.currentRange.set(1, 62);
        }
    }

    public static void qSetThree() {
        System.out.println("---------------------\nOut of these three options, which event was a big part of your childhood?\nCivil Rights Movements, Watergate, PATCO Strike, Lewinsky Affair, 9/11, Trump Election, or none of the above?");
        AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
        answerHistory.add(AgeGuesser.currentAnswer);
        if (AgeGuesser.currentAnswer.equalsIgnoreCase("Civil Rights") || AgeGuesser.currentAnswer.equalsIgnoreCase("Civil Rights Movement")) {
            System.out.println("What an remarkable experience that must have been. Thanks for sharing that with me. Next question then...");
            AgeGuesser.currentRange.set(1, 70);
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Watergate")) {
            System.out.println("The only U.S. presidential resignation. That's wild. Next Q! ");
            AgeGuesser.currentRange.set(1, 60);
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("PATCO Strike") || AgeGuesser.currentAnswer.equalsIgnoreCase("PATCO")) {
            System.out.println("Ahh, yes, the start of the trickle. Alright, that helps narrow it down a bit, thanks. Next Q.");
            AgeGuesser.currentRange.set(1, 50);
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Lewinsky Affair") || AgeGuesser.currentAnswer.equalsIgnoreCase("Lewinsky") || AgeGuesser.currentAnswer.equalsIgnoreCase("Affair")) {
            System.out.println("Looking back, all of the negative attention she got was pretty messed up. Poor girl. On to the next Q then!");
            AgeGuesser.currentRange.set(1, 40);
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("9/11") || AgeGuesser.currentAnswer.equalsIgnoreCase("September 11th") || AgeGuesser.currentAnswer.equalsIgnoreCase("Nine-Eleven")) {
            System.out.println("Thanks for sharing that with me. Sorry to get dark on this one, but it is definitely a decade defining event.\nOkay, next Q now though...");
            AgeGuesser.currentRange.set(1, 30);
        } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Trump Election") || AgeGuesser.currentAnswer.equalsIgnoreCase("Trump") || AgeGuesser.currentAnswer.equalsIgnoreCase("Donald Trump")) {
            System.out.println("Ahh the decade of symbolic division. Nice. Actually not too nice to grow up in, sorry! Next question.");
            AgeGuesser.currentRange.set(1, 20);
        } else {
            System.out.println("Okay you may have spelled something wrong.\nOr maybe I did? IDK. Let's try again.");
            AgeGuesser.qSetThree();
        }
    }

    public static void qSetFour() {
        while (true) {
            System.out.println("---------------------\nBased off of your answers, I currently have your age somewhere between " + AgeGuesser.currentRange.get(0) + " and " + AgeGuesser.currentRange.get(1) + ".\nIs your actual age inside of my range?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Sweet. Now I'm going to narrow it down with some rapid-fire questions.");
                break;
            } else {
                System.out.println("Oof. Swing and a miss. Let's try again.");
                AgeGuesser.currentRange.set(0, (AgeGuesser.currentRange.get(0))/2);
                AgeGuesser.currentRange.set(1, (AgeGuesser.currentRange.get(1))+15);
                continue;
            }
        }
        binarySearch();
    }

    public static void binarySearch() {
        int binarySearchVal;
        while (true) {
            binarySearchVal = (((AgeGuesser.currentRange.get(1)-AgeGuesser.currentRange.get(0))/2)+AgeGuesser.currentRange.get(0));
            System.out.println("---------------------\nAre you "+binarySearchVal+" years old?");
            AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
            if (yes(AgeGuesser.currentAnswer)) {
                System.out.println("Ahah! I knew I'd get it. Very nice.");
                break;
            } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("No") || AgeGuesser.currentAnswer.equalsIgnoreCase("Nope")) {
                    System.out.println("---------------------\nAre you older or younger than "+binarySearchVal+"?");
                    AgeGuesser.currentAnswer = AgeGuesser.scan.nextLine();
                    if (AgeGuesser.currentAnswer.equalsIgnoreCase("Older") || AgeGuesser.currentAnswer.equalsIgnoreCase("higher")) {
                    System.out.println("So I was too low. In that case...");
                    AgeGuesser.currentRange.set(0, binarySearchVal);
                    continue;
                    } else if (AgeGuesser.currentAnswer.equalsIgnoreCase("Younger") || AgeGuesser.currentAnswer.equalsIgnoreCase("lower")) {
                    System.out.println("I was too high eh. Well, then...");
                    AgeGuesser.currentRange.set(1, binarySearchVal);
                    continue;
                    } else {
                    System.out.println("Let's give this round another shot.");
                    continue;
                    }
            } else {
                System.out.println("Let's try that one again.");
                continue;
            }
        }
    }
}