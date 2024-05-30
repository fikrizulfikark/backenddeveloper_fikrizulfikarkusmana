package com.backenddevelopertest.fikrizulfikarkusmana;

import java.security.SecureRandom;
import java.util.Base64;

public class KeyGenerator {

    public static void main(String[] args) {
        // Generate a 256-bit (32-byte) secret key
        byte[] secretKey = generateSecretKey(32);

        // Encode the secret key to Base64
        String base64Key = Base64.getEncoder().encodeToString(secretKey);

        // Print the secret key
        System.out.println("YourSecretKeyHere: " + base64Key);
    }

    public static byte[] generateSecretKey(int keyLength) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] key = new byte[keyLength];
        secureRandom.nextBytes(key);
        return key;
    }
}
