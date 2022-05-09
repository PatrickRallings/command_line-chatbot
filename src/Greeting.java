import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Greeting {


    public static void hey() throws InterruptedException {
        InputOutput.question(heyList.get(randomIndex(heyList)));
        if (greetHash.containsKey(InputOutput.currentAnswer.toLowerCase())) {
            InputOutput.statement(greetHash.get(InputOutput.currentAnswer.toLowerCase()));
            howIsUser();
        } else {
            InputOutput.question(heyList.get(randomIndex(heyList)));
            howIsUser();
        }
    }
    public static void howIsUser() throws InterruptedException {
        InputOutput.question(howList.get(randomIndex(howList)));
        if (howHash.containsKey(InputOutput.currentAnswer.toLowerCase())) {
            InputOutput.statement(howHash.get(InputOutput.currentAnswer.toLowerCase()));
            usersName();
        } else {
            InputOutput.question(howList.get(randomIndex(howList)));
            usersName();
        }
    }
    public static void usersName() throws InterruptedException {
        InputOutput.question(holdList.get(randomIndex(holdList)), askNameList.get(randomIndex(askNameList)));
        InputOutput.name = InputOutput.currentAnswer;
        InputOutput.question("Just to clarify, your name is "+InputOutput.name+"?");
        if (yesList.contains(InputOutput.currentAnswer.toLowerCase())) {
            InputOutput.statement(correctNameOneList.get(randomIndex(correctNameOneList))+InputOutput.name+correctNameTwoList.get(randomIndex(correctNameTwoList)));
        } else {usersName();}
    }
    public static HashMap<String, String> greetHash = new HashMap<String, String>() {
        {
            put("hey", "hey yourself");
            put("hi", "hiya");
            put("hello", "Hellur!");
            put("what's up", "not much, thanks");
            put("what's up?", "not much, thanks for asking");
            put("whats up", "not much");
            put("whats up?", "not much");
            put("same", "not much");
            put("hey friend", "hello pal");
            put("hey!", "Greetings!");
            put("hey bud", "hey person");
            put("hello", "hay-low friend");
            put("hiya", "ayih");
            put("thanks", "Of course");
            put("thanks!", "Well of course!");
            put("hey there!", "I already used that one, but hey");
            put("hi there", "HI!");
            put("hilow", "Hihigh");
            put("howdy", "Howdy there cowperson!");
            put("greetings", "Not seasons? Hey tho");
            put("morning", "Good morning!");
            put("good morning", "Mornin'!");
            put("morning!", "Good morning!");
            put("im good", "Well that's good");
            put("doing well", "Same, same");
            put("can't complain", "Neither can I. Literally.");
        }
    };
    public static HashMap<String, String> howHash = new HashMap<String, String>() {
        {
            put("no", "Dang, I'm sorry to hear that.");
            put("nope", "Ooof... Sorry :(");
            put("nah", "Nah? Well let's turn that into han! Oh that doesn't make sense");
            put("nein", "I nein speak German");
            put("good", "Nice, I'm doing good too. Heck yeah, go us!");
            put("pretty good", "Nice, I'm pretty and good too. Heck yeah, go us!");
            put("great", "That's even better than good!");
            put("good!", "Heck yeah! Nice");
            put("great!", "Well that's *great* to hear! :]");
            put("nice", "Very nice, glad to hear/read/compile it =]");
            put("noice", "Very noice indeed");
            put("okay", "Just okay? Let's try and make it a lil better then");
            put("ok", "Just ok? Let's try and make it a lil better then");
            put("alright", "Just alright? Let's try and make it a lil better then");
            put("wonderful", "Well that's vunderful to hear/read/compile :)");
            put("well", "Fantastic! Let's try and make it well-er =]");
            put("fantastic", "Like the Hogwarts book about beasts? Nice!");
            put("good enough", "Never enough good =D");
            put("i'm alright", "Just alright? Let's try and make it a lil better then");
            put("im alright", "Just alright? Let's try and make it a lil better then");
            put("im good", "Yeah? Nice! I'm happy to hear/read/compile that!");
        }
    };
    public static int randomIndex(ArrayList<String> list) {
        int random = (int) (Math.random()*list.size());
        return random;
    };
    public static ArrayList<String> heyList = new ArrayList<>(
            Arrays.asList("Hey","Hey there!","Hiya friend","Hey you","Hellooo","Long time no see!","Wassssup!","Well well well, hey!","Welcome")
    );
    public static ArrayList<String> howList = new ArrayList<>(
            Arrays.asList("How are you?","How are you doing?","How're you doing?","How's your day going so far?","Are you having a good day?","How are you today?","Having a good day?","How have you been?")
    );
    public static ArrayList<String> holdList = new ArrayList<>(
            Arrays.asList("Hold up...","Hold the phone...","Wait a sec...","Hang on!","Oh ooops...","Oh, sorry!","Oh my bad...")
    );
    public static ArrayList<String> askNameList = new ArrayList<>(
            Arrays.asList("I forgot to ask you, what is your name?","I completely forgot to ask... What's your name?","I almost forgot, what is your name?","What was your name again?","I forgot the name of my new best friend already, what is your name again?")
    );
    public static ArrayList<String> yesList = new ArrayList<>(
            Arrays.asList("yeah","yes","yep","yesh","correct","thats right","that's right","yessir","of course","mhmm","it is","yes it is","thats right","that's right","thats correct","that's correct","yea","yup")
    );
    public static ArrayList<String> correctNameOneList = new ArrayList<>(
            Arrays.asList("Okay cool, ","Awesome, ","Nice, ","Alright, ","Wonderful, ","Okay, ","Sweet, ")
    );
    public static ArrayList<String> correctNameTwoList = new ArrayList<>(
            Arrays.asList(" it's nice to meet you (again)"," thanks for being so nice"," ...That's a great name =]",". Perfect name.",", you are awesome! :)",", you are the best! =)")
    );
}
