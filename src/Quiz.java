import java.util.ArrayList;

public class Quiz {
    public static int numCorrect = 0;
    public static void main(String[] args) throws InterruptedException {
        InputOutput.statement("That went pretty well.",InputOutput.name+", you are really good at telling me numbers to count!","Wait a sec. I have a great idea. Let's do a little miniature programming quiz!","I know, my best idea yet.","It's going to have three questions that test basic programming concepts. Let's begin.","Only enter the corresponding letter for your chosen answer)");
        Quiz.questionOne();
        Quiz.questionTwo();
        Quiz.questionThree();
        if (numCorrect == 1||numCorrect == 2) {
            InputOutput.statement("That concludes the quiz.", "You had a total "+numCorrect+" correct. Could have been worse!");
        } else if (numCorrect == 3) {
            InputOutput.statement("That concludes the quiz.", "You got a 100%, great job!");
        } else {
            InputOutput.statement("That concludes the quiz.", "You got 0 correct. You may have to study a bit...");
        }
    }
    public static void questionOne() throws InterruptedException {
        InputOutput.question("Which one of the following CSS properties affects the curvature of an element's corner?","A: Border-Left","B: Border-Radius","C: Border-Width","D: Border-Style");
        if (InputOutput.currentAnswer.equalsIgnoreCase("B")||InputOutput.currentAnswer.equalsIgnoreCase("B: Border-Radius")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Sorry, that is not correct.");
        }
    }
    public static void questionTwo() throws InterruptedException {
        InputOutput.question("Java and JavaScript are the same programming language.","A: True","B: False");
        if (InputOutput.currentAnswer.equalsIgnoreCase("B")||InputOutput.currentAnswer.equalsIgnoreCase("False")||InputOutput.currentAnswer.equalsIgnoreCase("B: False")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Sorry, that is not correct.");
        }
    }
    public static void questionThree() throws InterruptedException {
        InputOutput.question("Which of the following is an acceptable way to both declare and assign value of 'string' to a variable 'x' in JavaScript?","A: let x = 'string';","B: var x = 'string';","C: const x = 'string';","D: All of the Above");
        if (InputOutput.currentAnswer.equalsIgnoreCase("D")||InputOutput.currentAnswer.equalsIgnoreCase("All of the Above")||InputOutput.currentAnswer.equalsIgnoreCase("D: All of the Above")) {
            numCorrect++;
            InputOutput.statement("Correct!");
        } else {
            InputOutput.statement("Sorry, that is not correct.");
        }
    }
}
