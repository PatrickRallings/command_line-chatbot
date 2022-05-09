import java.util.ArrayList;

public class Quiz {
    public static int numAttempted = 0;
    public static int numCorrect = 0;
    public static void main() throws InterruptedException {
        InputOutput.statement("That went pretty well.",InputOutput.name+", you are really good at telling me numbers to count!","Wait a sec. I have a great idea. Let's do a little miniature programming quiz!","I know, my best idea yet.","It's going to have three questions that test basic programming concepts. Let's begin.","(Only enter the corresponding letter for your chosen answer)");
        Thread.sleep(3500);
        Quiz.questionOne();
        Quiz.questionTwo();
        Quiz.questionThree();
            InputOutput.statement("That concludes the quiz.", "You had "+numCorrect+" correct out of "+numAttempted+" attempts.","Thank you for taking my quiz!");
    }
    public static void questionOne() throws InterruptedException {
        numAttempted++;
        InputOutput.question("Which one of the following CSS properties affects the curvature of an element's corner?","A: Border-Left","B: Border-Radius","C: Border-Width","D: Border-Style");
        if (InputOutput.currentAnswer.equalsIgnoreCase("B")||InputOutput.currentAnswer.equalsIgnoreCase("B: Border-Radius")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Sorry, that is not correct.","Let's try again!");
            questionOne();
        }
    }
    public static void questionTwo() throws InterruptedException {
        numAttempted++;
        InputOutput.question("Java and JavaScript are the same programming language.","A: True","B: False");
        if (InputOutput.currentAnswer.equalsIgnoreCase("B")||InputOutput.currentAnswer.equalsIgnoreCase("False")||InputOutput.currentAnswer.equalsIgnoreCase("B: False")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Sorry, that was not the right answer.","Try again please.");
            questionTwo();
        }
    }
    public static void questionThree() throws InterruptedException {
        numAttempted++;
        InputOutput.question("Which of the following is an acceptable way to both declare and assign value of 'string' to a variable 'x' in JavaScript?","A: let x = 'string';","B: var x = 'string';","C: const x = 'string';","D: All of the Above");
        if (InputOutput.currentAnswer.equalsIgnoreCase("D")||InputOutput.currentAnswer.equalsIgnoreCase("All of the Above")||InputOutput.currentAnswer.equalsIgnoreCase("D: All of the Above")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Nope, that was not it.","Try again.");
            questionThree();
        }
    }
}
