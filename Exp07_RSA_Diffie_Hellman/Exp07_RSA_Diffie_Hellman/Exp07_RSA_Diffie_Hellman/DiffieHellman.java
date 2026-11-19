import java.math.BigInteger;
import java.security.SecureRandom;

public class DiffieHellman {
    public static void main(String[] args) {
        // Publicly agreed prime (p) and primitive root (g)
        BigInteger p = new BigInteger("23");
        BigInteger g = new BigInteger("5");

        SecureRandom random = new SecureRandom();
        BigInteger a = new BigInteger(4, random).add(BigInteger.ONE); // Alice's private key
        BigInteger b = new BigInteger(4, random).add(BigInteger.ONE); // Bob's private key

        // Calculate public keys: A = g^a mod p, B = g^b mod p
        BigInteger A = g.modPow(a, p);
        BigInteger B = g.modPow(b, p);

        // Exchange public keys and compute shared secret
        BigInteger sharedSecretAlice = B.modPow(a, p);
        BigInteger sharedSecretBob = A.modPow(b, p);

        System.out.println("Public Prime (p): " + p + ", Generator (g): " + g);
        System.out.println("Alice Public Key (A): " + A);
        System.out.println("Bob Public Key (B): " + B);
        System.out.println("Alice Computed Shared Secret: " + sharedSecretAlice);
        System.out.println("Bob Computed Shared Secret:   " + sharedSecretBob);
        System.out.println("Key Exchange Successful: " + sharedSecretAlice.equals(sharedSecretBob));
    }
}
