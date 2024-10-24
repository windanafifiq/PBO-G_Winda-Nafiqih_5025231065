
/**
 * Write a description of class Parser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Parser {
    private CommandWords commands;
    private Scanner reader;

    public Parser() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        System.out.print("> ");
        String inputLine = reader.nextLine();
        String word1 = null;
        String word2 = null;

        Scanner tokenizer = new Scanner(inputLine);
        if (tokenizer.hasNext()) {
            word1 = tokenizer.next(); // Ambil kata pertama
            if (tokenizer.hasNext()) {
                word2 = tokenizer.next(); // Ambil kata kedua jika ada
            }
        }

        return new Command(word1, word2);
    }

    public void showCommands() {
        commands.showAll();
    }
}
