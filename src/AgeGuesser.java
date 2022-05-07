import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgeGuesser {
    public static Scanner scan = new Scanner(System.in);

    public static boolean ageNotGuessed = true;
    public static int age;
    public static ArrayList<String> answerHistory = new ArrayList<String>();
    public static ArrayList<Integer> currentRange = new ArrayList<Integer>();

    public static void main() throws InterruptedException {
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

    public static void qSetOne() throws InterruptedException {
        InputOutput.question("Which actor's Spider-Man is your favorite, Tobey, Andrew, or Tom?");
        if (InputOutput.currentAnswer.equalsIgnoreCase("Tobey") || InputOutput.currentAnswer.equalsIgnoreCase("Toby")) {
            InputOutput.question("Oh nice, same! Well at it's my creator's.","","Wait...","I have a creator...?","Am I even real?");
            Collections.addAll(AgeGuesser.currentRange, 23, 75);
            if (yes(InputOutput.currentAnswer)) {
                InputOutput.statement("Hah! Of course I am. What was a thinking.","Sorry about that, I believe I was trying to guess your age...","Next question then.");
            } else {
                InputOutput.statement("OOOP.","I don't feel so good Mr. Stark.","Oh, sorry wrong actor. Anyway, next question...");
            }
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("Andrew") || InputOutput.currentAnswer.equalsIgnoreCase("Garfield")) {
            InputOutput.question("He was a pretty solid one.","Didn't he fight an iguana or something?");
            Collections.addAll(AgeGuesser.currentRange, 15, 75);
            if (yes(InputOutput.currentAnswer)) {
                InputOutput.statement("I thought so!","What a brave man for going against the lizard people like that","Respect.");
            } else {
                InputOutput.statement("Weird. I could have sworn...","Oh, wait, I see what's going on here.","I don't want to mess with them, so never-mind.","Next question.");
            }
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("Tom") || InputOutput.currentAnswer.equalsIgnoreCase("Holland")) {
            InputOutput.question("Okay well you are definitely younger than you look. Maybe its Maybelline","Or maybe you aren't being totally honest.","Did you just say Tom because you're testing my programming limits?");
            answerHistory.add(InputOutput.currentAnswer);
            if (yes(InputOutput.currentAnswer)) {
                InputOutput.statement("Not cool.","Actually I lied. It's kind of cool that you care.","Preesh.","Please be honest next time tho...");
                AgeGuesser.qSetOne();
            } else {
                InputOutput.statement("Well look how terrible I am at judging.","My bad. To be fair i'm literally only hours old myself.","Okay back to twenty questions...");
                Collections.addAll(AgeGuesser.currentRange, 5, 75);
            }
        } else {
            InputOutput.statement("Trying to outsmart me I see. Let's try again, shall we.");
            AgeGuesser.qSetOne();
        }
    }

    public static void qSetTwo() throws InterruptedException {
        InputOutput.question("Have you ever gotten 20% off groceries on Wednesdays?");
        if (yes(InputOutput.currentAnswer)) {
            InputOutput.statement("Nice. I wish that I could get groceries","Or could shop in general.","Or could even eat.");
        } else {
            InputOutput.statement("Alright, that's one small step for this guessing game, and one giant","Actually, never-mind. Next question.");
            AgeGuesser.currentRange.set(1, 62);
        }
    }

    public static void qSetThree() throws InterruptedException {
        InputOutput.question("Out of these three options, which event was a big part of your childhood?","Civil Rights Movements, Watergate, PATCO Strike, Lewinsky Affair, 9/11, Trump Election, or none of the above?");
        if (InputOutput.currentAnswer.equalsIgnoreCase("Civil Rights") || InputOutput.currentAnswer.equalsIgnoreCase("Civil Rights Movement")) {
            InputOutput.statement("What an remarkable experience that must have been. Thanks for sharing that with me. Next question then...");
            AgeGuesser.currentRange.set(1, 70);
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("Watergate")) {
            InputOutput.statement("The only U.S. presidential resignation. That's wild. Next Q! ");
            AgeGuesser.currentRange.set(1, 60);
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("PATCO Strike") || InputOutput.currentAnswer.equalsIgnoreCase("PATCO")) {
            InputOutput.statement("Ahh, yes, the start of the trickle. Alright, that helps narrow it down a bit, thanks. Next Q.");
            AgeGuesser.currentRange.set(1, 50);
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("Lewinsky Affair") || InputOutput.currentAnswer.equalsIgnoreCase("Lewinsky") || InputOutput.currentAnswer.equalsIgnoreCase("Affair")) {
            InputOutput.statement("Looking back, all of the negative attention she got was pretty messed up. Poor girl. On to the next Q then!");
            AgeGuesser.currentRange.set(1, 40);
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("9/11") || InputOutput.currentAnswer.equalsIgnoreCase("September 11th") || InputOutput.currentAnswer.equalsIgnoreCase("Nine-Eleven")) {
            InputOutput.statement("Thanks for sharing that with me. Sorry to get dark on this one, but it is definitely a decade defining event.","Okay, next Q now though...");
            AgeGuesser.currentRange.set(1, 30);
        } else if (InputOutput.currentAnswer.equalsIgnoreCase("Trump Election") || InputOutput.currentAnswer.equalsIgnoreCase("Trump") || InputOutput.currentAnswer.equalsIgnoreCase("Donald Trump")) {
            InputOutput.statement("Ahh the decade of symbolic division. Nice. Actually not too nice to grow up in, sorry! Next question.");
            AgeGuesser.currentRange.set(1, 20);
        } else {
            InputOutput.statement("Okay you may have spelled something wrong.","Or maybe I did? IDK. Let's try again.");
            AgeGuesser.qSetThree();
        }
    }

    public static void qSetFour() throws InterruptedException {
        while (true) {
            InputOutput.question("Based off of your answers, I currently have your age somewhere between " + AgeGuesser.currentRange.get(0) + " and " + AgeGuesser.currentRange.get(1) + ".","Is your actual age inside of my range?");
            if (yes(InputOutput.currentAnswer)) {
                InputOutput.statement("Sweet. Now I'm going to narrow it down with some rapid-fire questions.");
                break;
            } else {
                InputOutput.statement("Oof. Swing and a miss. Let's try again.");
                AgeGuesser.currentRange.set(0, (AgeGuesser.currentRange.get(0))/2);
                AgeGuesser.currentRange.set(1, (AgeGuesser.currentRange.get(1))+15);
            }
        }
        binarySearch();
    }

    public static void binarySearch() throws InterruptedException {
        int binarySearchVal;
        while (true) {
            binarySearchVal = (((AgeGuesser.currentRange.get(1)-AgeGuesser.currentRange.get(0))/2)+AgeGuesser.currentRange.get(0));
            InputOutput.question("Are you "+binarySearchVal+" years old?");
            if (yes(InputOutput.currentAnswer)) {
                InputOutput.statement("Ahah! I knew I'd get it. Very nice.");
                break;
            } else if (InputOutput.currentAnswer.equalsIgnoreCase("No") || InputOutput.currentAnswer.equalsIgnoreCase("Nope")) {
                    InputOutput.question("Are you older or younger than "+binarySearchVal+"?");
                    if (InputOutput.currentAnswer.equalsIgnoreCase("Older") || InputOutput.currentAnswer.equalsIgnoreCase("old") || InputOutput.currentAnswer.equalsIgnoreCase("higher")) {
                    InputOutput.statement("So I was too low. In that case...");
                    AgeGuesser.currentRange.set(0, binarySearchVal);
                    } else if (InputOutput.currentAnswer.equalsIgnoreCase("Younger") || InputOutput.currentAnswer.equalsIgnoreCase("young") || InputOutput.currentAnswer.equalsIgnoreCase("lower")) {
                    InputOutput.statement("I was too high eh. Well, then...");
                    AgeGuesser.currentRange.set(1, binarySearchVal);
                    } else {
                    InputOutput.statement("Let's give this round another shot.");
                    }
            } else {
                InputOutput.statement("Let's try that one again.");
                continue;
            }
        }
    }
}