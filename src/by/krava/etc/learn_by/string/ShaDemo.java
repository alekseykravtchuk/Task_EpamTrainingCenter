package by.krava.etc.learn_by.string;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Base64;

public class ShaDemo {
    public static void main(String[] args) {
        String unencrypted = "very_Strong_pass7";
        byte [] bytes = null;
        Base64.Encoder encoder = Base64.getEncoder();
        bytes = encoder.encode(unencrypted.getBytes());
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
//            messageDigest.update(unencrypted.getBytes("utf-8"));
//            bytes = messageDigest.digest();
//        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
        BigInteger bigInteger = new BigInteger(1, bytes);
        String encrypted = bigInteger.toString(16);
        System.out.println(encrypted);
        System.out.println(Arrays.toString(bytes));
    }
}
