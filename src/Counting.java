import static java.lang.Double.parseDouble;

public class Counting {
    public static void main() throws InterruptedException {
        InputOutput.question("That was fun! Let's play another game.","How about you pick a number and I will count to it.","What will your number be?");
        InputOutput.number = tryParseDouble(InputOutput.currentAnswer);
        while (InputOutput.number == null) {
            InputOutput.question("That doesn't seem to be a number.","Please enter a number:");
            InputOutput.number = tryParseDouble(InputOutput.currentAnswer);
        }
        InputOutput.statement("Okay, your number is "+InputOutput.number);
        InputOutput.question("How much delay should I have between numbers (per tenth of a second)?","(Example: 10 would mean I count one number per second)");
        InputOutput.timer = (tryParseInt(InputOutput.currentAnswer));
        while (InputOutput.timer == null) {
            InputOutput.question("That doesn't seem to be a number.","Please enter how much delay should I have between numbers (per tenth of a second)","(Example: 10 would mean I count one number per second)");
            InputOutput.timer = tryParseInt(InputOutput.currentAnswer);
        }
        double delay = InputOutput.timer*.1;
        InputOutput.statement("Okay, the delay between numbers will be "+delay+" seconds.","Let's begin!");
        count(InputOutput.number);
    }
    public static Double tryParseDouble(String s) {
        try {
            return parseDouble(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    public static Integer tryParseInt(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    public static void count(Double num) throws InterruptedException {
        if (num > 0.0) {
            for (double i = 0; i < num; i++) {
                InputOutput.statementStatic((InputOutput.timer*100), String.valueOf(i));
            }
            InputOutput.statementStatic((InputOutput.timer*100), String.valueOf(num));
        } else if (num == 0.0) {
            InputOutput.statementStatic((InputOutput.timer*100), String.valueOf(num));
        } else {
            for (double i = 0; i > num; i--) {
                InputOutput.statementStatic((InputOutput.timer*100), String.valueOf(i));
            }
            InputOutput.statementStatic((InputOutput.timer*100), String.valueOf(num));
        }
        InputOutput.statement("Done! That was fun.");
    }
}
