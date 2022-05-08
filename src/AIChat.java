public class AIChat {

    public static void main(String[] args) throws InterruptedException {
        String lastAnswer = null;
        InputOutput.question("Hey there!");
        while (true) {
            System.out.println("Developer Tool --->"+Serializing.read("hey"));
            if (InputOutput.currentAnswer == lastAnswer) {
                InputOutput.currentAnswer = AgeGuesser.scan.nextLine().toLowerCase();
            }
            else if (Serializing.read(InputOutput.currentAnswer) == null ) {
                lastAnswer = InputOutput.currentAnswer;
                InputOutput.question("***PatBot Training Initialized*** What should my response to '"+lastAnswer+"' be?");
                Serializing.write(lastAnswer, InputOutput.currentAnswer);
                InputOutput.statement("*** Thanks! So, back to what you said before...***PatBot Training Complete***");
                InputOutput.question("Anyway, in response to '"+lastAnswer+"':", InputOutput.currentAnswer);
            } else {
                InputOutput.question(Serializing.read(InputOutput.currentAnswer));
            }
        }
    }
}
