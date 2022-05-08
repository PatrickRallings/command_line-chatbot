import java.io.*;
import java.util.HashMap;

public class Serializing {

    public static void write(String userInput, String botOutput) {
        HashMap<String, String> e = new HashMap<>();
        e.put(userInput, botOutput);
        try {
            FileOutputStream fileOut = new FileOutputStream("storedData.pat", true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static String read(String checkUserInput) {
        String tempCheck;
        HashMap<String, String> e = null;
        try {
            FileInputStream fileIn = new FileInputStream("storedData.pat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (HashMap<String, String>) in.readObject();
            tempCheck = e.get(checkUserInput);
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
            return null;
        }

        return tempCheck;
    }
}