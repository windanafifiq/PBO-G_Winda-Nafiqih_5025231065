
/**
 * Write a description of class InputReader here.
 *
 * @author Winda Nafiqih Irawan
 * @version 9 Oktober 2024
 */
import java.util.Scanner;

public class InputReader {
    private Scanner scanner;

    public InputReader() {
        scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("> ");
        return scanner.nextLine();
    }
}
