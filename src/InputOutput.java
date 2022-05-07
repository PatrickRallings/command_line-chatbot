import java.util.ArrayList;

public class InputOutput {

    public static String currentAnswer;

    public static void question(String... args) throws InterruptedException {
        System.out.println("---------------------------------------------------------------------");
            for (int i = 0; i < args.length; i++) {
                Thread.sleep((long)(Math.random() * 1000));
                System.out.println("[PatBot 3000]: "+args[i]);
            }
        InputOutput.currentAnswer = AgeGuesser.scan.nextLine();
    }
    public static void statement(String... args) throws InterruptedException {
        for (int i = 0; i < args.length; i++) {
            Thread.sleep((long)(Math.random() * 1000));
            System.out.println("[PatBot 3000]: "+args[i]);
        }
    }
}
