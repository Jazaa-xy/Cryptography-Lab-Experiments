import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

public class PasswordHashing {
    public static String hashWithoutSalt(String password) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        return Base64.getEncoder().encodeToString(md.digest(password.getBytes("UTF-8")));
    }

    public static String hashWithSalt(String password, byte[] salt) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt);
        return Base64.getEncoder().encodeToString(md.digest(password.getBytes("UTF-8")));
    }

    public static void main(String[] args) throws Exception {
        String password = "ITM_User@2026";

        // Without Salt (Same password always produces identical hash)
        System.out.println("Plain Password: " + password);
        System.out.println("Unsalted Hash 1: " + hashWithoutSalt(password));
        System.out.println("Unsalted Hash 2: " + hashWithoutSalt(password));

        // With Random 16-byte Salt (Produces unique hash every time)
        SecureRandom random = new SecureRandom();
        byte[] salt1 = new byte[16];
        byte[] salt2 = new byte[16];
        random.nextBytes(salt1);
        random.nextBytes(salt2);

        System.out.println("Salted Hash 1:   " + hashWithSalt(password, salt1));
        System.out.println("Salted Hash 2:   " + hashWithSalt(password, salt2));
    }
}
