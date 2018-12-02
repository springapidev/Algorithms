package com.coderbd.imageprocessingex;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author User
 */
public class MyEncrptorDecryptor {

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
        SecretKey myDesKey = keygenerator.generateKey();
        byte[] bytes = "No body can see me.".getBytes("UTF8");

        System.out.println(doEncrypt(myDesKey, bytes));
        System.out.println(doDecrypt(myDesKey, bytes));
    }

    public static String doEncrypt(SecretKey key, byte[] bytes) {
        String s = null;
        try {

            Cipher desCipher = Cipher.getInstance("DES");

            desCipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] textEncrypted = desCipher.doFinal(bytes);

            s = new String(textEncrypted);

        } catch (Exception e) {
            System.out.println("Exception");
        }
        return s;
    }

    public static String doDecrypt(SecretKey key, byte[] bytes) {
        String s = null;
        try {
            Cipher desCipher = Cipher.getInstance("DES");
            desCipher.init(Cipher.DECRYPT_MODE, key);
            byte[] textDecrypted = desCipher.doFinal(bytes);

            s = new String(textDecrypted);
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return s;
    }
}
