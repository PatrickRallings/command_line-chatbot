import java.io.*;
import java.util.HashMap;

public class Serializing {

    public static HashMap <String, String> tempData = new HashMap<>();
    public static void main(String[] args) {
        Serializing.readFirst();
//        write("test1 key", "test1 value");
//        write("test2 key", "test2 value");
//        System.out.println(read("test1 key"));
//        System.out.println(read("test2 key"));
    }
    public static void write(String userInput, String botOutput) {
        HashMap<String, String> e = new HashMap<>();
        e = tempData;
        e.put(userInput, botOutput);
        try {
            FileOutputStream fileOut = new FileOutputStream("storedData.pat", false);
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
    public static void readFirst() {
        try {
            FileInputStream fileIn = new FileInputStream("storedData.pat");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            tempData = (HashMap<String, String>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}