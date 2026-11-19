import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESHash {
    public static String getSHA256(String input) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(input.getBytes("UTF-8"));
        StringBuilder hexString = new StringBuilder();
        for (byte b : hashBytes) {
            hexString.append(String.format("%02x", b));
        }
        return hexString.toString();
    }

    public static void main(String[] args) throws Exception {
        String message = "Secure Message for Cryptography Lab";
        String originalHash = getSHA256(message);

        // Generate 128-bit AES Key
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        // Encrypt Message
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        String encryptedText = Base64.getEncoder().encodeToString(cipher.doFinal(message.getBytes("UTF-8")));

        // Decrypt Message
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        String decryptedText = new String(cipher.doFinal(Base64.getDecoder().decode(encryptedText)), "UTF-8");
        String decryptedHash = getSHA256(decryptedText);

        System.out.println("Original Message:  " + message);
        System.out.println("Original SHA-256:  " + originalHash);
        System.out.println("AES Encrypted:     " + encryptedText);
        System.out.println("Decrypted Message: " + decryptedText);
        System.out.println("Integrity Verified:" + originalHash.equals(decryptedHash));
    }
}
