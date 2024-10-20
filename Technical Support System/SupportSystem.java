
/**
 * Write a description of class SupportSystem here.
 *
 * @author Winda Nafiqih Irawan
 * @version 9 Oktober 2024
 */
public class SupportSystem {
    private InputReader reader;
    private Responder responder;

    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
    }

    public void start() {
        boolean finished = false;
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please tell us about your problem. Type 'bye' to exit our system.");

        while (!finished) {
            String input = reader.getInput();
            if (input.equalsIgnoreCase("bye")) {
                finished = true;
            } else {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
    }

    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}