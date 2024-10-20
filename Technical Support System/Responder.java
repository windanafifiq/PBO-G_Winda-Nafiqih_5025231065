
/**
 * Write a description of class Responder here.
 *
 * @author Winda Nafiqih Irawan
 * @version 9 Oktober 2024
 */
public class Responder {
    public String generateResponse(String input) {
        if (input.toLowerCase().contains("can't save")) {
            return "It sounds like there could be an issue with your permissions. Please check your access rights.";
        } else if (input.toLowerCase().contains("crashes")) {
            return "Crashes can be caused by many issues. Could you provide more details about when it crashes?";
        } else {
            return "That sounds interesting. Tell me more...";
        }
    }
}
