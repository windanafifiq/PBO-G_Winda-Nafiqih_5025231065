
/**
 * Write a description of class CommandWords here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.HashMap;

public class CommandWords {
    private HashMap<String, String> validCommands;

    public CommandWords() {
        validCommands = new HashMap<>();
        validCommands.put("go", "Move in a direction");
        validCommands.put("quit", "Exit the game");
        validCommands.put("help", "Get help");
    }

    public boolean isCommand(String aString) {
        return validCommands.containsKey(aString);
    }

    public void showAll() {
        for (String command : validCommands.keySet()) {
            System.out.println(command);
        }
    }
}

