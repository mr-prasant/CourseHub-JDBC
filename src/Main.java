import org.mindrot.jbcrypt.BCrypt;

public class Main {
    
        public static void main(String[] args) {
        String text = "Welcome to Course Hub.";

        System.out.println(text + " converted into " + BCrypt.hashpw(text, BCrypt.gensalt()));
    }
}